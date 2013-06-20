package controllers;

import models.User;
import play.mvc.Controller;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:13
 * To change this template use File | Settings | File Templates.
 */
public class Users extends Application {
    public static void index(){
        List<User> users = User.find("用户组='PDA用户组'").fetch();
        renderJSON(users);
    }
}
