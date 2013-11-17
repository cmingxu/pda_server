package controllers;

import models.Danyuan;
import models.YFYsdx;
import models.YFYzYfd;
import models.YFYzYfdmx;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class YFYzYfds extends Application {


    public static void create(File image0, File image1, File image2){
        System.out.println(params.get("mDanyuanbianhao"));
        System.out.println(params.get("mDesc"));
        System.out.println(params.get("mDxID"));
        System.out.println(params.get("mFjlxID"));

        YFYzYfd yfYzYfd = YFYzYfd.find("DYBH='" + params.get("mDanyuanbianhao") + "'").first();
//        YFYzYfd yfYzYfd = YFYzYfd.find("").first();
        YFYzYfdmx yfYzYfdmx = new YFYzYfdmx();
        yfYzYfdmx.DJID = yfYzYfd.getId();
        yfYzYfdmx.DXID = Integer.parseInt(params.get("mDxID"));
        yfYzYfdmx.FJLXID = Integer.parseInt(params.get("mFjlxID"));
        yfYzYfdmx.WXZT = false;
        yfYzYfdmx.WTMS = params.get("mDesc");
        yfYzYfdmx.WCSRR = current_user;
        yfYzYfdmx.WCSRSJ = new Date();
        yfYzYfdmx.FWQLJ = "";




        yfYzYfdmx.save();
        String attach_dir = "C:\\\\attachments" + "\\" + "yf_yz_yfd"  + "\\" + yfYzYfdmx.id;
        File file = new File(attach_dir);
        if(!file.exists()){
            file.mkdir();
        }
        if (image0 != null) {
            image0.renameTo(new File(attach_dir + "\\" + image0.getName()));
        }

        if (image1 != null) {
            image1.renameTo(new File(attach_dir + "\\" + image1.getName()));
        }

        if(image2 != null){
            image2.renameTo(new File(attach_dir + "\\" + image2.getName()));
        }

        renderJSON("{}");
    }
}