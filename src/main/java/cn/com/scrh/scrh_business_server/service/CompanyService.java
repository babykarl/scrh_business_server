package cn.com.scrh.scrh_business_server.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.scrh.scrh_business_server.commons.Tools;
import cn.com.scrh.scrh_business_server.commons.enums.CompanyStatus;
import cn.com.scrh.scrh_business_server.commons.enums.ErrorMessage;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;
import cn.com.scrh.scrh_business_server.dao.CompanyDao;
import cn.com.scrh.scrh_business_server.model.company.CompanyInfoModel;
import cn.com.scrh.scrh_business_server.model.company.CompanyQualificationModel;
import cn.com.scrh.scrh_business_server.model.company.CompanyQualificationRequest;

/**
 * 企业相关服务service
 * 
 * @author xiaguanghua
 *
 */
@Service
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;

	/**
	 * 企业认证
	 * 
	 * @param reqBody
	 *            请求参数
	 */
	public void companyQualification(CompanyQualificationRequest reqBody) {
		String companyId = companyDao.findCompanyIdByCompanyName(reqBody.getCompanyName());
		if (companyId == null) {
			try{
				CompanyInfoModel CompanyInfoModel = new CompanyInfoModel();
				CompanyInfoModel.setId(Tools.getUUID());
				CompanyInfoModel.setCityId(reqBody.getCityId());
				CompanyInfoModel.setName(reqBody.getCompanyName());
				CompanyInfoModel.setStatus(CompanyStatus.USED.getStatus());
				CompanyInfoModel.setUserId(reqBody.getUserId());
				CompanyInfoModel.setCrtTime(Tools.getDateTime());
				CompanyInfoModel.setUpdTime(Tools.getDateTime());
				companyDao.insertCompanyInfo(CompanyInfoModel);
			} catch (Exception e) {
				throw new BusinessException(ErrorMessage.COMPANY_CREATE_FAIL.getCode(), "企业创建失败");
			}
		}
		try {
			CompanyQualificationModel companyQualificationModel = new CompanyQualificationModel();
			companyQualificationModel.setId(Tools.getUUID());
			companyQualificationModel.setCompanyId(companyId);
			companyQualificationModel.setUserId(reqBody.getUserId());
			companyQualificationModel.setCrtTime(Tools.getDateTime());
			companyQualificationModel.setUpdTime(Tools.getDateTime());
			companyDao.CompanyQualification(companyQualificationModel);
		} catch (Exception e) {
			throw new BusinessException(ErrorMessage.COMPANY_QUALIFICATION_FAIL.getCode(), "企业认证失败");
		}
	}

}
