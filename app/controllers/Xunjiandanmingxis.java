package controllers;

import models.Xunjiandan;
import models.Xunjiandanmingxi;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Xunjiandanmingxis extends Application {
    public static void index(){
        List<Xunjiandanmingxi> xunjiandanmingxis = Xunjiandanmingxi.findAll();
        renderJSON(xunjiandanmingxis);
    }
}