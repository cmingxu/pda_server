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
@Table(name="词典")
public class Dict extends Model {
    public String 类别;
    public String 名称;
    public String 次序;
    public String 编号;
    public String 属性;

    public Dict(String 类别, String 名称, String 次序, String 编号, String 属性) {
        this.类别 = 类别;
        this.名称 = 名称;
        this.次序 = 次序;
        this.编号 = 编号;
        this.属性 = 属性;
    }
}