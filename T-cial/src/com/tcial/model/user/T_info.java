package com.tcial.model.user;

import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;
import com.tcial.model.BaseModel;
import com.tcial.model.common.Bank_account;
import com.tcial.model.common.Contract_unit;
import com.tcial.model.common.Education;
import com.tcial.model.common.Public_review;
import com.tcial.model.common.Work;

@Model(schemaVersion = 1)
public class T_info extends BaseModel<T_info> {

    private static final long serialVersionUID = 1L;

    // 小学生国語
    @Attribute(unindexed = true)
    private boolean japanese_for_elementary;

    // 小学生算数
    @Attribute(unindexed = true)
    private boolean math_for_elementary;

    // 小学生理科
    @Attribute(unindexed = true)
    private boolean science_for_elementary;

    // 小学生社会
    @Attribute(unindexed = true)
    private boolean society_for_elementary;

    // 中学国語
    @Attribute(unindexed = true)
    private boolean japanese_for_junior_high;

    // 中学数学
    @Attribute(unindexed = true)
    private boolean math_for_junior_high;

    // 中学理科
    @Attribute(unindexed = true)
    private boolean science_for_junior_high;

    // 中学社会
    @Attribute(unindexed = true)
    private boolean society_for_junior_high;

    // 中学英語
    @Attribute(unindexed = true)
    private boolean english_for_junior_high;

    // 高校現代文
    @Attribute(unindexed = true)
    private boolean japanese_for_high;

    // 高校古文
    @Attribute(unindexed = true)
    private boolean classical_literature_for_high;

    // 高校漢文@Attribute(unindexed = true)
    private boolean chinese_classics_for_high;

    // 高校数学Ⅰ・Ａ
    @Attribute(unindexed = true)
    private boolean math1_for_high;

    // 高校数学Ⅱ・Ｂ
    @Attribute(unindexed = true)
    private boolean math2_for_high;

    // 高校数学Ⅲ・Ｃ
    @Attribute(unindexed = true)
    private boolean math3_for_high;

    // 高校化学
    @Attribute(unindexed = true)
    private boolean chemistry_for_high;

    // 高校物理
    @Attribute(unindexed = true)
    private boolean physics_for_high;

    // 高校生物
    @Attribute(unindexed = true)
    private boolean biology_for_high;

    // 高校地学
    @Attribute(unindexed = true)
    private boolean geoscience_for_high;

    // 高校日本史
    @Attribute(unindexed = true)
    private boolean japanese_history_for_high;

    // 高校世界史
    @Attribute(unindexed = true)
    private boolean world_history_for_high;

    // 高校地理
    @Attribute(unindexed = true)
    private boolean geography_for_high;

    // 高校倫理・政治
    @Attribute(unindexed = true)
    private boolean ethics_and_politics_for_high;

    // 高校英語
    @Attribute(unindexed = true)
    private boolean english_for_high;

    // 指導方針
    @Attribute(unindexed = true)
    private String policy;

    // 指導実施方法
    @Attribute(unindexed = true)
    private String how_to_teach;

    // 料金表示
    @Attribute(unindexed = true)
    private String fee;

    // 面談方法
    @Attribute(unindexed = true)
    private String how_to_interview;

    // 学歴
    @Attribute(persistent = false)
    private List<Education> educations;

    // 職歴
    @Attribute(persistent = false)
    private List<Work> works;

    // 公開レビュー
    @Attribute(persistent = false)
    private List<Public_review> public_reviews;

    // 指導方法・料金明示書
    @Attribute(unindexed = true)
    private String lesson_detail;

    // 契約書類
    @Attribute(unindexed = true)
    private String contract_document;

    // 契約単位Keyリスト
    private List<Key> key_contract_units;

    // 契約単位リスト
    @Attribute(persistent = false)
    private List<Contract_unit> contract_units;

    // 銀行口座
    @Attribute(persistent = false)
    private List<Bank_account> bank_account;

	public boolean isJapanese_for_elementary() {
		return japanese_for_elementary;
	}

	public void setJapanese_for_elementary(boolean japanese_for_elementary) {
		this.japanese_for_elementary = japanese_for_elementary;
	}

	public boolean isMath_for_elementary() {
		return math_for_elementary;
	}

	public void setMath_for_elementary(boolean math_for_elementary) {
		this.math_for_elementary = math_for_elementary;
	}

	public boolean isScience_for_elementary() {
		return science_for_elementary;
	}

	public void setScience_for_elementary(boolean science_for_elementary) {
		this.science_for_elementary = science_for_elementary;
	}

	public boolean isSociety_for_elementary() {
		return society_for_elementary;
	}

	public void setSociety_for_elementary(boolean society_for_elementary) {
		this.society_for_elementary = society_for_elementary;
	}

	public boolean isJapanese_for_junior_high() {
		return japanese_for_junior_high;
	}

	public void setJapanese_for_junior_high(boolean japanese_for_junior_high) {
		this.japanese_for_junior_high = japanese_for_junior_high;
	}

	public boolean isMath_for_junior_high() {
		return math_for_junior_high;
	}

	public void setMath_for_junior_high(boolean math_for_junior_high) {
		this.math_for_junior_high = math_for_junior_high;
	}

	public boolean isScience_for_junior_high() {
		return science_for_junior_high;
	}

	public void setScience_for_junior_high(boolean science_for_junior_high) {
		this.science_for_junior_high = science_for_junior_high;
	}

	public boolean isSociety_for_junior_high() {
		return society_for_junior_high;
	}

	public void setSociety_for_junior_high(boolean society_for_junior_high) {
		this.society_for_junior_high = society_for_junior_high;
	}

	public boolean isEnglish_for_junior_high() {
		return english_for_junior_high;
	}

	public void setEnglish_for_junior_high(boolean english_for_junior_high) {
		this.english_for_junior_high = english_for_junior_high;
	}

	public boolean isJapanese_for_high() {
		return japanese_for_high;
	}

	public void setJapanese_for_high(boolean japanese_for_high) {
		this.japanese_for_high = japanese_for_high;
	}

	public boolean isClassical_literature_for_high() {
		return classical_literature_for_high;
	}

	public void setClassical_literature_for_high(
			boolean classical_literature_for_high) {
		this.classical_literature_for_high = classical_literature_for_high;
	}

	public boolean isChinese_classics_for_high() {
		return chinese_classics_for_high;
	}

	public void setChinese_classics_for_high(boolean chinese_classics_for_high) {
		this.chinese_classics_for_high = chinese_classics_for_high;
	}

	public boolean isMath1_for_high() {
		return math1_for_high;
	}

	public void setMath1_for_high(boolean math1_for_high) {
		this.math1_for_high = math1_for_high;
	}

	public boolean isMath2_for_high() {
		return math2_for_high;
	}

	public void setMath2_for_high(boolean math2_for_high) {
		this.math2_for_high = math2_for_high;
	}

	public boolean isMath3_for_high() {
		return math3_for_high;
	}

	public void setMath3_for_high(boolean math3_for_high) {
		this.math3_for_high = math3_for_high;
	}

	public boolean isChemistry_for_high() {
		return chemistry_for_high;
	}

	public void setChemistry_for_high(boolean chemistry_for_high) {
		this.chemistry_for_high = chemistry_for_high;
	}

	public boolean isPhysics_for_high() {
		return physics_for_high;
	}

	public void setPhysics_for_high(boolean physics_for_high) {
		this.physics_for_high = physics_for_high;
	}

	public boolean isBiology_for_high() {
		return biology_for_high;
	}

	public void setBiology_for_high(boolean biology_for_high) {
		this.biology_for_high = biology_for_high;
	}

	public boolean isGeoscience_for_high() {
		return geoscience_for_high;
	}

	public void setGeoscience_for_high(boolean geoscience_for_high) {
		this.geoscience_for_high = geoscience_for_high;
	}

	public boolean isJapanese_history_for_high() {
		return japanese_history_for_high;
	}

	public void setJapanese_history_for_high(boolean japanese_history_for_high) {
		this.japanese_history_for_high = japanese_history_for_high;
	}

	public boolean isWorld_history_for_high() {
		return world_history_for_high;
	}

	public void setWorld_history_for_high(boolean world_history_for_high) {
		this.world_history_for_high = world_history_for_high;
	}

	public boolean isGeography_for_high() {
		return geography_for_high;
	}

	public void setGeography_for_high(boolean geography_for_high) {
		this.geography_for_high = geography_for_high;
	}

	public boolean isEthics_and_politics_for_high() {
		return ethics_and_politics_for_high;
	}

	public void setEthics_and_politics_for_high(boolean ethics_and_politics_for_high) {
		this.ethics_and_politics_for_high = ethics_and_politics_for_high;
	}

	public boolean isEnglish_for_high() {
		return english_for_high;
	}

	public void setEnglish_for_high(boolean english_for_high) {
		this.english_for_high = english_for_high;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getHow_to_teach() {
		return how_to_teach;
	}

	public void setHow_to_teach(String how_to_teach) {
		this.how_to_teach = how_to_teach;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getHow_to_interview() {
		return how_to_interview;
	}

	public void setHow_to_interview(String how_to_interview) {
		this.how_to_interview = how_to_interview;
	}

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public List<Work> getWorks() {
		return works;
	}

	public void setWorks(List<Work> works) {
		this.works = works;
	}

	public List<Public_review> getPublic_reviews() {
		return public_reviews;
	}

	public void setPublic_reviews(List<Public_review> public_reviews) {
		this.public_reviews = public_reviews;
	}

	public String getLesson_detail() {
		return lesson_detail;
	}

	public void setLesson_detail(String lesson_detail) {
		this.lesson_detail = lesson_detail;
	}

	public String getContract_document() {
		return contract_document;
	}

	public void setContract_document(String contract_document) {
		this.contract_document = contract_document;
	}

	public List<Key> getKey_contract_units() {
		return key_contract_units;
	}

	public void setKey_contract_units(List<Key> key_contract_units) {
		this.key_contract_units = key_contract_units;
	}

	public List<Contract_unit> getContract_units() {
		return contract_units;
	}

	public void setContract_units(List<Contract_unit> contract_units) {
		this.contract_units = contract_units;
	}

	public List<Bank_account> getBank_account() {
		return bank_account;
	}

	public void setBank_account(List<Bank_account> bank_account) {
		this.bank_account = bank_account;
	}
}
