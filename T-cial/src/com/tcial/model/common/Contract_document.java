package com.tcial.model.common;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Contract_document extends BaseModel<Contract_document> {

    private static final long serialVersionUID = 1L;

    // 契約書類
    private String ContractDocument;

	public String getContractDocument() {
		return ContractDocument;
	}

	public void setContractDocument(String contractDocument) {
		ContractDocument = contractDocument;
	}

}
