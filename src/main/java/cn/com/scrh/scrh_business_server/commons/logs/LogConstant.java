
package cn.com.scrh.scrh_business_server.commons.logs;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午3:05:00
* 类说明
*/

public final class LogConstant {
    /**
     * 日志类型(Log key)
     */
    public static final String TYPE_KEY = "Type";
    /**
     * 相关信息(Log key)
     */
    public static final String INFO_KEY = "Information";
    /**
     * 业务数据(Log key)
     */
    public static final String DATA_KEY = "Data";
    /**
     * 收到外部REST请求数据(日志类型)
     */
    public static final String RECEIVE_REQUEST_TYPE = "receive REST request";
    /**
     * 对外发送REST响应数据(日志类型)
     */
    public static final String SEND_RESPONSE_TYPE = "send REST response";
    /**
     * 对外发送REST请求的数据(日志类型)
     */
    public static final String SEND_REQUEST_TYPE = "send REST request";
    /**
     * 收到外部的REST响应数据(日志类型)
     */
    public static final String RECEIVE_RESPONSE_TYPE = "receive REST response";
    /**
     * 收到MQ消息(日志类型)
     */
    public static final String RECEIVE_MQ_TYPE = "receive MQ message";
    /**
     * 发送MQ消息(日志类型)
     */
    public static final String SEND_MQ_TYPE = "send MQ message";

    /**
     * 私有的构造函数
     */
    private LogConstant() {
        super();
    }

}


