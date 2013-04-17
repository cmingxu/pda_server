package controllers;

import models.Louge;
import models.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Louges extends Application {
    public static void index(){
        List<Louge> louges = Louge.findAll();
        renderJSON(louges);
    }
}
