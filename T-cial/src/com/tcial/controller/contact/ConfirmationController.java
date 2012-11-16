package com.tcial.controller.contact;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ConfirmationController extends Controller {

    @Override
    public Navigation run() throws Exception {
        requestScope("lastname", asString("lastname"));
        requestScope("firstname", asString("firstname"));
        requestScope("sai", asString("sai"));
        requestScope("mai", asString("mai"));
        requestScope("school_category", asString("school_category"));
        requestScope("school_name", asString("school_name"));
        requestScope("grade", asString("grade"));
        requestScope("postal_code", asString("postal_code"));
        requestScope("address", asString("address"));
        requestScope("tel", asString("tel"));
        requestScope("mail", asString("mail"));
        requestScope("goal", asString("goal"));
        requestScope("terms", asString("terms"));
        requestScope("inquiry", asString("inquiry"));
        requestScope("problem", asString("problem"));
        requestScope("strong_weakness", asString("strong_weakness"));
        requestScope("contact_hours", asString("contact_hours"));
        requestScope("how_know", asString("how_know"));
        requestScope("content", asString("content"));

        return forward("/WEB-INF/template/contact/confirmation.vm");
    }
}
