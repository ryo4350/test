package com.tcial.controller.contract;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class CreateController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/contract/create.vm");
    }
}
