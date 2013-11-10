package controllers;

import models.YFFjlxYsdx;
import models.YFHxFjlx;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class YFFjlxYsdxs extends Application {
    public static void index(){
        List<YFFjlxYsdx> yf_fjlx_ysdxs = YFFjlxYsdx.findAll();
        renderJSON(yf_fjlx_ysdxs);
    }
}