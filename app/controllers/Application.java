package controllers;

import play.*;
import play.mvc.*;

import java.io.IOException;
import java.util.*;

import models.*;

public class Application extends Controller {
    public static String current_user;
    public static String image_dir = "C:\\\\attachments" + "\\";

    @Before
    public static void logRequest(){
       Logger.debug(request.method + "::" + request.url);
    }

    @Before
    public static void get_user(){
        System.out.println("int get_user");
        if (request.headers.get("authorization") != null) {

            System.out.println(request.headers.get("authorization").value());
            Logger.debug(request.headers.get("authorization").value());
            String authorization = request.headers.get("authorization").values.get(0);
            System.out.println("authorization" + authorization);
            current_user = authorization.split(":")[0];
            System.out.println( current_user);
        }
        if(current_user == null){
            current_user = "";
            Logger.debug(current_user);
        }
        System.out.println("current user is "  + current_user);
    }


    private static void noauth(){
        error(401, "Unauthorized");

    }


    public static void index() {
        render();
    }

}