package com.tcial.model.user;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class User extends BaseModel<User> {

    private static final long serialVersionUID = 1L;

    // 表示名
    private String pub_name;

    // アイコンURL
    @Attribute(unindexed = true)
    private String icon_url;

    // 姓
    private String last_name;

    // 名
    private String first_name;

    // 名前の公開設定
    @Attribute(unindexed = true)
    private int name_visibility;

    // 性別
    @Attribute(unindexed = true)
    private int sex;

    // 性別の公開設定
    @Attribute(unindexed = true)
    private int sex_visibility;

    // 生年月日
    @Attribute(unindexed = true)
    private Date birthday;

    // 生年月日の公開設定
    @Attribute(unindexed = true)
    private int birthday_visibility;

    // 郵便番号
    @Attribute(unindexed = true)
    private String postal_code;

    // 郵便番号の公開設定
    @Attribute(unindexed = true)
    private int postal_code_visibility;

    // 住所
    @Attribute(unindexed = true)
    private String address;

    // 住所の公開設定
    @Attribute(unindexed = true)
    private int address_visibility;

    // 電話番号１
    @Attribute(unindexed = true)
    private String tel1;

    // 電話番号２
    @Attribute(unindexed = true)
    private String tel2;

    // 電話番号の公開設定
    @Attribute(unindexed = true)
    private int tel_visibility;

    // メール１
    @Attribute(unindexed = true)
    private String mail1;

    // メール２
    @Attribute(unindexed = true)
    private String mail2;

    // メールの公開設定
    @Attribute(unindexed = true)
    private int mail_visiblity;

    // SkypeID
    @Attribute(unindexed = true)
    private String skype_id;

    // Skypeの公開設定
    @Attribute(unindexed = true)
    private int skype_id_visibility;

    // 自己紹介
    @Attribute(unindexed = true)
    private String introduction;

    // 自己紹介の公開設定
    @Attribute(unindexed = true)
    private int introduction_visibility;

    // 家族リスト
    @Attribute(unindexed = true)
    private List<String> family;

    // 家族リストの公開設定
    @Attribute(unindexed = true)
    private int family_visibility;

    // 友達リスト
    @Attribute(unindexed = true)
    private List<String> friends;

    // 友達リストの公開設定
    @Attribute(unindexed = true)
    private int friends_visibility;

    // フィード
    @Attribute(unindexed = true)
    private boolean can_feed;

    // フィードリスト
    @Attribute(unindexed = true)
    private List<String> feeds;

    // フィードリストの公開設定
    @Attribute(unindexed = true)
    private int feeds_visibility;




	public String getPub_name() {
		return pub_name;
	}

	public void setPub_name(String pub_name) {
		this.pub_name = pub_name;
	}

	public String getIcon_url() {
		return icon_url;
	}

	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getName_visibility() {
		return name_visibility;
	}

	public void setName_visibility(int name_visibility) {
		this.name_visibility = name_visibility;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSex_visibility() {
		return sex_visibility;
	}

	public void setSex_visibility(int sex_visibility) {
		this.sex_visibility = sex_visibility;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getBirthday_visibility() {
		return birthday_visibility;
	}

	public void setBirthday_visibility(int birthday_visibility) {
		this.birthday_visibility = birthday_visibility;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public int getPostal_code_visibility() {
		return postal_code_visibility;
	}

	public void setPostal_code_visibility(int postal_code_visibility) {
		this.postal_code_visibility = postal_code_visibility;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAddress_visibility() {
		return address_visibility;
	}

	public void setAddress_visibility(int address_visibility) {
		this.address_visibility = address_visibility;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public int getTel_visibility() {
		return tel_visibility;
	}

	public void setTel_visibility(int tel_visibility) {
		this.tel_visibility = tel_visibility;
	}

	public String getMail1() {
		return mail1;
	}

	public void setMail1(String mail1) {
		this.mail1 = mail1;
	}

	public String getMail2() {
		return mail2;
	}

	public void setMail2(String mail2) {
		this.mail2 = mail2;
	}

	public int getMail_visiblity() {
		return mail_visiblity;
	}

	public void setMail_visiblity(int mail_visiblity) {
		this.mail_visiblity = mail_visiblity;
	}

	public String getSkype_id() {
		return skype_id;
	}

	public void setSkype_id(String skype_id) {
		this.skype_id = skype_id;
	}

	public int getSkype_id_visibility() {
		return skype_id_visibility;
	}

	public void setSkype_id_visibility(int skype_id_visibility) {
		this.skype_id_visibility = skype_id_visibility;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getIntroduction_visibility() {
		return introduction_visibility;
	}

	public void setIntroduction_visibility(int introduction_visibility) {
		this.introduction_visibility = introduction_visibility;
	}

	public List<String> getFamily() {
		return family;
	}

	public void setFamily(List<String> family) {
		this.family = family;
	}

	public int getFamily_visibility() {
		return family_visibility;
	}

	public void setFamily_visibility(int family_visibility) {
		this.family_visibility = family_visibility;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public int getFriends_visibility() {
		return friends_visibility;
	}

	public void setFriends_visibility(int friends_visibility) {
		this.friends_visibility = friends_visibility;
	}

	public boolean isCan_feed() {
		return can_feed;
	}

	public void setCan_feed(boolean can_feed) {
		this.can_feed = can_feed;
	}

	public List<String> getFeeds() {
		return feeds;
	}

	public void setFeeds(List<String> feeds) {
		this.feeds = feeds;
	}

	public int getFeeds_visibility() {
		return feeds_visibility;
	}

	public void setFeeds_visibility(int feeds_visibility) {
		this.feeds_visibility = feeds_visibility;
	}
}
