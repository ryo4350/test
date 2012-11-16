package com.tcial.controller;

import org.slim3.controller.Navigation;


public class New_idController extends BaseController {

    @Override
    public Navigation execute() throws Exception {
    	if(requestScope("not_unique") != null){
    		requestScope("not_unique", "既に使用されています。");
    	}
        return forward("/WEB-INF/template/new_id.vm");
    }
}
