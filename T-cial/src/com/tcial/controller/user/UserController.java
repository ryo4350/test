package com.tcial.controller.user;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class UserController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/user.vm");
    }
}
