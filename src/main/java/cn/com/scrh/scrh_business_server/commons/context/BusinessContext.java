
package cn.com.scrh.scrh_business_server.commons.context;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午2:53:26
* 类说明
*/

public class BusinessContext<T extends Serializable> implements Serializable {
	private static final long serialVersionUID = 2312135218241941583L;

	private Map<String, String> header = new HashMap<>();
	private T body;

	/**
	 * 业务标示对应的名称
	 */
	public static final String BIZ_ID_MSG_KEY = "bizId";
	/**
	 * BizContext在json里对应的key
	 */
	public static final String BIZ_CONTEXT_KEY = "bizContext";

	public Map<String, String> getHeader() {
		return header;
	}

	public void setHeader(Map<String, String> header) {
		this.header = header;
	}
	
	public void putHeaderItem(String key, String value) {
		this.header.put(key, value);
	}
	
	public String getHeaderItem(String key) {
		return this.header.get(key);
	}
	
	public void putBizIdToHeader(String bizId) {
		this.putHeaderItem(BIZ_ID_MSG_KEY, bizId);
	}

	
	public @Valid T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}
}


