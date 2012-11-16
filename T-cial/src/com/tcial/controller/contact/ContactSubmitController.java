package com.tcial.controller.contact;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.tcial.service.ContactService;

public class ContactSubmitController extends Controller {

    @Override
    public Navigation run() throws Exception {

        ContactService cs = new ContactService();

        cs.set(asString("lastname"),
                asString("firstname"),
                asString("sai"),
                asString("mai"),
                asString("school_category"),
                asString("school_name"),
                asString("grade"),
                asString("postal_code"),
                asString("address"),
                asString("tel"),
                asString("mail"),
                asString("goal"),
                asString("terms"),
                asString("inquiry"),
                asString("problem"),
                asString("strong_weakness"),
                asString("contact_hours"),
                asString("how_know"),
                asString("content"));

        return forward("/contact/contactsubmitted");
    }
}
