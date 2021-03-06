package controllers;

import models.Xunjiandan;

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
public class Xunjiandans extends Application {
    public static void index(){
        System.out.println(params.get("before"));

        String nowString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(Xunjiandan.find("是否完成=0 and (计划起始时间 < '" + params.get("before") + "' and 计划起始时间 > '" + nowString +
                "') and 巡检人='" + current_user + "'").sq);
        List<Xunjiandan> xunjiandans = Xunjiandan.find("是否完成=0 and (计划起始时间 < '" + params.get("before") + "' and 计划起始时间 > '" + nowString +
                "') and 巡检人='" + current_user + "'").fetch();
//        List<Xunjiandan> xunjiandans = Xunjiandan.find("是否完成=0 and 计划起始时间 < '" + params.get("before") + "'").fetch();

        renderJSON(xunjiandans);
    }

    public static void update(){
        System.out.println(params.get("id"));
        System.out.println(params.get("minTime"));
        System.out.println(params.get("maxTime"));

       Xunjiandan xunjiandan = Xunjiandan.find("id=" + params.get("id")).first();
        xunjiandan.巡检终止时间 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(params.get("maxTime"))));
        xunjiandan.巡检起始时间 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(params.get("minTime"))));
        xunjiandan.是否完成 = true;

        xunjiandan.save();
        renderJSON("{}");
    }
}