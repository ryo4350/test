package com.tcial.model.common;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Bank_account extends BaseModel<Bank_account> {

    private static final long serialVersionUID = 1L;

    // 銀行名
    private String bank_name;

    // 支店名
    private String branch_name;

    // 預金種別
    @Attribute(unindexed = true)
    private String deposit_type;

    // 口座番号
    @Attribute(unindexed = true)
    private String account_number;

    // 口座名義
    private Date account_holder;

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getDeposit_type() {
		return deposit_type;
	}

	public void setDeposit_type(String deposit_type) {
		this.deposit_type = deposit_type;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public Date getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(Date account_holder) {
		this.account_holder = account_holder;
	}
}
