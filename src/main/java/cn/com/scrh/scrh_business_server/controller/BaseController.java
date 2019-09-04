
package cn.com.scrh.scrh_business_server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import cn.com.scrh.scrh_business_server.commons.enums.ErrorMessage;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;
import cn.com.scrh.scrh_business_server.commons.logs.BizLogger;
import cn.com.scrh.scrh_business_server.commons.logs.LogConstant;

/**
* @author karl E-mail:1834007615@qq.com 
* @version 创建时间：2019年9月1日 下午2:41:46
* 类说明
*/

public abstract class BaseController {
    /**
     * 输出logback标准日志的对象
     */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 用于输出包含业务流编号和业务格式化日志的对象
     */
    protected BizLogger bizLogger = new BizLogger(this.logger);

    /**
     * 判断是否存在检验未通过
     * 
     * @param result
     *            数据校验结果
     */
    protected void checkValidation(BindingResult result) {
        if (result.hasErrors()) {
            bizLogger.warn("Got exception when validating the parameters in request json.");
            StringBuilder errorMsg = new StringBuilder();
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (int i = 0; i < fieldErrors.size(); i++) {
                String singalErrorMsg = fieldErrors.get(i).getDefaultMessage();
                bizLogger.warn(singalErrorMsg);
                errorMsg.append(singalErrorMsg);
                // 当前信息为最后一条时不添加分隔符
                if (i != fieldErrors.size() - 1) {
                    errorMsg.append("; ");
                }
            }
            throw new BusinessException(ErrorMessage.INVALID_PARAMETER.getCode(), errorMsg.toString());
        }
    }

    /**
     * 接口出入日志输出
     * 
     * @param type
     *            日志类型
     * @param api
     *            调用api
     * @param data
     *            业务数据
     * @param message
     *            业务信息
     */
    protected void restLogger(String type, String api, String data, String message) {
        bizLogger.info(LogConstant.TYPE_KEY, type, LogConstant.INFO_KEY, api, LogConstant.DATA_KEY, data, message);
    }
}


