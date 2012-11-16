package com.tcial.controller;

import org.slim3.controller.Navigation;

public class DashboardController extends BaseAppController {

    @Override
    public Navigation execute() throws Exception {
    	requestScope("currentUser", currentUser);
        return forward("/WEB-INF/template/dashboard.vm");
    }
}
