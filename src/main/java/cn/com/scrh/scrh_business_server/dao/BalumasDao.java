package cn.com.scrh.scrh_business_server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.scrh.scrh_business_server.mapper.BalumasMapper;
import cn.com.scrh.scrh_business_server.model.balumas.BalumasQualificationModel;
import cn.com.scrh.scrh_business_server.model.balumas.SchoolInfoModel;

/**
 * 校友相关操作Dao
 * 
 * @author xiaguanghua
 *
 */
@Repository
public class BalumasDao {
	/**
	 * 校友相关操作mapper
	 */
	@Autowired
	private BalumasMapper balumasMapper;
	
	/**
	 * 插入校友信息
	 * 
	 * @param balumasQualificationModel 校友认证数据库请求参数映射对象
	 */
	public void balumasQualification(BalumasQualificationModel balumasQualificationModel) {
		balumasMapper.balumasQualification(balumasQualificationModel);
	}
	
	/**
	 * 根据学校名称查询学校id
	 * 
	 * @param schoolName 学校名称
	 * 
	 * @return 学校id
	 */
	public String findSchoolIdBySchoolId(String schoolName) {
		return balumasMapper.findSchoolIdBySchoolId(schoolName);
	}
	
	/**
	 * 新增学校
	 * 
	 * @param schoolInfoModel 学校信息数据库请求参数映射对象
	 */
	public void insertSchoolInfo(SchoolInfoModel schoolInfoModel) {
		balumasMapper.insertSchoolInfo(schoolInfoModel);
	}
}
