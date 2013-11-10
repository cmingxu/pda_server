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
@Table(name="YF_FJLX_YSDX")
public class YFFjlxYsdx extends Model {
    public int FJLXID;
    public int DXID;

    public YFFjlxYsdx(int FJLXID, int DXID) {
        this.FJLXID = FJLXID;
        this.DXID = DXID;
    }
}