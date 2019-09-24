
package cn.com.scrh.scrh_business_server.commons.enums;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年9月1日 下午2:48:31
* 类说明
*/

public enum ErrorMessage {
    /** 未知错误 */
    UNEXPECTED_ERROR("0401", "Unexpected Error"),
    /** 应答结果为空 */
    RESP_RESULT_ISNULL("0402", "Business response data is null"),
    /** 请求参数错误 */
    INVALID_PARAMETER("0403", "Invalid request parameters"),
    /** json转化错误*/
    INVALID_JSON_MSG("0404", "json parse failed"),
    /** 日期转换失败 */
    FORMAT_DATE_ERROR("0405", "date parse error"),
    /** 用户密码错误 */
    PASSWORD_WRONG("0500", "User password incorrect"),
    /** 操作数据库失败 */
    DATABASE_ERROR("0501", "Database error"),
    /** http发送失败 */
    HTTP_SEND_ERROR("0502", "Http send error"),
    /** 调用认证系统失败 */
    CALL_AUTH_SYS_ERROR("0503", "Call auth system error"),
    /** 该业务数据经查询不存在 */
    DATA_NOT_EXIST("0504", "Data does not exist"),
    /** 该业务数据经查询已存在 */
    DATA_HAS_EXIST("0505", "Data exists"),
    /** 数据不在枚举中 */
    ENUM_NOT_EXIST("0506", "This data not exist in Enum"),
    /** 学校新建失败 */
    SCHOOL_CREATE_FAIL("0601", "school create fail"),
    /** 学校新建失败 */
    BALUMAS_QUALIFICATION_FAIL("0602", "balumas qualification fail");
    /** 异常编号 */
    private String code;
    /** 异常描述信息 */
    private String desc;

    ErrorMessage(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}


