
package cn.com.scrh.scrh_business_server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.scrh.scrh_business_server.mapper.WeiXinMapper;
import cn.com.scrh.scrh_business_server.model.db.UserInfo;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午3:20:09
* 类说明
*/
@Repository
public class WeiXinDao {
	@Autowired
	private WeiXinMapper weiXinMapper;
	/**
	 * @param openId
	 * @return
	 */
	public String selectUserInfoByOpenId(String openId) {
		return weiXinMapper.selectUserInfoByOpenId(openId);
	}

	/**
	 * 创建用户
	 * @param userInfo
	 * @return 
	 */
	public void insertUserInfo(UserInfo userInfo) {
		weiXinMapper.insertUserInfo(userInfo);
	}
}


