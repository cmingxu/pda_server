package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-4-9
 * Time: 下午8:16
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="YF_YZ_YFDMX")
public class YFYzYfdmx extends Model {
    public long DJID;
    public int JCZT;
    public String JCR;
    public Date JCSJ;
    public String FJSM;
    public int DXID;
    public String WTMS;
    public String FWQLJ;
    public boolean WXZT;
    public String WCSRR;
    public Date WCSRSJ;
    public int FJLXID;

    public YFYzYfdmx() {
    }

    public YFYzYfdmx(int DJID, int JCZT, String JCR, Date JCSJ, String FJSM, int DXID, String WTMS,  String FWQLJ,
                     boolean WXZT, String WCSRR, Date WCSRSJ, int FJLXID) {
        this.DJID = DJID;
        this.JCZT = JCZT;
        this.JCR = JCR;
        this.JCSJ = JCSJ;
        this.FJSM = FJSM;
        this.DXID = DXID;
        this.WTMS = WTMS;
        this.FWQLJ = FWQLJ;
        this.FWQLJ = FWQLJ;
        this.WXZT = WXZT;
        this.WCSRR = WCSRR;
        this.WCSRSJ = WCSRSJ;
        this.FJLXID = FJLXID;
    }
}