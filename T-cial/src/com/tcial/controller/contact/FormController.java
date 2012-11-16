package com.tcial.controller.contact;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class FormController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/contact/form.vm");
    }
}
