package cn.com.scrh.scrh_business_server.model.balumas;

import java.time.LocalDateTime;

/**
 * 学校信息插入数据库请求参数
 * 
 * @author xiaguanghua
 *
 */
public class SchoolInfoModel {
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 城市id
	 */
	private String cityId;
	/**
	 * 学校名称
	 */
	private String name;
	/**
	 * 学校logo
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
	
	/**
	 * 用户id指创建人与更新人
	 */
	private String userId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
