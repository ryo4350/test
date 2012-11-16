package com.tcial.controller;

import org.slim3.controller.Navigation;


public class LoginController extends BaseController {

    @Override
    public Navigation execute() throws Exception {
    	if(requestScope("message") != null){
    		requestScope("message", "IDまたはパスワードが違います。");
    	}
        return forward("/WEB-INF/template/login.vm");
    }
}
