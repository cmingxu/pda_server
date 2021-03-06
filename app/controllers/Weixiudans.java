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

        Weixiudan last = Weixiudan.last();


        System.out.print("mBaoxiuriqi=====================================");
        Weixiudan weixiudan = new Weixiudan();
        weixiudan.单据日期 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());

        System.out.println(last.单据编号序号);

        weixiudan.单据编号序号 = "" + (System.currentTimeMillis() % 1000000000);
        System.out.print("mBaoxiuriqi=====================================");

        System.out.println(weixiudan.单据编号序号);

        weixiudan.单据编号前缀 = "WX";
        weixiudan.单据编号 =  "WX" + weixiudan.单据编号序号;

        System.out.println(weixiudan.单据编号);
        weixiudan.创建人 = current_user;
        weixiudan.创建日期 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        weixiudan.来源 = "PDA";
        weixiudan.来源ID = "";
        weixiudan.维修范围 = params.get("mBaoxiuLeibie");
        weixiudan.维修地点 = params.get("mLoupanName") + "/" + params.get("mDanyuanName");
        weixiudan.修改人 = params.get("mBaoxiuren");
//        weixiudan.修改人联系方式 = params.get("mYezhuPhone");
        weixiudan.单元编号 = params.get("mDanyuanBianhao");
        weixiudan.住户编号 = params.get("mZhuhuBianhao");
        weixiudan.报修人 = params.get("mBaoxiuren");
        weixiudan.报修人联系方式 = params.get("mYezhuPhone");
        weixiudan.报修内容 = params.get("mBaoxiuNeirong");
        weixiudan.接单人 = "";
        weixiudan.是否接单 = "0";
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
        System.out.println("save");
        weixiudan.save();


        String attach_dir = image_dir + "weixiudan" + "\\" + weixiudan.id;
        File file = new File(attach_dir);
        if (!file.exists()) {
            file.mkdir();
        }
        if (image0 != null) {
            System.out.println(attach_dir + "\\" + image0.getName());
            image0.renameTo(new File(attach_dir + "\\" + image0.getName()));
        }

        if (image1 != null) {
            image1.renameTo(new File(attach_dir + "\\" + image1.getName()));
        }

        if(image2 != null){
            image2.renameTo(new File(attach_dir + "\\" + image2.getName()));
        }

        renderJSON("{\"result\": \"true\"}");
    }
}