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
@Table(name="YF_KFS_YFDMX")
public class YFKfsYfdmx extends Model {
    public int DJID;
    public int JCZT;
    public String JCR;
    public String JCSJ;
    public String FJSM;
    public int DXID;
    public String WTMS;
    public String WTZP;
    public String FWQLJ;
    public String WXZT;
    public String WCSRR;
    public String WCSRSJ;
    public int FJLXID;

    public YFKfsYfdmx(int DJID, int JCZT, String JCR, String JCSJ, String FJSM, int DXID, String WTMS, String WTZP, String FWQLJ, String WXZT, String WCSRR, String WCSRSJ, int FJLXID) {
        this.DJID = DJID;
        this.JCZT = JCZT;
        this.JCR = JCR;
        this.JCSJ = JCSJ;
        this.FJSM = FJSM;
        this.DXID = DXID;
        this.WTMS = WTMS;
        this.WTZP = WTZP;
        this.FWQLJ = FWQLJ;
        this.WXZT = WXZT;
        this.WCSRR = WCSRR;
        this.WCSRSJ = WCSRSJ;
        this.FJLXID = FJLXID;
    }
}