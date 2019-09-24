package cn.com.scrh.scrh_business_server.model.company;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 企业认证小程序端请求参数
 * 
 * @author xiaguanghua
 *
 */
public class CompanyQualificationRequest {
	/**
	 * 用户id
	 */
    @NotBlank(message = "请重新授权")
    @Pattern(regexp = "^[0-9|a-f|A-F]{32}$", message = "用户id长度等于32的16进制字符串")
	private String userId;
	/**
	 * 企业名称
	 */
    @NotBlank(message = "企业名称不能为空")
    @Pattern(regexp = "^[\u4e00-\u9fa5\\w]{1,64}$", message = "企业名称1~64中文， 数字，英文字母，下划线")
	private String companyName;
	/**
	 * 城市id
	 */
    @NotBlank(message = "请打开定位城市")
    @Pattern(regexp = "^[0-9|a-f|A-F]{32}$", message = "城市d长度等于32的16进制字符串")
	private String cityId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
}
