package controllers;

import com.google.gson.JsonArray;
import models.Weixiudan;

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

        @BodyParser.Of(value = Json.class)
    public static void create(){

    }
}