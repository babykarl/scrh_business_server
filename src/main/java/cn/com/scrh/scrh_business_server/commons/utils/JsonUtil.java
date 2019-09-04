
package cn.com.scrh.scrh_business_server.commons.utils;
import java.io.UnsupportedEncodingException;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午2:58:54
* 类说明
*/
 
public interface JsonUtil {
	public static final String JSON_ENCODING = "UTF-8";
	public static final String JSON_ERROR_MSG = "Json解析异常";

	public static <T> T jsonToObject(String json, Class<T> beanType) {
		try {
			return new ObjectMapper().readValue(json, beanType);
		} catch (Exception e) {
			throw new BusinessException(JSON_ERROR_MSG, e);
		}
	}

	public static String objectToJson(Object bean) {
		try {
			return new ObjectMapper().writeValueAsString(bean);
		} catch (Exception e) {
			throw new BusinessException(JSON_ERROR_MSG, e);
		}
	}

	public static <T> T byteToObject(byte[] jsonByte, Class<?> parametrized, Class<?>... parameterClasses) {
		try {
			String jsonStr = new String(jsonByte, JSON_ENCODING);
			ObjectMapper mapper = new ObjectMapper();
			JavaType jt = mapper.getTypeFactory().constructParametricType(parametrized, parameterClasses);

			return mapper.readValue(jsonStr, jt);
		} catch (Exception e) {
			throw new BusinessException(JSON_ERROR_MSG, e);
		}
	}
 
	public static byte[] objectToByte(Object bean) {
		String jsonStr = JsonUtil.objectToJson(bean);
		try {
			return jsonStr.getBytes(JSON_ENCODING);
		} catch (UnsupportedEncodingException e) {
			throw new BusinessException(JSON_ERROR_MSG, e);
		}
	}

}


