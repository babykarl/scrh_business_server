package cn.com.scrh.scrh_business_server.model.weixin;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月12日 下午4:13:03
* 类说明
*/

public class AccessToken {
	private String access_token = null;
	private String expires_in = null;

	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	
}


