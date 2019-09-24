package cn.com.scrh.scrh_business_server.model.company;

import java.time.LocalDateTime;

/**
 * 企业信息数据库请求参数映射对象
 * 
 * @author xiaguanghua
 *
 */
public class CompanyInfoModel {
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 城市id
	 */
	private String cityId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * logo
	 */
	private String logo;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private LocalDateTime crtTime;
	/**
	 * 更新时间
	 */
	private LocalDateTime updTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getCrtTime() {
		return crtTime;
	}
	public void setCrtTime(LocalDateTime crtTime) {
		this.crtTime = crtTime;
	}
	public LocalDateTime getUpdTime() {
		return updTime;
	}
	public void setUpdTime(LocalDateTime updTime) {
		this.updTime = updTime;
	}
	
}
