package com.tcial.model.common;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Relationship extends BaseModel<Relationship> {

    private static final long serialVersionUID = 1L;

    // 被申請者ID
    private String receiver;

    // 申請タイプ（０：友達、１：家族）
    private int application_type;

    // 関係のステータス（０：保留中、１：拒否）
    private int status;

    /**
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param receiver セットする receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * @return application_type
     */
    public int getApplication_type() {
        return application_type;
    }

    /**
     * @param application_type セットする application_type
     */
    public void setApplication_type(int application_type) {
        this.application_type = application_type;
    }

    /**
     * @return status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status セットする status
     */
    public void setStatus(int status) {
        this.status = status;
    }

}
