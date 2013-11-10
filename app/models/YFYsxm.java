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
@Table(name="YF_YSXM")
public class YFYsxm extends Model {
    public String XMMC;
    public String XMBH;
    public int DXID;

    public YFYsxm(String XMMC, String XMBH, int DXID) {
        this.XMMC = XMMC;
        this.XMBH = XMBH;
        this.DXID = DXID;
    }
}