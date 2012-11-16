package com.tcial.service;

import java.util.ConcurrentModificationException;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;
import com.tcial.meta.user.AccountMeta;
import com.tcial.model.user.Account;

public class AccountService {
    private AccountMeta meta = AccountMeta.get();

    public boolean isUniqueId(String id){
    	boolean isUnique;

    	Key key = Datastore.createKey(meta, id);
    	if(Datastore.getOrNull(key) == null){
    		isUnique = true;
    	} else {
    		isUnique = false;
    	}
    	return isUnique;
    }

    public boolean isUniqueMail(String mail){
    	boolean isUnique;

    	Account acc = Datastore.query(meta).filter(meta.mail.equal(mail)).asSingle();
    	if(acc == null){
    		isUnique = true;
    	} else {
    		isUnique = false;
    	}
    	return isUnique;
    }

    public Account regist(String id, String mail, int role, String password){

    	Transaction tx = Datastore.beginTransaction();
    	try {
	    	Account acc = new Account();
	    	Key key = Datastore.createKey(meta, id);

	    	acc.setKey(key);
	    	acc.setId(id);
	    	acc.setMail(mail);
	    	acc.setRole(role);
	    	acc.setPassword(password);

	    	Datastore.put(tx, acc);
	    	tx.commit();
	    	return acc;
	    } catch (ConcurrentModificationException e) {
	        if (tx.isActive()) {
	            tx.rollback();
	        }
	        throw e;
	    }
    }

    public Account login(String param, String password){
    	/*
    	* アカウントやメールが存在しない場合、
    	* またはパスワードと一致しない場合は null を返す。
    	*/
    	Account acc = null;

    	if(!param.contains("@")){
    		Key key = Datastore.createKey(meta, param);
    		acc = Datastore.get(meta, key);
    	} else {
    		acc = Datastore.query(meta).filter(meta.mail.equal(param)).asSingle();
    	}
    	if(acc == null || acc.getPassword().equals(password)){
    		return null;
    	}
    	return acc;
    }
}