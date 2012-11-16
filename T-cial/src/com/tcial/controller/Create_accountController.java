package com.tcial.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.tcial.service.AccountService;

public class Create_accountController extends Controller {

	AccountService accSer = new AccountService();

    @Override
    public Navigation run() throws Exception {
    	Navigation nav = null;
    	if(accSer.isUniqueId(asString("id"))){
    		sessionScope("currentUser",
    				accSer.regist(asString("id"), asString("mail"), asInteger("role"), asString("password")));
    		nav = redirect("/dashboard");
    	} else {
    		nav = redirect("/new_id");
    	}
        return nav;
    }
}
