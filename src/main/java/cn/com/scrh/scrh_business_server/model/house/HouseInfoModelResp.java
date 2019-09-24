package cn.com.scrh.scrh_business_server.model.house;

/**
 * 普通模式查找房源信息
 * 
 * @author xiaguanghua
 *
 */
public class HouseInfoModelResp {
	/**
	 * 房屋发布信息id
	 */
	private String houseId;
	/**
	 * 房屋图片
	 */
	private String pict_url;
	/**
	 * 房屋面积
	 */
	private String area;
	/**
	 * 房屋价格
	 */
	private Integer price;
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
	private Integer bathroomNumber;
	/**
	 * 创建时间
	 */
	private String crtTime;
	/**
	 * 被举报次数
	 */
	private Integer alterTimes;
	/**
	 * 房屋地址
	 */
	private String address;
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getPict_url() {
		return pict_url;
	}
	public void setPict_url(String pict_url) {
		this.pict_url = pict_url;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
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
	public Integer getBathroomNumber() {
		return bathroomNumber;
	}
	public void setBathroomNumber(Integer bathroomNumber) {
		this.bathroomNumber = bathroomNumber;
	}
	public String getCrtTime() {
		return crtTime;
	}
	public void setCrtTime(String crtTime) {
		this.crtTime = crtTime;
	}
	public Integer getAlterTimes() {
		return alterTimes;
	}
	public void setAlterTimes(Integer alterTimes) {
		this.alterTimes = alterTimes;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
