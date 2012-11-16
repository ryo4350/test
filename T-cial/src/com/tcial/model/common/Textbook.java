package com.tcial.model.common;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Textbook extends BaseModel<Textbook> {

    private static final long serialVersionUID = 1L;

    // 対象学年
    private int target;

    // 教科名
    private int subject;

    // テキスト
    private String text_name;

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	public String getText_name() {
		return text_name;
	}

	public void setText_name(String text_name) {
		this.text_name = text_name;
	}

}
