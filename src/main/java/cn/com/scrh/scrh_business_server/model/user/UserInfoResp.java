
package cn.com.scrh.scrh_business_server.model.user;

import cn.com.scrh.scrh_business_server.model.RespData;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午3:16:59
* 类说明
*/

public class UserInfoResp implements RespData {
	private String openId;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	

}


