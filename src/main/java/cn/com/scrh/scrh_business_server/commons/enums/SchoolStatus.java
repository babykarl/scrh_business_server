package cn.com.scrh.scrh_business_server.commons.enums;

public enum SchoolStatus {
    /** 可用 */
    USED(1),
    /** 不可用 */
    UNUSED(9);
    
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    private SchoolStatus(Integer status) {
        this.status = status;
    }
}
