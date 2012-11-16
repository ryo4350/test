package com.tcial.model.common;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Public_review extends BaseModel<Public_review> {

    private static final long serialVersionUID = 1L;

    // 評価者
    @Attribute(unindexed = true)
    private String reviewer;

    // 公開設定(講師が内容を確認してから公開するための値)
    private int is_public;

    // レビュー内容
    @Attribute(unindexed = true)
    private String comment;

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public int getIs_public() {
		return is_public;
	}

	public void setIs_public(int is_public) {
		this.is_public = is_public;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
