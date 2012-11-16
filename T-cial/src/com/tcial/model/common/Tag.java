package com.tcial.model.common;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

import com.tcial.meta.common.User_tagMeta;
import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Tag extends BaseModel<Tag> {

    private static final long serialVersionUID = 1L;

    // タグキーワード
    private String tag;

    // 使用数
    private int use_number;

    // ユーザーと関連させるためのプロパティー
    @Attribute(persistent = false)
    InverseModelListRef<User_tag, Tag> user_tag_ref =
    	new InverseModelListRef<User_tag, Tag>(User_tag.class,
    		User_tagMeta.get().tagRef.getName(), this);


	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getUse_number() {
		return use_number;
	}

	public void setUse_number(int use_number) {
		this.use_number = use_number;
	}

	public InverseModelListRef<User_tag, Tag> getUser_tag_ref() {
		return user_tag_ref;
	}
}
