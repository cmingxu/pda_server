package controllers;

import models.Xunjiandan;
import models.Xunjiandanmingxi;

import java.text.SimpleDateFormat;
import java.util.Date;
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


    public static void update(){
        System.out.println(params.get("id"));
        System.out.println(params.get("zhiid"));
        System.out.println(params.get("zhi"));
        System.out.println(params.get("xunjianshijian"));
        System.out.println(params.get("biaoshi"));
        System.out.println(params.get("shuoming"));

        Xunjiandanmingxi xunjiandanmingxi = Xunjiandanmingxi.find("id=" + params.get("id")).first();
        xunjiandanmingxi.值 = params.get("zhi");
        xunjiandanmingxi.值id = params.get("zhiid");
            xunjiandanmingxi.巡检时间 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(params.get("xunjianshijian"))));
        xunjiandanmingxi.说明 = params.get("shuoming");
        xunjiandanmingxi.标识 = params.get("biaoshi");
        xunjiandanmingxi.save();


        renderJSON("{}");
    }
}