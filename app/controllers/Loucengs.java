package controllers;

import models.Louceng;
import models.Louge;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Loucengs extends Application {
    public static void index(){
        List<Louceng> loucengs = Louceng.findAll();
        renderJSON(loucengs);
    }
}