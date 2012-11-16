package com.tcial.model.common;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Exam_for_elem_and_junior extends BaseModel<Exam_for_elem_and_junior> {

    private static final long serialVersionUID = 1L;

    // 成績の名前
    private String record_name;

    // 成績の時期
    private Date when;

    // 成績の最大値
    private int max;

    // 全体偏差値
    private int whole_deviation;

    // 国語の満点
    private int japanese_max;

    // 国語の点数
    private int japanese_result;

    // 国語の偏差値
    private int japanese_deviation;

    // 算数の満点
    private int math_max;

    // 算数の点数
    private int math_result;

    // 算数の偏差値
    private int math_deviation;

    // 理科の満点
    private int science_max;

    // 理科の点数
    private int science_result;

    // 理科の偏差値
    private int science_deviation;

    // 社会の満点
    private int society_max;

    // 社会の点数
    private int society_result;

    // 社会の偏差値
    private int society_deviation;

    // 英語の満点
    private int english_max;

    // 英語の点数
    private int english_result;

    // 英語の偏差値
    private int english_deviation;

    // 判定リスト
    @Attribute(persistent = false)
    private List<Result> Results;


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

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getWhole_deviation() {
		return whole_deviation;
	}

	public void setWhole_deviation(int whole_deviation) {
		this.whole_deviation = whole_deviation;
	}

	public int getJapanese_max() {
		return japanese_max;
	}

	public void setJapanese_max(int japanese_max) {
		this.japanese_max = japanese_max;
	}

	public int getJapanese_result() {
		return japanese_result;
	}

	public void setJapanese_result(int japanese_result) {
		this.japanese_result = japanese_result;
	}

	public int getJapanese_deviation() {
		return japanese_deviation;
	}

	public void setJapanese_deviation(int japanese_deviation) {
		this.japanese_deviation = japanese_deviation;
	}

	public int getMath_max() {
		return math_max;
	}

	public void setMath_max(int math_max) {
		this.math_max = math_max;
	}

	public int getMath_result() {
		return math_result;
	}

	public void setMath_result(int math_result) {
		this.math_result = math_result;
	}

	public int getMath_deviation() {
		return math_deviation;
	}

	public void setMath_deviation(int math_deviation) {
		this.math_deviation = math_deviation;
	}

	public int getScience_max() {
		return science_max;
	}

	public void setScience_max(int science_max) {
		this.science_max = science_max;
	}

	public int getScience_result() {
		return science_result;
	}

	public void setScience_result(int science_result) {
		this.science_result = science_result;
	}

	public int getScience_deviation() {
		return science_deviation;
	}

	public void setScience_deviation(int science_deviation) {
		this.science_deviation = science_deviation;
	}

	public int getSociety_max() {
		return society_max;
	}

	public void setSociety_max(int society_max) {
		this.society_max = society_max;
	}

	public int getSociety_result() {
		return society_result;
	}

	public void setSociety_result(int society_result) {
		this.society_result = society_result;
	}

	public int getSociety_deviation() {
		return society_deviation;
	}

	public void setSociety_deviation(int society_deviation) {
		this.society_deviation = society_deviation;
	}

	public int getEnglish_max() {
		return english_max;
	}

	public void setEnglish_max(int english_max) {
		this.english_max = english_max;
	}

	public int getEnglish_result() {
		return english_result;
	}

	public void setEnglish_result(int english_result) {
		this.english_result = english_result;
	}

	public int getEnglish_deviation() {
		return english_deviation;
	}

	public void setEnglish_deviation(int english_deviation) {
		this.english_deviation = english_deviation;
	}

	public List<Result> getResults() {
		return Results;
	}

	public void setResults(List<Result> results) {
		Results = results;
	}
}
