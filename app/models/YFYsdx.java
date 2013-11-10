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
@Table(name="YF_YSDX")
public class YFYsdx extends Model {
    public String DXMC;
    public String DXBH;

    public YFYsdx(String DXMC, String DXBH) {
        this.DXMC = DXMC;
        this.DXBH = DXBH;
    }
}