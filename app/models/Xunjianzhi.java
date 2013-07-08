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
@Table(name="巡检值")
public class Xunjianzhi extends Model {
     public String 项目id;
    public String 顺序;
    public String 标识;
    public String 值;
    public boolean 是否默认;
    public boolean 是否整改;

    public Xunjianzhi(String 项目id, String 顺序, String 标识, String 值, boolean 是否默认, boolean 是否整改) {
        this.项目id = 项目id;
        this.顺序 = 顺序;
        this.标识 = 标识;
        this.值 = 值;
        this.是否默认 = 是否默认;
        this.是否整改 = 是否整改;
    }
}