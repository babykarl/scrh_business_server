package cn.com.scrh.scrh_business_server.model.house;

import java.util.List;

import cn.com.scrh.scrh_business_server.model.RespData;

/**
 * 普通模式查询房源信息返回参数
 * 
 * @author xiaguanghua
 *
 */
public class NormalHouseInfoResp implements RespData {
	/**
	 * 房源基本信息
	 */
	private List<HouseInfoModelResp> houseInfo;
	/**
	 * 总共多少条
	 */
	private long total;

	public List<HouseInfoModelResp> getHouseInfo() {
		return houseInfo;
	}

	public void setHouseInfo(List<HouseInfoModelResp> houseInfo) {
		this.houseInfo = houseInfo;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public NormalHouseInfoResp(List<HouseInfoModelResp> houseInfo, long total) {
		super();
		this.houseInfo = houseInfo;
		this.total = total;
	}
	
	
}
