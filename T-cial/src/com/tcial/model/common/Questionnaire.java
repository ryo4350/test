package com.tcial.model.common;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Questionnaire extends BaseModel<Questionnaire> {

    private static final long serialVersionUID = 1L;

    // 評価者
    @Attribute(unindexed = true)
    private String reviewer;

    // 評価者の役割
    private int is_student;

    // ☆
    private int star;

    // レビュー内容
    @Attribute(unindexed = true)
    private String comment;

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public int getIs_student() {
		return is_student;
	}

	public void setIs_student(int is_student) {
		this.is_student = is_student;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
