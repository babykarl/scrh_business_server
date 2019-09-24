package cn.com.scrh.scrh_business_server.model.company;

import java.time.LocalDateTime;

/**
 * 企业认证数据库请求参数映射对象
 * 
 * @author xiaguanghua
 *
 */
public class CompanyQualificationModel {
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 企业id
	 */
	private String companyId;
	/**
	 * 凭据
	 */
	private String evidence;
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
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
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
