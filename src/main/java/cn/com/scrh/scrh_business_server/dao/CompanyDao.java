package cn.com.scrh.scrh_business_server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.scrh.scrh_business_server.mapper.CompanyMapper;
import cn.com.scrh.scrh_business_server.model.company.CompanyInfoModel;
import cn.com.scrh.scrh_business_server.model.company.CompanyQualificationModel;

/**
 * 企业相关操作dao
 * 
 * @author xiaguanghua
 *
 */
@Repository
public class CompanyDao {
	/**
	 * 企业相关操作mapper
	 */
	@Autowired
	private CompanyMapper companyMapper;

	/**
	 * 根据名称查找公司id
	 * 
	 * @param companyName
	 *            公司名称
	 * @return 公司id
	 */
	public String findCompanyIdByCompanyName(String companyName) {
		return companyMapper.findCompanyIdByCompanyName(companyName);
	}

	/**
	 * 创建企业
	 * 
	 * @param companyInfoModel
	 */
	public void insertCompanyInfo(CompanyInfoModel companyInfoModel) {
		companyMapper.insertCompanyInfo(companyInfoModel);
	}

	/**
	 * 企业认证
	 * 
	 * @param companyQualificationModel
	 *            企业认证请求参数
	 */
	public void CompanyQualification(CompanyQualificationModel companyQualificationModel) {
		companyMapper.CompanyQualification(companyQualificationModel);
	}

}
