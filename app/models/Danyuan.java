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
@Table(name="单元")
public class Danyuan extends Model {
    public String 单元编号;
    public String 单元名称;
    public String 楼阁编号;
    public String 楼层;
    public String 楼层名称;
    public String 房号编号;
    public String 住户编号;
    public String 业主编号;

    public Danyuan(String 单元编号, String 单元名称, String 楼阁编号, String 楼层, String 楼层名称, String 房号编号, String 住户编号, String 业主编号) {
        this.单元编号 = 单元编号;
        this.单元名称 = 单元名称;
        this.楼阁编号 = 楼阁编号;
        this.楼层 = 楼层;
        this.楼层名称 = 楼层名称;
        this.房号编号 = 房号编号;
        this.住户编号 = 住户编号;
        this.业主编号 = 业主编号;
    }
}