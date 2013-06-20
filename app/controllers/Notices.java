package controllers;

import models.Danyuan;
import models.Notice;

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
        notice.是否接收 = "1";
        notice.接收时间 =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        notice.save();
        renderJSON("{}");
    }

    public static void wancheng(){
        int id = new Integer(params.get("id")).intValue();
        String wanchengqingkuang = params.get("desc");
        Notice notice = Notice.findById(id);
        notice.是否完成 = "1";
        notice.完成时间 =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        notice.save();
        renderJSON("{}");
    }
}