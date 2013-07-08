package controllers;

import models.Xunjianxiangmu;
import models.Xunjianzhi;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Xunjianzhis extends Application {
    public static void index(){
        List<Xunjianzhi> xunjianzhis = Xunjianzhi.findAll();
        renderJSON(xunjianzhis);
    }
}