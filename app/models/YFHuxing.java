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
@Table(name="YF_HX")
public class YFHuxing extends Model {
    public String HXMC;
    public String HXBH;
    public String HXT;

    public YFHuxing(String HXMC, String HXBH, String HXT) {
        this.HXMC = HXMC;
        this.HXBH = HXBH;
        this.HXT = HXT;
    }
}