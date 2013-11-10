package controllers;

import models.YFFjlx;
import models.YFHxFjlx;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class YFHxFjlxs extends Application {
    public static void index(){
        List<YFHxFjlx> hx_fjlxs = YFHxFjlx.findAll();
        renderJSON(hx_fjlxs);
    }
}