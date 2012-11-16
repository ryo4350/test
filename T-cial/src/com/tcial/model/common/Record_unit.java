package com.tcial.model.common;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Record_unit extends BaseModel<Record_unit> {

    private static final long serialVersionUID = 1L;

    // 教科名
    private String subject;

    // 成績
    private int record;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}
}
