package com.tcial.model.common;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Class_unit extends BaseModel<Class_unit> {

    private static final long serialVersionUID = 1L;

    // 講師
    private String teacher;

    // 授業開始時間
    private Date start;

    // 授業終了時間
    private Date end;

    // 科目
    private List<Integer> subjects;

    // 単元
    private List<String> teaching_units;

    // レポート
    private String report;

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
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

	public List<Integer> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Integer> subjects) {
		this.subjects = subjects;
	}

	public List<String> getTeaching_units() {
		return teaching_units;
	}

	public void setTeaching_units(List<String> teaching_units) {
		this.teaching_units = teaching_units;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
}
