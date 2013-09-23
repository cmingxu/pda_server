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
@Table(name="巡检点")
public class Xunjiandian extends Model {
    public String  名称;
    public String  编号;
    public String  楼盘编号;
    public String  楼阁编号;
    public String  楼层名称;
    public String  房产区域;
    public String  类别;
    public String  源类型;
    public String  编码;



    public Xunjiandian(String 名称, String 编号, String 楼盘编号, String 楼阁编号, String 楼层名称, String 房产区域, String 类别, String 源类型, String 编码) {
        this.名称 = 名称;
        this.编号 = 编号;
        this.楼盘编号 = 楼盘编号;
        this.楼阁编号 = 楼阁编号;
        this.楼层名称 = 楼层名称;
        this.房产区域 = 房产区域;
        this.类别 = 类别;
        this.源类型 = 源类型;
        this.编码 = 编码;
    }
}