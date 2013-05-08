package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:16
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "住户资料")
public class Zhuhu extends Model {
    public String 住户名称;
    public String 住户编号;
    public String 住户类别;
    public String 手机号码;
    public String 联系电话;
    public String 联系地址;

    public Zhuhu(   String 住户名称, String 住户编号, String 住户类别, String 手机号码, String 联系电话, String 联系地址) {
        this.住户名称 = 住户名称;
        this.住户编号 = 住户编号;
        this.住户类别 = 住户类别;
        this.手机号码 = 手机号码;
        this.联系电话 = 联系电话;
        this.联系地址 = 联系地址;
    }
}
