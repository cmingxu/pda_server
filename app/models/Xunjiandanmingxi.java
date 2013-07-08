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
@Table(name="巡检单明细")
public class Xunjiandanmingxi extends Model {
    public String 巡检单id;
    public String 项目id;
    public String 值id;
    public String 巡检时间;
    public String 标识;
    public String 值;
    public String 说明;


    public Xunjiandanmingxi(String 巡检单id, String 项目id, String 值id, String 巡检时间, String 标识, String 值, String 说明) {
        this.巡检单id = 巡检单id;
        this.项目id = 项目id;
        this.值id = 值id;
        this.巡检时间 = 巡检时间;
        this.标识 = 标识;
        this.值 = 值;
        this.说明 = 说明;
    }
}