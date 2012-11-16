package com.tcial.model.common;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Comment extends BaseModel<Comment> {

    private static final long serialVersionUID = 1L;

    // コメントした人
    private String commenter_id;

    // コメントの管理者
    private String admin_id;

    // 公開・非公開
    private boolean visibility;

    // コメント内容
    private String body;

	public String getCommenter_id() {
		return commenter_id;
	}

	public void setCommenter_id(String commenter_id) {
		this.commenter_id = commenter_id;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
