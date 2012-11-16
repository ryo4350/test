package com.tcial.model.common;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Note extends BaseModel<Note> {

    private static final long serialVersionUID = 1L;

    // ノートＩＤ
    private Long id;

    // ノートを書いた人
    private String writer;

    // 本文
    private String body;

    /* getter/setter */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
