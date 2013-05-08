package controllers;

import play.*;
import play.mvc.*;

import java.io.IOException;
import java.util.*;

import models.*;

public class Application extends Controller {
    private static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private static final String REALM = "Basic realm=\"Your Realm Here\"";

    @Before
    public static void logRequest(){
       Logger.debug(request.method + "::" + request.url);
    }

//    @Before
    public static void login_required(){
        String[] credString = null;
        String authHeader;
            authHeader = request.headers.get("AUTHENTICATION").value();



        String auth = authHeader.substring(6);
        byte[] decodedAuth = new byte[0];
        try {
            decodedAuth = new sun.misc.BASE64Decoder().decodeBuffer(auth);
            credString = new String(decodedAuth, "UTF-8").split(":");

        } catch (IOException e) {
            noauth();
        }

        if (credString == null || credString.length != 2) {
            noauth();
        }

        String username = credString[0];
        String password = credString[1];
        User authUser = User.authenticate(username, password);

        if (authUser == null){
            noauth();
        }

    }


    private static void noauth(){
        response.setHeader(WWW_AUTHENTICATE, REALM);
        error(401, "Unauthorized");

    }

    public static void index() {
        render();
    }

}