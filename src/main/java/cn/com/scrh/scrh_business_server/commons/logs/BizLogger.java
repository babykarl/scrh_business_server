
package cn.com.scrh.scrh_business_server.commons.logs;

import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.scrh.scrh_business_server.commons.utils.LogUtil;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午2:50:20
* 类说明
*/

public class BizLogger {
	private Logger logger = null;

	public BizLogger(Logger logger) {
		this.logger = logger;
	}

	public BizLogger(Class<?> clazz) {
		logger = LoggerFactory.getLogger(clazz);
	}

	public void trace(String msg) {
		this.logger.trace(LogUtil.formatLogWithBizIdValue(msg));
	}

	public void trace(String msg, Throwable t) {
		this.logger.trace(LogUtil.formatLogWithBizIdValue(msg), t);
	}

	public void trace(String parameterName, String parameterValue, String msg) {
		this.logger.trace(LogUtil.formatLog(parameterName, parameterValue, msg, true));
	}

	public void trace(String parameterName, String parameterValue, String msg, Throwable t) {
		this.logger.trace(LogUtil.formatLog(parameterName, parameterValue, msg, true), t);
	}

	public void trace(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg) {
		this.logger
				.trace(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true));
	}

	public void trace(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg, Throwable t) {
		this.logger.trace(
				LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true), t);
	}

	public void trace(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg) {
		this.logger.trace(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true));
	}

	public void trace(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg, Throwable t) {
		this.logger.trace(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true), t);
	}

	public void trace(LinkedHashMap<String, String> parameter, String msg) {
		this.logger.trace(LogUtil.formatLog(parameter, msg));
	}

	public void trace(LinkedHashMap<String, String> parameter, String msg, Throwable t) {
		this.logger.trace(LogUtil.formatLog(parameter, msg), t);
	}

	public void debug(String msg) {
		this.logger.debug(LogUtil.formatLogWithBizIdValue(msg));
	}

	public void debug(String parameterName, String parameterValue, String msg) {
		this.logger.debug(LogUtil.formatLog(parameterName, parameterValue, msg, true));
	}

	public void debug(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg) {
		this.logger
				.debug(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true));
	}

	public void debug(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg) {
		this.logger.debug(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true));
	}

	public void debug(LinkedHashMap<String, String> parameter, String msg) {
		this.logger.debug(LogUtil.formatLog(parameter, msg));
	}

	public void debug(String msg, Throwable t) {
		this.logger.debug(LogUtil.formatLogWithBizIdValue(msg), t);
	}

	public void debug(String parameterName, String parameterValue, String msg, Throwable t) {
		this.logger.debug(LogUtil.formatLog(parameterName, parameterValue, msg, true), t);
	}

	public void debug(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg, Throwable t) {
		this.logger.debug(
				LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true), t);
	}

	public void debug(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg, Throwable t) {
		this.logger.debug(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true), t);
	}

	public void debug(LinkedHashMap<String, String> parameter, String msg, Throwable t) {
		this.logger.debug(LogUtil.formatLog(parameter, msg), t);
	}

	public void info(String msg) {
		this.logger.info(LogUtil.formatLogWithBizIdValue(msg));
	}

	public void info(String parameterName, String parameterValue, String msg) {
		this.logger.info(LogUtil.formatLog(parameterName, parameterValue, msg, true));
	}

	public void info(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg) {
		this.logger
				.info(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true));
	}

	public void info(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg) {
		this.logger.info(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true));
	}

	public void info(LinkedHashMap<String, String> parameter, String msg) {
		this.logger.info(LogUtil.formatLog(parameter, msg));
	}

	public void info(String msg, Throwable t) {
		this.logger.info(LogUtil.formatLogWithBizIdValue(msg), t);
	}

	public void info(String parameterName, String parameterValue, String msg, Throwable t) {
		this.logger.info(LogUtil.formatLog(parameterName, parameterValue, msg, true), t);
	}

	public void info(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg, Throwable t) {
		this.logger.info(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true),
				t);
	}

	public void info(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg, Throwable t) {
		this.logger.info(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true), t);
	}

	public void info(LinkedHashMap<String, String> parameter, String msg, Throwable t) {
		this.logger.info(LogUtil.formatLog(parameter, msg), t);
	}

	public void warn(String msg) {
		this.logger.warn(LogUtil.formatLogWithBizIdValue(msg));
	}

	public void warn(String parameterName, String parameterValue, String msg) {
		this.logger.warn(LogUtil.formatLog(parameterName, parameterValue, msg, true));
	}

	public void warn(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg) {
		this.logger
				.warn(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true));
	}

	public void warn(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg) {
		this.logger.warn(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true));
	}

	public void warn(LinkedHashMap<String, String> parameter, String msg) {
		this.logger.warn(LogUtil.formatLog(parameter, msg));
	}

	public void warn(String msg, Throwable t) {
		this.logger.warn(LogUtil.formatLogWithBizIdValue(msg), t);
	}

	public void warn(String parameterName, String parameterValue, String msg, Throwable t) {
		this.logger.warn(LogUtil.formatLog(parameterName, parameterValue, msg, true), t);
	}

	public void warn(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg, Throwable t) {
		this.logger.warn(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true),
				t);
	}

	public void warn(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg, Throwable t) {
		this.logger.warn(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true), t);
	}

	public void warn(LinkedHashMap<String, String> parameter, String msg, Throwable t) {
		this.logger.warn(LogUtil.formatLog(parameter, msg), t);
	}

	public void error(String msg) {
		this.logger.error(LogUtil.formatLogWithBizIdValue(msg));
	}

	public void error(String parameterName, String parameterValue, String msg) {
		this.logger.error(LogUtil.formatLog(parameterName, parameterValue, msg, true));
	}

	public void error(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg) {
		this.logger
				.error(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true));
	}

	public void error(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg) {
		this.logger.error(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true));
	}

	public void error(LinkedHashMap<String, String> parameter, String msg) {
		this.logger.error(LogUtil.formatLog(parameter, msg));
	}

	public void error(String msg, Throwable t) {
		this.logger.error(LogUtil.formatLogWithBizIdValue(msg), t);
	}

	public void error(String parameterName, String parameterValue, String msg, Throwable t) {
		this.logger.error(LogUtil.formatLog(parameterName, parameterValue, msg, true), t);
	}

	public void error(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String msg, Throwable t) {
		this.logger.error(
				LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2, msg, true), t);
	}

	public void error(String parameterName1, String parameterValue1, String parameterName2, String parameterValue2,
			String parameterName3, String parameterValue3, String msg, Throwable t) {
		this.logger.error(LogUtil.formatLog(parameterName1, parameterValue1, parameterName2, parameterValue2,
				parameterName3, parameterValue3, msg, true), t);
	}

	public void error(LinkedHashMap<String, String> parameter, String msg, Throwable t) {
		this.logger.error(LogUtil.formatLog(parameter, msg), t);
	}
}


