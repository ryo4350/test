package com.tcial.model.common;

import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Result extends BaseModel<Result> {

    private static final long serialVersionUID = 1L;

    // 志望校名
    private String target_school;

    // 判定結果(５段階評価)
    private int possibility;

    // 受験者数
    private int examinee;

    // 順位
    private int rank;

	public String getTarget_school() {
		return target_school;
	}

	public void setTarget_school(String target_school) {
		this.target_school = target_school;
	}

	public int getPossibility() {
		return possibility;
	}

	public void setPossibility(int possibility) {
		this.possibility = possibility;
	}

	public int getExaminee() {
		return examinee;
	}

	public void setExaminee(int examinee) {
		this.examinee = examinee;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
