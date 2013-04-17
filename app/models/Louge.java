package models;

import play.db.jpa.GenericModel;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:16
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="楼阁")
public class Louge extends GenericModel {
    public String 楼阁名称;
    @Id
    public String 楼阁编号;
    public String 楼盘编号;

    public Louge(String 楼阁名称, String 楼阁编号, String 楼盘编号) {
        this.楼阁名称 = 楼阁名称;
        this.楼阁编号 = 楼阁编号;
        this.楼盘编号 = 楼盘编号;
    }
}
