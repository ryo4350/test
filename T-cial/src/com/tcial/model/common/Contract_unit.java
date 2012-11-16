package com.tcial.model.common;

import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Contract_unit extends BaseModel<Contract_unit> {

    private static final long serialVersionUID = 1L;

    // 講師のアカウント
    private String teacher;

    // 生徒のアカウント
    private String student;

    // 保護者のアカウント
    private String parent;

    // 現在は有効か無効か
    private String is_valid;

    // 指導方法・指導料金明示書履歴
    @Attribute(persistent = false)
    private List<Lesson_detail> lesson_detail;

    // 契約履歴書
    @Attribute(persistent = false)
    private List<Contract_document> contract_document;

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getIs_valid() {
		return is_valid;
	}

	public void setIs_valid(String is_valid) {
		this.is_valid = is_valid;
	}

	public List<Lesson_detail> getLesson_detail() {
		return lesson_detail;
	}

	public void setLesson_detail(List<Lesson_detail> lesson_detail) {
		this.lesson_detail = lesson_detail;
	}

	public List<Contract_document> getContract_document() {
		return contract_document;
	}

	public void setContract_document(List<Contract_document> contract_document) {
		this.contract_document = contract_document;
	}
}
