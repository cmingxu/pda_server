package controllers;

import models.DanyuanbiaoChaobiao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class DanyuanbiaoChaobiaos extends Application {
    public static void index(){
        List<DanyuanbiaoChaobiao> danyuanbiaoChaobiaos = DanyuanbiaoChaobiao.find("抄表终止日期='当前抄表期间'").fetch();
        renderJSON(danyuanbiaoChaobiaos);
    }

    public static void update(){
        String id = params.get("id");
        String bencidushu = params.get("bencidushu");

        DanyuanbiaoChaobiao danyuanbiaoChaobiao = DanyuanbiaoChaobiao.find("ID='" + id + "'").first();
        danyuanbiaoChaobiao.上次读数 = danyuanbiaoChaobiao.本次读数;
        danyuanbiaoChaobiao.本次读数 = bencidushu;
        danyuanbiaoChaobiao.save();

        renderJSON("{}");
    }
}