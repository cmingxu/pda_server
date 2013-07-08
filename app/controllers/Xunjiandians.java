package controllers;

import models.Xunjiandanmingxi;
import models.Xunjiandian;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Xunjiandians extends Application {
    public static void index(){
        List<Xunjiandian> xunjiandians = Xunjiandian.findAll();
        renderJSON(xunjiandians);
    }
}