package cn.com.scrh.scrh_business_server.commons.enums;

/**
 * 公司状态
 * 
 * @author xiaguanghua
 *
 */
public enum CompanyStatus {
    /** 可用 */
    USED(1),
    /** 不可用 */
    UNUSED(9);
    
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    private CompanyStatus(Integer status) {
        this.status = status;
    }
}
