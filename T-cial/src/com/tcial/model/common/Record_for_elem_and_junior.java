package com.tcial.model.common;

import java.util.Date;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Record_for_elem_and_junior extends BaseModel<Record_for_elem_and_junior> {

    private static final long serialVersionUID = 1L;

    // 成績の名前
    private String record_name;

    // 成績の時期
    private Date when;

    // 成績の最大値
    private String max;

    // 国語の成績
    private int japanese;

    // 算数の成績
    private int math;

    // 理科の成績
    private int science;

    // 社会の成績
    private int society;

    // 英語の成績
    private int english;

    // 音楽の成績
    private int music;

    // 体育の成績
    private int physical_education;

    // 図工の成績
    private int arts_and_crafts;

    // 家庭科の成績
    private int homemaking;

	public String getRecord_name() {
		return record_name;
	}

	public void setRecord_name(String record_name) {
		this.record_name = record_name;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public int getJapanese() {
		return japanese;
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSociety() {
		return society;
	}

	public void setSociety(int society) {
		this.society = society;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getPhysical_education() {
		return physical_education;
	}

	public void setPhysical_education(int physical_education) {
		this.physical_education = physical_education;
	}

	public int getArts_and_crafts() {
		return arts_and_crafts;
	}

	public void setArts_and_crafts(int arts_and_crafts) {
		this.arts_and_crafts = arts_and_crafts;
	}

	public int getHomemaking() {
		return homemaking;
	}

	public void setHomemaking(int homemaking) {
		this.homemaking = homemaking;
	}
}
