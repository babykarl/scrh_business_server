package cn.com.scrh.scrh_business_server.controller.business;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.scrh.scrh_business_server.commons.Tools;
import cn.com.scrh.scrh_business_server.controller.BaseController;
import cn.com.scrh.scrh_business_server.model.BusinessResultData;
import cn.com.scrh.scrh_business_server.model.company.CompanyQualificationRequest;
import cn.com.scrh.scrh_business_server.service.CompanyService;

/**
 * 企业相关操作服务接口
 * 
 * @author xiaguanghua
 *
 */
@RestController
public class CompanyController extends BaseController {
	/**
	 * 企业相关服务service
	 */
	@Autowired
	private CompanyService companyService;

	/**
	 * 企业认证
	 * 
	 * @param reqBody
	 *            前端请求参数
	 * @param bindingResult
	 *            校验结果
	 * @return 认证结果
	 */
	@RequestMapping(value = "aaa", method = RequestMethod.GET)
	public BusinessResultData companyQualification(@Valid CompanyQualificationRequest reqBody,
			BindingResult bindingResult) {
		logger.info(Tools.getUUID());
		/* 校验请求数据 */
		checkValidation(bindingResult);
		/* 调用服务层 */
		companyService.companyQualification(reqBody);
		BusinessResultData respBody = new BusinessResultData();
		return respBody;
	}
}
