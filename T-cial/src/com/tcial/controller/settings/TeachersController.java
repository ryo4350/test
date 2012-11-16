package com.tcial.controller.settings;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TeachersController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/settings/relationship/teachers.vm");
    }
}
