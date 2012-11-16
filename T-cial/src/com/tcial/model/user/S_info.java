package com.tcial.model.user;

import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

import com.google.appengine.api.datastore.Key;
import com.tcial.model.BaseModel;
import com.tcial.model.common.Contract_unit;
import com.tcial.model.common.Exam_for_elem_and_junior;
import com.tcial.model.common.Exam_for_high;
import com.tcial.model.common.Record_for_elem_and_junior;
import com.tcial.model.common.Record_for_high;
import com.tcial.model.common.Textbook;

@Model(schemaVersion = 1)
public class S_info extends BaseModel<S_info> {

    private static final long serialVersionUID = 1L;

    // 小学校
    private String elementary;

    // 中学校
    private String junior_high;

    // 高校
    private String high;

    // 在籍校
    private String school;

    // 第一志望校
    private String first_choice_school;

    // 教科書リスト
    @Attribute(persistent = false)
    private List<Textbook> textbooks;

    // 小学校の成績
    @Attribute(persistent = false)
    private List<Record_for_elem_and_junior> records_for_elem;

    // 小学校の模試
    @Attribute(persistent = false)
    private List<Exam_for_elem_and_junior> exams_for_elem;

    // 中学校の成績
    @Attribute(persistent = false)
    private List<Record_for_elem_and_junior> records_for_junior;

    // 中学校の模試
    @Attribute(persistent = false)
    private List<Exam_for_elem_and_junior> exams_for_junior;

    // 高校の成績
    @Attribute(persistent = false)
    private List<Record_for_high> records_for_high;

    // 高校の模試
    @Attribute(persistent = false)
    private List<Exam_for_high> exams_for_high;

    // 契約権限者
    private ModelRef<P_info> p_info_ref;

    // 家族アカウント
    private List<String> family;

    // 契約単位Keyリスト
    private List<Key> keys_of_contract;

    // 契約単位リスト
    @Attribute(persistent = false)
    private List<Contract_unit> contract_units;

	public String getElementary() {
		return elementary;
	}

	public void setElementary(String elementary) {
		this.elementary = elementary;
	}

	public String getJunior_high() {
		return junior_high;
	}

	public void setJunior_high(String junior_high) {
		this.junior_high = junior_high;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getFirst_choice_school() {
		return first_choice_school;
	}

	public void setFirst_choice_school(String first_choice_school) {
		this.first_choice_school = first_choice_school;
	}

	public List<Textbook> getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(List<Textbook> textbooks) {
		this.textbooks = textbooks;
	}

	public List<Record_for_elem_and_junior> getRecords_for_elem() {
		return records_for_elem;
	}

	public void setRecords_for_elem(
			List<Record_for_elem_and_junior> records_for_elem) {
		this.records_for_elem = records_for_elem;
	}

	public List<Exam_for_elem_and_junior> getExams_for_elem() {
		return exams_for_elem;
	}

	public void setExams_for_elem(List<Exam_for_elem_and_junior> exams_for_elem) {
		this.exams_for_elem = exams_for_elem;
	}

	public List<Record_for_elem_and_junior> getRecords_for_junior() {
		return records_for_junior;
	}

	public void setRecords_for_junior(
			List<Record_for_elem_and_junior> records_for_junior) {
		this.records_for_junior = records_for_junior;
	}

	public List<Exam_for_elem_and_junior> getExams_for_junior() {
		return exams_for_junior;
	}

	public void setExams_for_junior(List<Exam_for_elem_and_junior> exams_for_junior) {
		this.exams_for_junior = exams_for_junior;
	}

	public List<Record_for_high> getRecords_for_high() {
		return records_for_high;
	}

	public void setRecords_for_high(List<Record_for_high> records_for_high) {
		this.records_for_high = records_for_high;
	}

	public List<Exam_for_high> getExams_for_high() {
		return exams_for_high;
	}

	public void setExams_for_high(List<Exam_for_high> exams_for_high) {
		this.exams_for_high = exams_for_high;
	}

	public ModelRef<P_info> getP_info_ref() {
		return p_info_ref;
	}

	public List<String> getFamily() {
		return family;
	}

	public void setFamily(List<String> family) {
		this.family = family;
	}

	public List<Key> getKeys_of_contract() {
		return keys_of_contract;
	}

	public void setKeys_of_contract(List<Key> keys_of_contract) {
		this.keys_of_contract = keys_of_contract;
	}

	public List<Contract_unit> getContract_units() {
		return contract_units;
	}

	public void setContract_units(List<Contract_unit> contract_units) {
		this.contract_units = contract_units;
	}

}
