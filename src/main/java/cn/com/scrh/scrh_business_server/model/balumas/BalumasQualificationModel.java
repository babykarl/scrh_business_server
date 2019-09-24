package cn.com.scrh.scrh_business_server.model.balumas;

import java.time.LocalDateTime;

/**
 * 校友认证
 * 数据库请求参数映射对象
 * 
 * @author xiaguanghua
 *
 */
public class BalumasQualificationModel {
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 证据
	 */
	private String evidence;
	/**
	 * 学校id
	 */
	private String schoolId;
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
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
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
