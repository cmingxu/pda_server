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
@Table(name="YF_HX_FJLX")
public class YFHxFjlx extends Model {

    public int HXID;
    public int FJLXID;

    public YFHxFjlx(int HXID, int FJLXID) {
        this.HXID = HXID;
        this.FJLXID = FJLXID;
    }
}