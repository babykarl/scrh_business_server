package cn.com.scrh.scrh_business_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;

import cn.com.scrh.scrh_business_server.commons.enums.ErrorMessage;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;
import cn.com.scrh.scrh_business_server.dao.HouseDao;
import cn.com.scrh.scrh_business_server.model.house.HouseInfoModel;
import cn.com.scrh.scrh_business_server.model.house.HouseInfoModelResp;
import cn.com.scrh.scrh_business_server.model.house.NormalHouseInfoReq;
import cn.com.scrh.scrh_business_server.model.house.NormalHouseInfoResp;

/**
 * 房源信息相关操作
 * 
 * @author xiaguanghua
 *
 */
@Service
public class HouseService {
	/**
	 * 房源dao相关操作
	 */
	@Autowired
	private HouseDao houseDao;

	/**
	 * 普通模式查找房源
	 * 
	 * @param reqBody
	 *            查找条件
	 * @return 查找结果
	 */
	public NormalHouseInfoResp findNormalHouseInfo(NormalHouseInfoReq reqBody) {
		Integer pageNum = Integer.parseInt(reqBody.getPageNum());
		Integer pageSize = Integer.parseInt(reqBody.getPageSize());
		HouseInfoModel houseInfoModel = new HouseInfoModel();
		houseInfoModel.setUserId(reqBody.getUserId());
		houseInfoModel.setCityId(reqBody.getCityId());
		houseInfoModel.setMetroId(reqBody.getMetroId());
		houseInfoModel.setDistrictId(reqBody.getDistrictId());
		if (reqBody.getMinPrice() != null) {
			houseInfoModel.setMinPrice(Integer.parseInt(reqBody.getMinPrice()));
		}
		if (reqBody.getMaxPrice() != null) {
			houseInfoModel.setMaxPrice(Integer.parseInt(reqBody.getMaxPrice()));
		}
		if (reqBody.getFullRent() != null) {
			houseInfoModel.setFullRent(Integer.parseInt(reqBody.getFullRent()));
		}
		if (reqBody.getContenancy() != null) {
			houseInfoModel.setContenancy(Integer.parseInt(reqBody.getContenancy()));
		}
		if (reqBody.getRoomNumber() != null) {
			houseInfoModel.setRoomNumber(Integer.parseInt(reqBody.getRoomNumber()));
		}
		if (reqBody.getSaloonNumber() != null) {
			houseInfoModel.setSaloonNumber(Integer.parseInt(reqBody.getSaloonNumber()));
		}
		if (reqBody.getBathRoomNumber() != null) {
			houseInfoModel.setBathRoomNumber(Integer.parseInt(reqBody.getBathRoomNumber()));
		}
		if (reqBody.getResidencePermit() != null) {
			houseInfoModel.setResidencePermit(Integer.parseInt(reqBody.getResidencePermit()));
		}
		houseInfoModel.setPublishRole(Integer.parseInt(reqBody.getPublishRole()));
		Page<HouseInfoModelResp> page = null;
		page = (Page<HouseInfoModelResp>) houseDao.findNormalHouseInfo(houseInfoModel, pageNum, pageSize);
		if (page.size() == 0) {
			throw new BusinessException(ErrorMessage.DATA_NOT_EXIST.getCode(), "没有查到可用的房源");
		}
		return new NormalHouseInfoResp(page.getResult(), page.getTotal());
	}

}
