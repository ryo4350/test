package com.tcial.model.common;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Education extends BaseModel<Education> {

    private static final long serialVersionUID = 1L;

    // 雇用主体
    private String school;

    // 場所
    private String location;

    // 学校の種類
    @Attribute(unindexed = true)
    private String type;

    // 学んだこと
    @Attribute(unindexed = true)
    private String description;

    // 開始時期
    private Date start_date;

    // 終了時期
    private Date end_date;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
}
