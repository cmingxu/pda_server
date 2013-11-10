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
@Table(name="YF_YZ_YFD")
public class YFYzYfd extends Model {
    public String DJRQ;
    public String DJBH;
    public String DJBS;
    public String DJXH;
    public String ZDR;
    public String ZDSJ;
    public String ZHXGR;
    public String ZHXGSJ;
    public String DYBH;
    public String YZBH;
    public String YFR;
    public String LXDH;
    public String YZYJ;
    public String FJSM;
    public String IFSH;
    public String SHR;
    public String SHRQ;
    public String ZT;

    public YFYzYfd(String DJRQ, String DJBH, String DJBS, String DJXH, String ZDR, String ZDSJ, String ZHXGR, String ZHXGSJ, String DYBH, String YZBH, String YFR, String LXDH, String YZYJ, String FJSM, String IFSH, String SHR, String SHRQ, String ZT) {
        this.DJBH = DJBH;
        this.DJRQ = DJRQ;
        this.DJBS = DJBS;
        this.DJXH = DJXH;
        this.ZDR = ZDR;
        this.ZDSJ = ZDSJ;
        this.ZHXGR = ZHXGR;
        this.ZHXGSJ = ZHXGSJ;
        this.DYBH = DYBH;
        this.YZBH = YZBH;
        this.YFR = YFR;
        this.LXDH = LXDH;
        this.YZYJ = YZYJ;
        this.FJSM = FJSM;
        this.IFSH = IFSH;
        this.SHR = SHR;
        this.SHRQ = SHRQ;
        this.ZT = ZT;
    }
}