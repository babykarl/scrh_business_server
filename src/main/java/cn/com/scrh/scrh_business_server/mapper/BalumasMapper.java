package cn.com.scrh.scrh_business_server.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.com.scrh.scrh_business_server.model.balumas.BalumasQualificationModel;
import cn.com.scrh.scrh_business_server.model.balumas.SchoolInfoModel;

/**
 * 校友相关操作mapper
 * 
 * @author xiaguanghua
 *
 */
public interface BalumasMapper {
	/**
	 * 插入校友信息
	 * 
	 * @param balumasQualificationModel 校友认证数据库请求参数映射对象
	 */
	@Insert({
		"<script>",
			"insert into scrh_balumas(id,user_id,school_id,crt_time,upd_time",
			"<if test='evidence!=null'>, evidence</if>",
			")",
			"values( #{id, jdbcType=VARCHAR}, #{userId, jdbcType=VARCHAR},",
			"#{schoolId, jdbcType=VARCHAR}, #{crtTime, jdbcType=TIMESTAMP},",
			"#{updTime, jdbcType=VARCHAR}",
			"<if test='evidence!=null'>, #{evidence, jdbcType=VARCHAR}</if>",
			")",
		"<script>"
	})
	void balumasQualification(BalumasQualificationModel balumasQualificationModel);
	
	/**
	 * 根据学校名称查询学校id
	 * 
	 * @param schoolName 学校名称
	 * 
	 * @return 学校id
	 */
	@Select({
		"select id from scrh_school_info where name = #{schoolName, jdbcType=VARCHAR}"
	})
	String findSchoolIdBySchoolId(String schoolName);
	
	/**
	 * 新增学校
	 * 
	 * @param schoolInfoModel 学校信息数据库请求参数映射对象
	 */
	@Insert({
		"<script>",
			"insert into scrh_school_info ( id, city_id, name, status, crt_time, upd_time, crt_user_id, upd_user_id",
			"<if test='logo != null'>, logo</if>",
			")",
			"values( #{id, jdbcType=VARCHAR}, #{city_id, jdbcType=VARCHAR}, #{name, jdbcType=VARCHAR},",
			"#{status, jdbcType=INTEGER}, #{crtTime, jdbcType=TIMESTAMP}, #{updTime, jdbcType=TIMESTAMP}, #{userId, jdbcType=VARCHAR}, #{userId, jdbcType=VARCHAR}",
			"<if test='logo != null'>, #{logo, jdbcType=VARCHAR}</if>",
			")",
		"</script>"
	})
	void insertSchoolInfo(SchoolInfoModel schoolInfoModel);
}
