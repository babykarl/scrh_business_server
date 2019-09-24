package cn.com.scrh.scrh_business_server.model.house;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 普通模式下查询房屋信息请求参数
 * 
 * @author xiaguanghua
 *
 */
public class NormalHouseInfoReq {
	/**
	 * 用户id
	 */
    @NotBlank(message = "用户id为空")
    @Pattern(regexp = "^[0-9|a-f|A-F]{32}$", message = "用户id长度等于32的16进制字符串")
	private String userId;
	/**
	 * 城市id
	 */
    @NotBlank(message = "城市id为空")
    @Pattern(regexp = "^[0-9|a-f|A-F]{32}$", message = "城市id长度等于32的16进制字符串")
	private String cityId;
	/**
	 * 地铁id
	 */
    @Pattern(regexp = "^[0-9|a-f|A-F]{32}$", message = "地铁id长度等于32的16进制字符串")
	private String metroId;
	/**
	 * 地区id
	 */
    @Pattern(regexp = "^[0-9|a-f|A-F]{32}$", message = "地区id长度等于32的16进制字符串")
	private String districtId;
	/**
	 * 最小价格
	 */
    @Pattern(regexp = "^[0-9]{0,7}$", message = "最小价格长度最大为7位的数字组成")
	private String minPrice;
	/**
	 * 最大价格
	 */
    @Pattern(regexp = "^[0-9]{0,7}$", message = "最大价格长度最大为7位的数字组成")
	private String maxPrice;
	/**
	 * 整租
	 */
	@Pattern(regexp = "^[0|1]{1}$", message = "整租只能为0，1，9")
	private String fullRent;
	/**
	 * 合租
	 */
	@Pattern(regexp = "^[0|1]{1}$", message = "合租只能为0，1，9")
	private String contenancy;
	/**
	 * 几室
	 */
	@Pattern(regexp = "^[0-9]{1}$", message = "由1位数字组成")
	private String roomNumber;
	/**
	 * 几厅
	 */
	@Pattern(regexp = "^[0-9]{1}$", message = "由1位数字组成")
	private String saloonNumber;
	/**
	 * 几卫
	 */
	@Pattern(regexp = "^[0-9]{1}$", message = "由1位数字组成")
	private String bathRoomNumber;
	/**
	 * 是否可以办理居住证
	 */
	@Pattern(regexp = "^[0|1|9]{1}$", message = "只能为0，1，9")
	private String residencePermit;
	
    /** 分页查询：页码 */
    @NotNull(message = "页码为空，前端未传输该值")
    @Min(value = -2147483648, message = "超过int类型的最小值")
    @Max(value = 2147483647, message = "超出int类型最大值")
    @Pattern(regexp = "^[0-9]+$", message = "分页pageNum格式错误，只能由数字组成")
    private String pageNum;

    /** 分页查询：每页大小 */
    @NotNull(message = "每页数量为空，前端未传输该值")
    @Min(value = -2147483648, message = "超出int类型的最小值")
    @Max(value = 2147483647, message = "超出int类型最大值")
    @Pattern(regexp = "^[0-9]+$", message = "分页pageSize格式错误，只能由数字组成")
    private String pageSize;
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

	public String getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}
	public String getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getFullRent() {
		return fullRent;
	}
	public void setFullRent(String fullRent) {
		this.fullRent = fullRent;
	}
	public String getContenancy() {
		return contenancy;
	}
	public void setContenancy(String contenancy) {
		this.contenancy = contenancy;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getSaloonNumber() {
		return saloonNumber;
	}
	public void setSaloonNumber(String saloonNumber) {
		this.saloonNumber = saloonNumber;
	}
	public String getBathRoomNumber() {
		return bathRoomNumber;
	}
	public void setBathRoomNumber(String bathRoomNumber) {
		this.bathRoomNumber = bathRoomNumber;
	}
	public String getResidencePermit() {
		return residencePermit;
	}
	public void setResidencePermit(String residencePermit) {
		this.residencePermit = residencePermit;
	}
	public String getPageNum() {
		return pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
}
