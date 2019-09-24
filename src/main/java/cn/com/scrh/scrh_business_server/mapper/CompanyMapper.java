package cn.com.scrh.scrh_business_server.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.com.scrh.scrh_business_server.model.company.CompanyInfoModel;
import cn.com.scrh.scrh_business_server.model.company.CompanyQualificationModel;

/**
 * 企业信息相关操作mapper
 * 
 * @author xiaguanghua
 *
 */
public interface CompanyMapper {

	/**
	 * 企业认证
	 * 
	 * @param companyQualificationModel
	 *            企业认证数据库请求参数映射对象
	 */
	@Insert({ "<script>", "insert into scrh_staff_info(id, user_id, company_id, crt_time, upd_time",
			"<if test='evidence!=null'>, evidence</if>", ")",
			"values(#{id, jdbcType=VARCHAR}, #{userId, jdbcType=VARCHAR}, #{companyId, jdbcType=VARCHAR},",
			"#{crtTime, jdbcType=TIMESTAMP}, #{updTime, jdbcType=TIMESTAMP}",
			"<if test='evidence!=null'>, #{evidence, jdbcType=VARCHAR}</if>", ")", "</script>"

	})
	void CompanyQualification(CompanyQualificationModel companyQualificationModel);

	/**
	 * 根据公司名称查找公司id
	 * 
	 * @param companyName
	 *            公司名称
	 * @return 公司id
	 */
	@Select({
		"select id from scrh_staff_info where name = #{companyName, jdbcType=VARCHAR}"
	})
	String findCompanyIdByCompanyName(String companyName);
	
	/**
	 * 新建企业信息
	 * 
	 * @param companyInfoModel 企业信息映射对象
	 */
	@Insert({
		"<script>",
			"insert into scrh_company_info (id, city_id, name, status, crt_time, upd_time, crt_user_id, upd_user_id",
			"<if test='logo!=null'>, logo</if>",
			")",
			"values(#{id, jdbcType=VARCHAR}, #{cityId, jdbcType=VARCHAR}, #{name, jdbcType=VARCHAR}, #{status, jdbcType=INTEGER}",
			",#{crtTime, jdbcType=TIMESTAMP},#{updTime, jdbcType=TIMESTAMP},#{userId, jdbcType=VARCHAR}, #{userId, jdbcType=VARCHAR}",
			"<if test='logo!=null'>, #{logo, jdbcType=VARCHAR}</if>",
			")",
	})
	void insertCompanyInfo(CompanyInfoModel companyInfoModel);
}
