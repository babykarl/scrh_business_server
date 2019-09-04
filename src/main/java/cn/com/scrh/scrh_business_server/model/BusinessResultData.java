
package cn.com.scrh.scrh_business_server.model;

import cn.com.scrh.scrh_business_server.commons.Constant;
import cn.com.scrh.scrh_business_server.commons.exception.BusinessException;

/**
 * controller接口返回参数
 * 
 * @author xiaguanghua
 *
 */
public class BusinessResultData {
    /** 返回状态码 */
    private String respCode;
    /** 返回状态码描述 */
    private String respDesc;
    /** 返回信息 */
    private RespData respData;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public RespData getRespData() {
        return respData;
    }

    public void setRespData(RespData respData) {
        this.respData = respData;
    }

    public BusinessResultData(String respCode, String respDesc, RespData respData) {
        super();
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.respData = respData;
    }
    
    public BusinessResultData(BusinessException e) {
        super();
        this.respCode = e.getCode();
        this.respDesc = e.getMessage();
        this.respData = null;
    }

    public BusinessResultData() {
        super();
        this.respCode = Constant.SUCCESS;
        this.respDesc = Constant.NOTIFY_SUCCESS;
        this.respData = null;
    }

}


