package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:21
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="楼盘")
public class Loupan extends Model {
    public String 楼盘名称;
    public String 楼盘编号;

    public Loupan(String 楼盘名称, String 楼盘编号) {
        this.楼盘名称 = 楼盘名称;
        this.楼盘编号 = 楼盘编号;
    }
}
