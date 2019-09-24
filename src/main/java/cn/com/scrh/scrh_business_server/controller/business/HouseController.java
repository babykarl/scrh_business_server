
package cn.com.scrh.scrh_business_server.controller.business;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.scrh.scrh_business_server.commons.Constant;
import cn.com.scrh.scrh_business_server.commons.Tools;
import cn.com.scrh.scrh_business_server.controller.BaseController;
import cn.com.scrh.scrh_business_server.model.BusinessResultData;
import cn.com.scrh.scrh_business_server.model.house.NormalHouseInfoReq;
import cn.com.scrh.scrh_business_server.model.house.NormalHouseInfoResp;
import cn.com.scrh.scrh_business_server.service.HouseService;

/**
 * @author karl E-mail:1834007615@qq.com
 * @version 创建时间：2019年9月1日 下午4:11:56 类说明
 */
@RestController
public class HouseController extends BaseController {
	private final static Logger logger = LoggerFactory.getLogger(BalumasController.class);

	@Autowired
	private HouseService houseService;

	/**
	 * 普通模式下查找房源
	 * 
	 * @param reqBody
	 *            查找条件
	 * @param bindingResult
	 *            校验结果
	 * @return 查找结果
	 */
	@RequestMapping(value = "aaa", method = RequestMethod.GET)
	public BusinessResultData findNormalHouseInfo(@Valid NormalHouseInfoReq reqBody, BindingResult bindingResult) {
		logger.info(Tools.getUUID());
		/* 校验请求数据 */
		checkValidation(bindingResult);
		/* 调用服务层 */
		NormalHouseInfoResp houseInfoResp = houseService.findNormalHouseInfo(reqBody);
		BusinessResultData respBody = new BusinessResultData(Constant.SUCCESS, Constant.NOTIFY_SUCCESS, houseInfoResp);
		return respBody;
	}
}
