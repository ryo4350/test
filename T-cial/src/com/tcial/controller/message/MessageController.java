package com.tcial.controller.message;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class MessageController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/message/message.vm");
    }
}
