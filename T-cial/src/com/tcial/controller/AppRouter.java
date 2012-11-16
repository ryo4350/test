package com.tcial.controller;

import org.slim3.controller.router.RouterImpl;

public class AppRouter extends RouterImpl {
    public AppRouter() {

        // top
        addRouting("/?$", "/top");

    }
}
