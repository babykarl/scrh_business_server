package cn.com.scrh.scrh_business_server.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;

import cn.com.scrh.scrh_business_server.mapper.HouseMapper;
import cn.com.scrh.scrh_business_server.model.house.HouseInfoModel;
import cn.com.scrh.scrh_business_server.model.house.HouseInfoModelResp;

/**
 * 房源信息相关操作dao
 * 
 * @author xiaguanghua
 *
 */
@Repository
public class HouseDao {
	/**
	 * 房源信息mapper
	 */
	@Autowired
	private HouseMapper houseMapper;

	/**
	 * 普通模式下查找房源信息
	 * 
	 * @param houseInfoModel
	 *            查询条件
	 * @param pageNum
	 *            从第几页开始
	 * @param pageSize
	 *            每页有多少条数据
	 * @return 房源信息
	 */
	public List<HouseInfoModelResp> findNormalHouseInfo(HouseInfoModel houseInfoModel, Integer pageNum,
			Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return houseMapper.selectNormalHouseInfo(houseInfoModel);
	}

}
