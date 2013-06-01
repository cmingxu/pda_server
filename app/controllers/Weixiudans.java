package controllers;

import models.Weixiudan;

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


    public static void create(){
        System.out.print(params.get("mBaoxiuRiqi"));
        System.out.print(params.get("mDanyuanName"));
        System.out.print(params.get("mDanyuanBianhao"));
        System.out.print(params.get("mYezhuPhone"));

        System.out.print("mBaoxiuriqi=====================================");
       Weixiudan weixiudan = new Weixiudan();
        weixiudan.单据日期 = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        weixiudan.单据编号 = "XX";
        weixiudan.单据编号序号 = "1234";
        weixiudan.单据编号前缀 = "XX";
        weixiudan.创建人 = "";
        weixiudan.创建日期 = params.get("mBaoxiuRiqi");
        weixiudan.来源 = "";
        weixiudan.来源ID = "";
        weixiudan.维修范围 = "";
        weixiudan.维修地点 = params.get("mLougeName") + params.get("mLoucengName") + params.get("mDanyuanName");
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
        //weixiudan.照片 = "";
        weixiudan.维修种类 = params.get("mBaoxiuLeibie");
        weixiudan.完成情况 = "";
        weixiudan.楼盘编号 = params.get("mLoupanBianhao");
        weixiudan.楼阁编号 = params.get("mLougeBianhao");
        weixiudan.楼层名称 = params.get("mLoucengName");
        weixiudan.报修方式 = "pad";
        weixiudan.save().toString();
        System.out.print(weixiudan.save());
        weixiudan.save();
        renderJSON("{}");
//        ok();
    }
}