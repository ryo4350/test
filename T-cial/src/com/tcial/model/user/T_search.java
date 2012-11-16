package com.tcial.model.user;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class T_search extends BaseModel<T_search> {

    private static final long serialVersionUID = 1L;

    // 表示名
    private String pub_name;

    // アイコンURL
    @Attribute(unindexed = true)
    private String icon_url;

    //アカウントID
    private String id;

    // 表示住所
    private String pub_address;

    // レビュー
    private Long review;

    // 指導経験人数
    private int experience;

    // 生年月日
    private Date birthday;

    // プロフィール完成度
    private int profile_percentage;

    // 時間当たり指導料
    private Long fee_per_houer;

    // 指導場所提供
    private boolean have_class_location;

    // 性別
    private boolean sex;

    // 出身中学
    private String junior_high_school;

    // 出身高校
    private String high_school;

    // 出身大学
    private String university;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPub_address() {
		return pub_address;
	}

	public void setPub_address(String pub_address) {
		this.pub_address = pub_address;
	}

	public Long getReview() {
		return review;
	}

	public void setReview(Long review) {
		this.review = review;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getProfile_percentage() {
		return profile_percentage;
	}

	public void setProfile_percentage(int profile_percentage) {
		this.profile_percentage = profile_percentage;
	}

	public Long getFee_per_houer() {
		return fee_per_houer;
	}

	public void setFee_per_houer(Long fee_per_houer) {
		this.fee_per_houer = fee_per_houer;
	}

	public boolean isHave_class_location() {
		return have_class_location;
	}

	public void setHave_class_location(boolean have_class_location) {
		this.have_class_location = have_class_location;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getJunior_high_school() {
		return junior_high_school;
	}

	public void setJunior_high_school(String junior_high_school) {
		this.junior_high_school = junior_high_school;
	}

	public String getHigh_school() {
		return high_school;
	}

	public void setHigh_school(String high_school) {
		this.high_school = high_school;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

}
