package com.tcial.model.common;

import java.util.Date;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Exam_for_high extends BaseModel<Exam_for_high> {

    private static final long serialVersionUID = 1L;

    // 成績の名前
    private String record_name;

    // 成績の時期
    private Date when;

    // 高校英語の満点
    private int english_max;

    // 高校英語の点数
    private int english_result;

    // 高校英語の偏差値
    private int english_deviation;

    // 高校現代文の満点
    private int japanese_max;

    // 高校現代文の点数
    private int japanese_result;

    // 高校現代文の偏差値
    private int japanese_deviation;

    // 高校古文の満点
    private int classical_literature_max;

    // 高校古文の点数
    private int classical_literature_result;

    // 高校古文の偏差値
    private int classical_literature_deviation;

    // 高校漢文の満点
    private int chinese_classics_max;

    // 高校漢文の点数
    private int chinese_classics_result;

    // 高校漢文の偏差値
    private int chinese_classics_deviation;

    // 高校数学Ｉ・Ａの満点
    private int math1_max;

    // 高校数学Ｉ・Ａの点数
    private int math1_result;

    // 高校数学Ｉ・Ａの偏差値
    private int math1_deviation;

    // 高校数学Ⅱ・Ｂの満点
    private int math2_max;

    // 高校数学Ⅱ・Ｂの点数
    private int math2_result;

    // 高校数学Ⅱ・Ｂの偏差値
    private int math2_deviation;

    // 高校数学Ⅲ・Ｃの満点
    private int math3_max;

    // 高校数学Ⅲ・Ｃの点数
    private int math3_result;

    // 高校数学Ⅲ・Ｃの偏差値
    private int math3_deviation;

    // 高校化学の満点
    private int chemistry_max;

    // 高校化学の点数
    private int chemistry_result;

    // 高校化学の偏差値
    private int chemistry_deviation;

    // 高校物理の満点
    private int physics_max;

    // 高校物理の点数
    private int physics_result;

    // 高校物理の偏差値
    private int physics_deviation;

    // 高校生物の満点
    private int biology_max;

    // 高校生物の点数
    private int biology_result;

    // 高校生物の偏差値
    private int biology_deviation;

    // 高校地学の満点
    private int geoscience_max;

    // 高校地学の点数
    private int geoscience_result;

    // 高校地学の偏差値
    private int geoscience_deviation;

    // 高校日本史の満点
    private int japanese_history_max;

    // 高校日本史の点数
    private int japanese_history_result;

    // 高校日本史の偏差値
    private int japanese_history_deviation;

    // 高校世界史の満点
    private int world_history_max;

    // 高校世界史の点数
    private int world_history_result;

    // 高校世界史の偏差値
    private int world_history_deviation;

    // 高校地理の満点
    private int geography_max;

    // 高校地理の点数
    private int geography_result;

    // 高校地理の偏差値
    private int geography_deviation;

    // 高校倫理・政治の満点
    private int ethics_and_politics_max;

    // 高校倫理・政治の点数
    private int ethics_and_politics_result;

    // 高校倫理・政治の偏差値
    private int ethics_and_politics_deviation;

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

	public int getClassical_literature_max() {
		return classical_literature_max;
	}

	public void setClassical_literature_max(int classical_literature_max) {
		this.classical_literature_max = classical_literature_max;
	}

	public int getClassical_literature_result() {
		return classical_literature_result;
	}

	public void setClassical_literature_result(int classical_literature_result) {
		this.classical_literature_result = classical_literature_result;
	}

	public int getClassical_literature_deviation() {
		return classical_literature_deviation;
	}

	public void setClassical_literature_deviation(int classical_literature_deviation) {
		this.classical_literature_deviation = classical_literature_deviation;
	}

	public int getChinese_classics_max() {
		return chinese_classics_max;
	}

	public void setChinese_classics_max(int chinese_classics_max) {
		this.chinese_classics_max = chinese_classics_max;
	}

	public int getChinese_classics_result() {
		return chinese_classics_result;
	}

	public void setChinese_classics_result(int chinese_classics_result) {
		this.chinese_classics_result = chinese_classics_result;
	}

	public int getChinese_classics_deviation() {
		return chinese_classics_deviation;
	}

	public void setChinese_classics_deviation(int chinese_classics_deviation) {
		this.chinese_classics_deviation = chinese_classics_deviation;
	}

	public int getMath1_max() {
		return math1_max;
	}

	public void setMath1_max(int math1_max) {
		this.math1_max = math1_max;
	}

	public int getMath1_result() {
		return math1_result;
	}

	public void setMath1_result(int math1_result) {
		this.math1_result = math1_result;
	}

	public int getMath1_deviation() {
		return math1_deviation;
	}

	public void setMath1_deviation(int math1_deviation) {
		this.math1_deviation = math1_deviation;
	}

	public int getMath2_max() {
		return math2_max;
	}

	public void setMath2_max(int math2_max) {
		this.math2_max = math2_max;
	}

	public int getMath2_result() {
		return math2_result;
	}

	public void setMath2_result(int math2_result) {
		this.math2_result = math2_result;
	}

	public int getMath2_deviation() {
		return math2_deviation;
	}

	public void setMath2_deviation(int math2_deviation) {
		this.math2_deviation = math2_deviation;
	}

	public int getMath3_max() {
		return math3_max;
	}

	public void setMath3_max(int math3_max) {
		this.math3_max = math3_max;
	}

	public int getMath3_result() {
		return math3_result;
	}

	public void setMath3_result(int math3_result) {
		this.math3_result = math3_result;
	}

	public int getMath3_deviation() {
		return math3_deviation;
	}

	public void setMath3_deviation(int math3_deviation) {
		this.math3_deviation = math3_deviation;
	}

	public int getChemistry_max() {
		return chemistry_max;
	}

	public void setChemistry_max(int chemistry_max) {
		this.chemistry_max = chemistry_max;
	}

	public int getChemistry_result() {
		return chemistry_result;
	}

	public void setChemistry_result(int chemistry_result) {
		this.chemistry_result = chemistry_result;
	}

	public int getChemistry_deviation() {
		return chemistry_deviation;
	}

	public void setChemistry_deviation(int chemistry_deviation) {
		this.chemistry_deviation = chemistry_deviation;
	}

	public int getPhysics_max() {
		return physics_max;
	}

	public void setPhysics_max(int physics_max) {
		this.physics_max = physics_max;
	}

	public int getPhysics_result() {
		return physics_result;
	}

	public void setPhysics_result(int physics_result) {
		this.physics_result = physics_result;
	}

	public int getPhysics_deviation() {
		return physics_deviation;
	}

	public void setPhysics_deviation(int physics_deviation) {
		this.physics_deviation = physics_deviation;
	}

	public int getBiology_max() {
		return biology_max;
	}

	public void setBiology_max(int biology_max) {
		this.biology_max = biology_max;
	}

	public int getBiology_result() {
		return biology_result;
	}

	public void setBiology_result(int biology_result) {
		this.biology_result = biology_result;
	}

	public int getBiology_deviation() {
		return biology_deviation;
	}

	public void setBiology_deviation(int biology_deviation) {
		this.biology_deviation = biology_deviation;
	}

	public int getGeoscience_max() {
		return geoscience_max;
	}

	public void setGeoscience_max(int geoscience_max) {
		this.geoscience_max = geoscience_max;
	}

	public int getGeoscience_result() {
		return geoscience_result;
	}

	public void setGeoscience_result(int geoscience_result) {
		this.geoscience_result = geoscience_result;
	}

	public int getGeoscience_deviation() {
		return geoscience_deviation;
	}

	public void setGeoscience_deviation(int geoscience_deviation) {
		this.geoscience_deviation = geoscience_deviation;
	}

	public int getJapanese_history_max() {
		return japanese_history_max;
	}

	public void setJapanese_history_max(int japanese_history_max) {
		this.japanese_history_max = japanese_history_max;
	}

	public int getJapanese_history_result() {
		return japanese_history_result;
	}

	public void setJapanese_history_result(int japanese_history_result) {
		this.japanese_history_result = japanese_history_result;
	}

	public int getJapanese_history_deviation() {
		return japanese_history_deviation;
	}

	public void setJapanese_history_deviation(int japanese_history_deviation) {
		this.japanese_history_deviation = japanese_history_deviation;
	}

	public int getWorld_history_max() {
		return world_history_max;
	}

	public void setWorld_history_max(int world_history_max) {
		this.world_history_max = world_history_max;
	}

	public int getWorld_history_result() {
		return world_history_result;
	}

	public void setWorld_history_result(int world_history_result) {
		this.world_history_result = world_history_result;
	}

	public int getWorld_history_deviation() {
		return world_history_deviation;
	}

	public void setWorld_history_deviation(int world_history_deviation) {
		this.world_history_deviation = world_history_deviation;
	}

	public int getGeography_max() {
		return geography_max;
	}

	public void setGeography_max(int geography_max) {
		this.geography_max = geography_max;
	}

	public int getGeography_result() {
		return geography_result;
	}

	public void setGeography_result(int geography_result) {
		this.geography_result = geography_result;
	}

	public int getGeography_deviation() {
		return geography_deviation;
	}

	public void setGeography_deviation(int geography_deviation) {
		this.geography_deviation = geography_deviation;
	}

	public int getEthics_and_politics_max() {
		return ethics_and_politics_max;
	}

	public void setEthics_and_politics_max(int ethics_and_politics_max) {
		this.ethics_and_politics_max = ethics_and_politics_max;
	}

	public int getEthics_and_politics_result() {
		return ethics_and_politics_result;
	}

	public void setEthics_and_politics_result(int ethics_and_politics_result) {
		this.ethics_and_politics_result = ethics_and_politics_result;
	}

	public int getEthics_and_politics_deviation() {
		return ethics_and_politics_deviation;
	}

	public void setEthics_and_politics_deviation(int ethics_and_politics_deviation) {
		this.ethics_and_politics_deviation = ethics_and_politics_deviation;
	}
}
