package controllers;


import models.Zhuhu;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Zhuhus extends Application {
    public static void index(){
        List<Zhuhu> zhuhus = Zhuhu.findAll();
        renderJSON(zhuhus);
    }
}