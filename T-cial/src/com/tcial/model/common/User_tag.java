package com.tcial.model.common;

import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

import com.tcial.model.BaseModel;
import com.tcial.model.user.User_for_tag;

@Model(schemaVersion = 1)
public class User_tag extends BaseModel<User_tag> {

    private static final long serialVersionUID = 1L;

    // UserInfoへの参照
    private ModelRef<User_for_tag> userForTagRef = new ModelRef<User_for_tag>(User_for_tag.class);

    // Tagへの参照
    private ModelRef<Tag> tagRef = new ModelRef<Tag>(Tag.class);


	public ModelRef<User_for_tag> getUserForTagRef() {
		return userForTagRef;
	}

	public ModelRef<Tag> getTagRef() {
		return tagRef;
	}

}
