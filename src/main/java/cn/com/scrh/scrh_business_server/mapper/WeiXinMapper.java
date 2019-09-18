
package cn.com.scrh.scrh_business_server.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.com.scrh.scrh_business_server.model.db.UserInfo;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午3:21:19
* 类说明
*/
public interface WeiXinMapper {

	/**
	 * @param openId
	 * 
	 * @return
	 */
	@Select({
		"select id from prcrh_user_info where open_id = #{openId, jdbcType=VARCHAR}"
	})
	String selectUserInfoByOpenId(String openId);

	/**
	 * @param userInfo
	 * @return
	 */
	@Insert({
		"insert into prcrh_user_info(id,open_id,app_id,status,crt_time,upd_time)",
		"values(#{id, jdbcType=VARCHAR},#{openId, jdbcType=VARCHAR},#{appId, jdbcType=VARCHAR},#{status, jdbcType=INTEGER},#{crtTime,jdbcType=DATE,javaType=Date},#{updTime,jdbcType=DATE,javaType=Date})"
	})
	Integer insertUserInfo(UserInfo userInfo);

}


