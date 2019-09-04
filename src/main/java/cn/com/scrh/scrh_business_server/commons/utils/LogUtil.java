package cn.com.scrh.scrh_business_server.commons.utils;

import java.util.LinkedHashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import cn.com.scrh.scrh_business_server.commons.context.BusinessContext;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;

public class LogUtil {
	public static final String MSG_KEY = "msg";
	/**
	 * 敏感数据的前缀，如果一个业务数据为敏感数据，在日志输出时其key必须以此值为前缀
	 */
	public static final String SENSITIVE_DATA_PREFIX = "sdp_";
	public static final String SENSITIVE_DATA_VALUE = "********";

	private static final ThreadLocal<String> BIZ_ID_VALUE = new ThreadLocal<>();

	private LogUtil() {
		super();
	}
	
	/**
	 * 从业务上下文里获取bizId的值并在当前线程里存储，被当前线程下的其他任何方法使用
	 * @param bizContext
	 */
	@SuppressWarnings("rawtypes")
	public static void putValueOfBizIdFromBizContext(BusinessContext bizContext) {
		BIZ_ID_VALUE.set((String) bizContext.getHeader().get(BusinessContext.BIZ_ID_MSG_KEY));
	}
	
	/**
	 * 把bizId的值放到BusinessContext的头里，并在当前线程里存储，被当前线程下的其他任何方法使用
	 * @param bizContext
	 * @param bizId
	 */
	@SuppressWarnings("rawtypes")
	public static void putValueOfBizIdFromBizContext(BusinessContext bizContext, String bizId) {
		bizContext.putBizIdToHeader(bizId);
		BIZ_ID_VALUE.set(bizId);
	}
	
	/**
	 * 从包含BusinessContext的json数据里获取bizId的值并在当前线程里存储，被当前线程下的其他任何方法使用.bizId在BusinessContext的header里。
	 * @param json BusinessContext对象对应的json格式数据
	 */
	@SuppressWarnings("rawtypes")
	public static void putValueOfBizIdFromJson(String json) {
		ObjectMapper om = new ObjectMapper();
		try {
			BusinessContext bc = om.readValue(json, BusinessContext.class);
			String bizValue = (String) bc.getHeader().get(BusinessContext.BIZ_ID_MSG_KEY);
			putValueOfBizId(bizValue);
			
		} catch (Exception e) {
			throw new BusinessException("", "从json里解析bizId失败", e);
		}
		
	}

	/**
	 * 把bizId的值在当前线程里存储，被当前线程下的其他任何方法使用
	 * 
	 * @param value
	 *            bizId对应的值
	 */
	public static void putValueOfBizId(String value) {
		BIZ_ID_VALUE.set(value);
	}

	/**
	 * 得到当前线程里bizId的值
	 * 
	 * @return
	 */
	public static String getValueOfBizId() {
		return BIZ_ID_VALUE.get();
	}

	/**
	 * 把业务参数和日志的消息放在一起并格式成一个json格式的消息内容
	 * 
	 * @param parameterName
	 *            业务参数的名称
	 * @param parameterValue
	 *            业务参数的内容
	 * @param message
	 *            日志消息
	 * @param withBizId
	 *            格式的消息是否包含参数bizId
	 * @return 格式化后的消息，如果parameterKey和parameterValue为空，直接返回message的值
	 */
	public static String formatLog(String parameterName, String parameterValue, String message, boolean withBizId) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		if (withBizId) {
			map.put(BusinessContext.BIZ_ID_MSG_KEY, getValueOfBizId());
		}
		if (parameterName != null && parameterName.length() > 0 && parameterValue != null
				&& parameterValue.length() > 0) {
			map.put(parameterName, parameterValue);
		}
		
		return formatLog(map, message);
	}

	public static String formatLog(String parameterName1, String parameterValue1, String parameterName2,
			String parameterValue2, String message, boolean withBizId) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		if (withBizId) {
			map.put(BusinessContext.BIZ_ID_MSG_KEY, getValueOfBizId());
		}
		if (parameterName1 != null && parameterName1.length() > 0 && parameterValue1 != null
				&& parameterValue1.length() > 0) {
			map.put(parameterName1, parameterValue1);
		}
		if (parameterName2 != null && parameterName2.length() > 0 && parameterValue2 != null
				&& parameterValue2.length() > 0) {
			map.put(parameterName2, parameterValue2);
		}
		
		return formatLog(map, message);
	}

	public static String formatLog(String parameterName1, String parameterValue1, String parameterName2,
			String parameterValue2, String parameterName3, String parameterValue3, String message, boolean withBizId) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		if (withBizId) {
			map.put(BusinessContext.BIZ_ID_MSG_KEY, getValueOfBizId());
		}
		if (parameterName1 != null && parameterName1.length() > 0 && parameterValue1 != null
				&& parameterValue1.length() > 0) {
			map.put(parameterName1, parameterValue1);
		}
		if (parameterName2 != null && parameterName2.length() > 0 && parameterValue2 != null
				&& parameterValue2.length() > 0) {
			map.put(parameterName2, parameterValue2);
		}
		if (parameterName3 != null && parameterName3.length() > 0 && parameterValue3 != null
				&& parameterValue3.length() > 0) {
			map.put(parameterName3, parameterValue3);
		}
		
		return formatLog(map, message);
	}

	/**
	 * 格式化包括bizId参数的日志消息
	 * 
	 * @param bizIdValue
	 *            参数bizId的内容
	 * @param message
	 *            日志消息
	 * @return 格式化后的消息，如果bizIdValue为空，直接返回message的值
	 */
	public static String formatLogWithBizId(String bizIdValue, String message) {
		return formatLog(BusinessContext.BIZ_ID_MSG_KEY, bizIdValue, message, false);
	}

	/**
	 * 从当前线程获取bizId的值并格式化
	 * 
	 * @param message
	 *            日志消息
	 * @return 格式化后的消息，如果当前线程里没有bizId的值，直接返回message的值
	 */
	public static String formatLogWithBizIdValue(String message) {
		return formatLogWithBizId(getValueOfBizId(), message);
	}

	/**
	 * 把业务参数和日志的消息放在一起并格式成一个json格式的消息内容
	 * 
	 * @param parameter
	 *            多个业务参数，map的key为业务参数的名称，value为业务参数的内容
	 * @param message
	 *            message 日志消息
	 * @return 格式化后的消息，如果parameter为空，直接返回message的值
	 */
	public static String formatLog(LinkedHashMap<String, String> parameter, String message) {
		if (parameter != null && parameter.size() > 0) {
			parameter.put(MSG_KEY, message);
			return JsonUtil.objectToJson(parameter);
		} else {
			return message;
		}
	}

}
