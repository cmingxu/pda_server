package controllers;

import models.Xunjiandan;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Xunjiandans extends Application {
    public static void index(){
        List<Xunjiandan> xunjiandans = Xunjiandan.findAll();
        renderJSON(xunjiandans);
    }
}