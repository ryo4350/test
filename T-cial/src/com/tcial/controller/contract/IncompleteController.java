package com.tcial.controller.contract;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IncompleteController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/contract/incomplete.vm");
    }
}
