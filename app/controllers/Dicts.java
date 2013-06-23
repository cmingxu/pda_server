package controllers;

import models.Danyuan;
import models.Dict;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class Dicts extends Application {
    public static void index(){
        List<Dict> dicts = Dict.find("类别 in ('客服_维修_完成情况', '客服_维修_未进行原因')").fetch();
        renderJSON(dicts);
    }
}