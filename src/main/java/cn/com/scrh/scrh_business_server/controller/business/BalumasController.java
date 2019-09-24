
package cn.com.scrh.scrh_business_server.controller.business;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.scrh.scrh_business_server.commons.Constant;
import cn.com.scrh.scrh_business_server.commons.Tools;
import cn.com.scrh.scrh_business_server.controller.BaseController;
import cn.com.scrh.scrh_business_server.model.BusinessResultData;
import cn.com.scrh.scrh_business_server.model.balumas.BalumasQualificationRequest;
import cn.com.scrh.scrh_business_server.model.balumas.BalumasRequest;
import cn.com.scrh.scrh_business_server.model.balumas.BalumasResp;
import cn.com.scrh.scrh_business_server.service.BalumasService;

/**
 * 校友相关信息操作
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午4:11:38
* 类说明
*/

@RestController
public class BalumasController extends BaseController {
	
	private final static Logger logger = LoggerFactory.getLogger(BalumasController.class);
	
	@Autowired
	private BalumasService balumasService;
	
	/**
	 * 校友认证
	 * @param reqBody 请求参数
	 * @param bindingResult 校验结果
	 * @return 认证结果
	 */
	@RequestMapping(value = "aaa", method = RequestMethod.GET)
	public BusinessResultData balumasQualification(@Valid BalumasQualificationRequest reqBody, BindingResult bindingResult){
		logger.info(Tools.getUUID());
        /* 校验请求数据 */
        checkValidation(bindingResult);
        /* 调用服务层 */
        balumasService.balumasQualification(reqBody);
        BusinessResultData respBody = new BusinessResultData();
		return respBody;
	}

}


