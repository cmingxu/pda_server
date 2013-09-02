package controllers;

import models.Weixiudan;
import play.Logger;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-5-8
 * Time: 上午9:54
 * To change this template use File | Settings | File Templates.
 */

public class Weixiudans extends Application {
    public static void index(){
        List<Weixiudan> weixiudans = Weixiudan.findAll();
        renderJSON(weixiudans);
    }


    public static void create(File image0, File image1, File image2){
        String attach_dir = "C:\\\\attachments";

        StringBuilder sb = new StringBuilder();
        if (image0 != null) {
            sb.append(image0.getName());
            image0.renameTo(new File(attach_dir + "\\" + image0.getName()));
        }

        if (image1 != null) {
            sb.append(",");
            sb.append(image1.getName());
            image1.renameTo(new File(attach_dir + "\\" + image1.getName()));
        }

        if(image2 != null){
            sb.append(",");
            sb.append(image2.getName());
            image2.renameTo(new File(attach_dir + "\\" + image2.getName()));
        }

        Weixiudan last = Weixiudan.last();


        System.out.print("mBaoxiuriqi=====================================");
        Weixiudan weixiudan = new Weixiudan();
        weixiudan.单据日期 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());

        System.out.println(last.单据编号序号);

        weixiudan.单据编号序号 = "" + (System.currentTimeMillis());
        System.out.print("mBaoxiuriqi=====================================");

        System.out.println(weixiudan.单据编号序号);

        weixiudan.单据编号前缀 = "WX";
        weixiudan.单据编号 = String.format("WX%020s", weixiudan.单据编号序号);

        System.out.println(weixiudan.单据编号);
        weixiudan.创建人 = params.get("mBaoxiuren");
        weixiudan.创建日期 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        weixiudan.来源 = "PDA";
        weixiudan.来源ID = "";
        weixiudan.维修范围 = params.get("mBaoxiuLeibie");
        weixiudan.维修地点 = params.get("mLougeName") + params.get("mLoucengName") + params.get("mDanyuanName");
        weixiudan.修改人 = params.get("mBaoxiuren");
        weixiudan.修改人联系方式 = params.get("mYezhuPhone");
        weixiudan.单元编号 = params.get("mDanyuanBianhao");
        weixiudan.住户编号 = params.get("mZhuhuBianhao");
        weixiudan.报修人 = params.get("mBaoxiuren");
        weixiudan.报修人联系方式 = params.get("mYezhuPhone");
        weixiudan.报修内容 = params.get("mBaoxiuNeirong");
        weixiudan.接单人 = "";
        weixiudan.是否接单 = "0";
        weixiudan.接单时间 = "";
        weixiudan.维修人 = "";
        weixiudan.完成状态 = "0";
        weixiudan.维修类别ID = "";
        weixiudan.维修项目ID = "";
        weixiudan.维修种类 = "";
        weixiudan.完成情况 = "";
        weixiudan.楼盘编号 = params.get("mLoupanBianhao");
        weixiudan.楼阁编号 = params.get("mLougeBianhao");
        weixiudan.楼层名称 = params.get("mLoucengName");
        weixiudan.报修方式 = "pad";
        System.out.println(weixiudan.创建日期);
        weixiudan.save().toString();

        System.out.print(weixiudan.save());
        weixiudan.save();
        renderJSON("{}");
//        ok();
    }
}