package com.tcial.model.common;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Contract_schedule extends BaseModel<Contract_schedule> {

    private static final long serialVersionUID = 1L;

    // 科目
    private List<Integer> subjects;

    // 授業開始時間
    private Date start;

    // 授業終了時間
    private Date end;

	public List<Integer> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Integer> subjects) {
		this.subjects = subjects;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
}
