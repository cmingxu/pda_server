package controllers;


import models.Syssend;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Syssends extends Application {
    public static void index(){
        List<Syssend> syssends = Syssend.find("ifsend = '0'").fetch();
        renderJSON(syssends);
    }

    public static void jiedan(long id){
        Syssend syssend = Syssend.findById(id);
        syssend.ifck = "1";
        syssend.save();
        ok();
    }
}