
package cn.com.scrh.scrh_business_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.scrh.scrh_business_server.commons.Tools;
import cn.com.scrh.scrh_business_server.commons.enums.ErrorMessage;
import cn.com.scrh.scrh_business_server.commons.enums.SchoolStatus;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;
import cn.com.scrh.scrh_business_server.dao.BalumasDao;
import cn.com.scrh.scrh_business_server.model.balumas.BalumasQualificationModel;
import cn.com.scrh.scrh_business_server.model.balumas.BalumasQualificationRequest;
import cn.com.scrh.scrh_business_server.model.balumas.SchoolInfoModel;

/**
 * 校友相关操作service
 * 
 * @author karl E-mail:1834007615@qq.com
 * @version 创建时间：2019年9月1日 下午4:14:45 类说明
 */
@Service
public class BalumasService {
	/**
	 * 校友相关操作dao
	 * 
	 */
	@Autowired
	private BalumasDao balumasDao;

	/**
	 * 校友认证
	 * 
	 * @param reqBody
	 *            认证请求参数
	 */
	public void balumasQualification(BalumasQualificationRequest reqBody) {
		String schoolId = balumasDao.findSchoolIdBySchoolId(reqBody.getSchoolName());
		if (schoolId == null) {
			try {
				SchoolInfoModel schoolInfoModel = new SchoolInfoModel();
				schoolInfoModel.setId(Tools.getUUID());
				schoolInfoModel.setCityId(reqBody.getCityId());
				schoolInfoModel.setName(reqBody.getSchoolName());
				schoolInfoModel.setUserId(reqBody.getUserId());
				schoolInfoModel.setStatus(SchoolStatus.USED.getStatus());
				schoolInfoModel.setCrtTime(Tools.getDateTime());
				schoolInfoModel.setUpdTime(Tools.getDateTime());
				balumasDao.insertSchoolInfo(schoolInfoModel);
			} catch (Exception e) {
				throw new BusinessException(ErrorMessage.SCHOOL_CREATE_FAIL.getCode(), "新建学校失败");
			}
		}
		try {
			BalumasQualificationModel balumasQualificationModel = new BalumasQualificationModel();
			balumasQualificationModel.setId(Tools.getUUID());
			balumasQualificationModel.setUserId(reqBody.getUserId());
			balumasQualificationModel.setSchoolId(schoolId);
			balumasQualificationModel.setCrtTime(Tools.getDateTime());
			balumasQualificationModel.setUpdTime(Tools.getDateTime());
			balumasDao.balumasQualification(balumasQualificationModel);
		} catch (Exception e) {
			throw new BusinessException(ErrorMessage.BALUMAS_QUALIFICATION_FAIL.getCode(), "校友认证失败");
		}
	}

}
