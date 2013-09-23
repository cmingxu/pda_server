package models;

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
@Table(name="单元表抄表")
public class DanyuanbiaoChaobiao extends Model {
    @Id
    public String ID;
    public String 单元编号;
    public String 表名称;
    public String 上次读数;
    public String 本次读数;

    public DanyuanbiaoChaobiao(String 单元编号, String 表名称, String 上次读数, String 本次读数, String ID) {
        this.单元编号 = 单元编号;
        this.表名称 = 表名称;
        this.上次读数 = 上次读数;
        this.本次读数 = 本次读数;
        this.ID = ID;
    }
}