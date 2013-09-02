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
@Table(name="楼层")
public class Louceng extends Model {
    public String 楼层编号;
    public String 楼层名称;
    public String 楼阁编号;
    public String 梯数;


    public Louceng(String 楼层编号, String 楼层名称, String 楼阁编号, String 梯数) {
        this.楼层编号 = 楼层编号;
        this.楼层名称 = 楼层名称;
        this.楼阁编号 = 楼阁编号;
        this.梯数 = 梯数;
    }
}