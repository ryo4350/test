package com.tcial.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.tcial.service.AccountService;

public class New_accountController extends Controller {

	AccountService accSer = new AccountService();

    @Override
    public Navigation run() throws Exception {
    	Navigation nav;

    	if(accSer.isUniqueId(asString("id"))){
            requestScope("id", asString("id"));
            nav = forward("/WEB-INF/template/new_account.vm");
    	} else {
    		requestScope("not_unique", "既に使用されています。");
    		nav = redirect("/new_id");
    	}

        return nav;
    }
}
