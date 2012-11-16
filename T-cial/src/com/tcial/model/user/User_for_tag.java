package com.tcial.model.user;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

import com.tcial.meta.common.User_tagMeta;
import com.tcial.model.BaseModel;
import com.tcial.model.common.User_tag;

@Model(schemaVersion = 1)
public class User_for_tag extends BaseModel<User_for_tag> {

    private static final long serialVersionUID = 1L;

    // 表示名
    private String pub_name;

    // アイコンURL
    @Attribute(unindexed = true)
    private String icon_url;

    // タグと関連させるためのプロパティ
    @Attribute(persistent = false)
    InverseModelListRef<User_tag, User_for_tag> userTagRef =
    	new InverseModelListRef<User_tag, User_for_tag>(User_tag.class,
    		User_tagMeta.get().userForTagRef.getName(), this);

	public String getPub_name() {
		return pub_name;
	}

	public void setPub_name(String Pub_name) {
		this.pub_name = Pub_name;
	}

	public String getIcon_url() {
		return icon_url;
	}

	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}

	public InverseModelListRef<User_tag, User_for_tag> getUserTagRef() {
		return userTagRef;
	}
}
