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
@Table(name="巡检项目")
public class Xunjianxiangmu extends Model {
    public String 巡检点id;
    public String 名称;
    public String 标准;
public String 说明;


    public Xunjianxiangmu(String 巡检点id, String 名称, String 标准, String 说明) {
        this.巡检点id = 巡检点id;
        this.名称 = 名称;
        this.标准 = 标准;
        this.说明 = 说明;
    }
}