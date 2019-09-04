
package cn.com.scrh.scrh_business_server.controller.business;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.scrh.scrh_business_server.commons.Constant;
import cn.com.scrh.scrh_business_server.controller.BaseController;
import cn.com.scrh.scrh_business_server.model.BusinessResultData;
import cn.com.scrh.scrh_business_server.model.user.UserInfoResp;
import cn.com.scrh.scrh_business_server.service.WeiXinService;



/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午3:10:16
* 类说明
*/

@Controller
public class WeiXinController extends BaseController {

	@Autowired
	private WeiXinService weiXinService;
	
	/**
	 * 用户登录
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/login.action")
	public BusinessResultData weiXinLogin(HttpServletRequest request,HttpServletResponse response){
		
		UserInfoResp userInfoResp = weiXinService.getOpenId(request);
		BusinessResultData respBody = new BusinessResultData(Constant.SUCCESS, Constant.NOTIFY_SUCCESS, userInfoResp);
		return respBody;
	}
	
	
	
}




