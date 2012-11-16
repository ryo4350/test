package com.tcial.model.common;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Record_for_high extends BaseModel<Record_for_high> {

    private static final long serialVersionUID = 1L;

    // 成績の名前
    private String record_name;

    // 成績の時期
    private Date when;

    // 成績の最大値
    private String max;

    // 教科リスト
    @Attribute(persistent = false)
    private List<Record_unit> record_list;

	public String getRecord_name() {
		return record_name;
	}

	public void setRecord_name(String record_name) {
		this.record_name = record_name;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public List<Record_unit> getRecord_list() {
		return record_list;
	}

	public void setRecord_list(List<Record_unit> record_list) {
		this.record_list = record_list;
	}
}
