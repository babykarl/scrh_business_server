package cn.com.scrh.scrh_business_server.model.balumas;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 校友认证前端请求参数
 * 
 * @author xiaguanghua
 *
 */
public class BalumasQualificationRequest {
	/**
	 * 用户id
	 */
    @NotBlank(message = "请重新授权")
    @Pattern(regexp = "^[0-9|a-f|A-F]{32}$", message = "用户id长度等于32的16进制字符串")
	private String userId;
	
	/**
	 * 学校名称
	 */
    @NotBlank(message = "学校名称不能为空")
    @Pattern(regexp = "^[\u4e00-\u9fa5\\w]{1,64}$", message = "商户名称1~64中文， 数字，英文字母，下划线")
	private String schoolName;
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
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
}
