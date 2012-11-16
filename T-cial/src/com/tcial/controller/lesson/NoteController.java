package com.tcial.controller.lesson;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class NoteController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/lesson/note.vm");
    }
}
