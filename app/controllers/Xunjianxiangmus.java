package controllers;

import models.Xunjiandian;
import models.Xunjianxiangmu;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Xunjianxiangmus extends Application {
    public static void index(){
        List<Xunjianxiangmu> xunjianxiangmus = Xunjianxiangmu.findAll();
        renderJSON(xunjianxiangmus);
    }
}