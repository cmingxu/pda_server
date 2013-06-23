package controllers;

import models.Danyuan;
import models.Notice;
import models.Weixiudan;

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
public class Notices extends Application {
    public static void index(){
        List<Notice> notices = Notice.find("接收人='" + current_user + "'").fetch();
        renderJSON(notices);
    }
    public static void jiedan(){
        int id = new Integer(params.get("id")).intValue();
        Notice notice = Notice.findById(id);
        Weixiudan weixidan = Weixiudan.find("where id =" + notice.单据id).first();

        notice.是否接收 = "1";
        notice.接收时间 =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        notice.save();

        if (weixidan != null) {
            weixidan.完成状态 = "3";
            weixidan.是否接单 = "1";
            weixidan.维修开始时间 =   new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
            weixidan.接单人 = current_user;
            weixidan.维修人 = current_user;
        }
        renderJSON("{}");
    }

    public static void daixiu(){
        int id = new Integer(params.get("id")).intValue();
        String wanchengqingkuang = params.get("desc");
        Notice notice = Notice.findById(id);
        Weixiudan weixidan = Weixiudan.find("where id =" + notice.单据id).first();

        if (weixidan != null) {
            weixidan.完成状态 = "2";
            weixidan.待修原因 = wanchengqingkuang;
            weixidan.save();
        }
        renderJSON("{}");
    }

    public static void wancheng(){
        int id = new Integer(params.get("id")).intValue();
        String wanchengqingkuang = params.get("desc");
        Notice notice = Notice.findById(id);
        Weixiudan weixidan = Weixiudan.find("where id =" + notice.单据id).first();

        notice.是否完成 = "1";
        notice.完成时间 =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        notice.save();

        if (weixidan != null) {
            weixidan.完成状态 = "4";
            weixidan.完成情况 = wanchengqingkuang;
            weixidan.维修终止时间 =   new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
       ;
        }
        renderJSON("{}");
    }
}