package controllers;

import play.*;
import play.mvc.*;

import java.io.IOException;
import java.util.*;

import models.*;

public class Application extends Controller {
    public static String current_user;

    @Before
    public static void logRequest(){
       Logger.debug(request.method + "::" + request.url);
    }

    @Before
    public static void get_user(){
        if (request.headers.get("authorization") != null) {

            Logger.debug(request.headers.get("authorization").value());
            String authorization = request.headers.get("authorization").values.get(0);
            current_user = authorization.split(":")[0];
            if(current_user != null){
            Logger.debug(current_user);
            }
        }
    }


    private static void noauth(){
        error(401, "Unauthorized");

    }


    public static void index() {
        render();
    }

}