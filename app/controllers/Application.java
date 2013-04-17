package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    @Before
    public static void logRequest(){
       Logger.debug(request.method + "::" + request.url);
    }
    public static void index() {
        render();
    }

}