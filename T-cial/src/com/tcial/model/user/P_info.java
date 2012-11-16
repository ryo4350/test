package com.tcial.model.user;

import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;
import com.tcial.meta.user.S_infoMeta;
import com.tcial.model.BaseModel;
import com.tcial.model.common.Contract_unit;

@Model(schemaVersion = 1)
public class P_info extends BaseModel<P_info> {

    private static final long serialVersionUID = 1L;

    // 生徒のp_info_refからの逆参照
    @Attribute(persistent = false)
    private InverseModelListRef<S_info, P_info> student_inverse_ref =
    		new InverseModelListRef<S_info, P_info>(S_info.class,
    				S_infoMeta.get().p_info_ref.getName(), this);

    // 家族アカウント
    private List<String> family;

    // 契約単位Keyリスト
    private List<Key> keys_of_contract;

    // 契約単位リスト
    @Attribute(persistent = false)
    private List<Contract_unit> contract_units;

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

	public InverseModelListRef<S_info, P_info> getStudent_inverse_ref() {
		return student_inverse_ref;
	}

}
