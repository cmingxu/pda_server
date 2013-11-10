package controllers;

import models.YFYsdx;
import models.YFYsxm;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class YFYsxms extends Application {
    public static void index(){
        List<YFYsxm> ysxms = YFYsxm.findAll();

        renderJSON(ysxms);
    }
}