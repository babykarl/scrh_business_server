package cn.com.scrh.scrh_business_server.model.house;

/**
 * 普通模式查询房屋基本信息
 * 
 * @author xiaguanghua
 *
 */
public class HouseInfoModel {
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 城市id
	 */
	private String cityId;
	/**
	 * 地铁id
	 */
	private String metroId;
	/**
	 * 地区id
	 */
	private String districtId;
	/**
	 * 最小价格
	 */
	private Integer minPrice;
	/**
	 * 最大价格
	 */
	private Integer maxPrice;
	/**
	 * 整租
	 */
	private Integer fullRent;
	/**
	 * 合租
	 */
	private Integer contenancy;
	/**
	 * 几室
	 */
	private Integer roomNumber;
	/**
	 * 几厅
	 */
	private Integer saloonNumber;
	/**
	 * 几卫
	 */
	private Integer bathRoomNumber;
	/**
	 * 是否可以办理居住证
	 */
	private Integer residencePermit;
	/**
	 * 发布角色1：转租人2：房东3：其它
	 */
	private Integer publishRole;
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
	public String getMetroId() {
		return metroId;
	}
	public void setMetroId(String metroId) {
		this.metroId = metroId;
	}
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public Integer getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}
	public Integer getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Integer getFullRent() {
		return fullRent;
	}
	public void setFullRent(Integer fullRent) {
		this.fullRent = fullRent;
	}
	public Integer getContenancy() {
		return contenancy;
	}
	public void setContenancy(Integer contenancy) {
		this.contenancy = contenancy;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Integer getSaloonNumber() {
		return saloonNumber;
	}
	public void setSaloonNumber(Integer saloonNumber) {
		this.saloonNumber = saloonNumber;
	}
	public Integer getBathRoomNumber() {
		return bathRoomNumber;
	}
	public void setBathRoomNumber(Integer bathRoomNumber) {
		this.bathRoomNumber = bathRoomNumber;
	}
	public Integer getResidencePermit() {
		return residencePermit;
	}
	public void setResidencePermit(Integer residencePermit) {
		this.residencePermit = residencePermit;
	}
	public Integer getPublishRole() {
		return publishRole;
	}
	public void setPublishRole(Integer publishRole) {
		this.publishRole = publishRole;
	}
	
}
