package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-5-8
 * Time: 上午9:43
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="客服_维修单")
public class Weixiudan extends Model {
    public String 单据日期;
    public String 单据编号;
    public String 单据编号序号;
    public String 单据编号前缀;
    public String 创建人;
    public String 创建日期;
    public String 来源;
    public String 来源ID;
    public String 维修范围;
    public String 维修地点;
    public String 单元编号;
    public String 住户编号;
    public String 报修人;
    public int 维修人类别;
    public String 报修人联系方式;
    public String 报修内容;
    public String 接单人;
    public String 是否接单;
    public String 接单时间;
    public String 维修人;
    public String 完成状态;
    public String 维修类别ID;
    public String 维修项目ID;
//    public String 照片;
    public String 维修种类;
    public String 完成情况;
    public String 楼盘编号;
    public String 楼阁编号;
    public String 楼层名称;
    public String 报修方式;
    public int 打印次数;
//    public String 照片路径;

    public Weixiudan() {
    }

    public Weixiudan(String 单据日期, String 单据编号, String 单据编号序号, String 单据编号前缀, String 创建人, String 创建日期,
                     String 来源, String 来源ID, String 维修范围, String 维修地点, String 单元编号, String 住户编号, String 报修人,
                     String 报修人联系方式, String 报修内容, String 接单人, String 是否接单, String 接单时间, String 维修人,
                     String 完成状态, String 维修类别ID, String 维修项目ID, String 维修种类, String 完成情况,
                     String 楼盘编号, String 楼阁编号, String 楼层名称, String 报修方式) {
        this.单据日期 = 单据日期;
        this.单据编号 = 单据编号;
        this.单据编号序号 = 单据编号序号;
        this.单据编号前缀 = 单据编号前缀;
        this.创建人 = 创建人;
        this.创建日期 = 创建日期;
        this.来源 = 来源;
        this.来源ID = 来源ID;
        this.维修范围 = 维修范围;
        this.维修地点 = 维修地点;
        this.单元编号 = 单元编号;
        this.住户编号 = 住户编号;
        this.报修人 = 报修人;
        this.报修人联系方式 = 报修人联系方式;
        this.报修内容 = 报修内容;
        this.接单人 = 接单人;
        this.是否接单 = 是否接单;
        this.接单时间 = 接单时间;
        this.维修人 = 维修人;
        this.完成状态 = 完成状态;
        this.维修类别ID = 维修类别ID;
        this.维修项目ID = 维修项目ID;
//        this.照片 = 照片;
        this.维修种类 = 维修种类;
        this.完成情况 = 完成情况;
        this.楼盘编号 = 楼盘编号;
        this.楼阁编号 = 楼阁编号;
        this.楼层名称 = 楼层名称;
        this.报修方式 = 报修方式;
        this.维修人类别 = 1;
        this.打印次数 = 1;
    }
}
