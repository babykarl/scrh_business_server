
package cn.com.scrh.scrh_business_server.commons.context;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午2:43:33
* 类说明
*/

public class BusinessResult {
	private static final long serialVersionUID = 5089850559112918464L;
	private String result;
	private String message;

	public BusinessResult(String result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public BusinessResult() {
		super();
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}


