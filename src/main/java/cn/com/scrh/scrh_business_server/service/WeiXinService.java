
package cn.com.scrh.scrh_business_server.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.com.scrh.scrh_business_server.commons.Tools;
import cn.com.scrh.scrh_business_server.commons.enums.ErrorMessage;
import cn.com.scrh.scrh_business_server.commons.enums.UserStatus;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;
import cn.com.scrh.scrh_business_server.commons.utils.WeiXinUtil;
import cn.com.scrh.scrh_business_server.dao.WeiXinDao;
import cn.com.scrh.scrh_business_server.model.db.UserInfo;
import cn.com.scrh.scrh_business_server.model.user.UserInfoResp;


/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午3:18:47
* 类说明
*/
@Service
public class WeiXinService {
	
	@Autowired
	private WeiXinDao weiXinDao;
	
    @Value("${scrh.minProgramAppId")
    private String minProgramAppId;

	/**
	 * @param request
	 * @return 
	 * @throws BusinessException 
	 * @throws Exception 
	 */ 
	public UserInfoResp getOpenId(HttpServletRequest request) {
		String code = request.getParameter("code");
		if (code == null) {
			throw new BusinessException(ErrorMessage.INVALID_PARAMETER.getCode(),"code为null");
		}
		String openId = WeiXinUtil.getOpenIdByCode(code);
		if (openId == null) {
			throw new BusinessException(ErrorMessage.INVALID_PARAMETER.getCode(),"open_id为空");
		}
		String id = weiXinDao.selectUserInfoByOpenId(openId);
		if (id == null) {
			try{
				UserInfo userInfo = new UserInfo();
				userInfo.setAppId(minProgramAppId);
				userInfo.setId(Tools.getUUID());
				userInfo.setOpenId(openId);
				userInfo.setStatus(UserStatus.USED.getStatus());
				userInfo.setCrtTime(Tools.getDate());
				userInfo.setUpdTime(Tools.getDate());
				weiXinDao.insertUserInfo(userInfo);
			}catch (Exception e) {
				throw new BusinessException(ErrorMessage.UNEXPECTED_ERROR.getCode(),"用户注册失败");
	
			}
		}
		UserInfoResp userInfoResp = new UserInfoResp();
		userInfoResp.setOpenId(openId);
		return userInfoResp;
	}

}


