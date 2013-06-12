package models;
import play.db.jpa.GenericModel;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-5-22
 * Time: 下午5:55
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="Syssend")
public class Syssend extends GenericModel{
    @Id
    public int id;
    public String sendtime;
    public String sendperson;
    public String retime;
    public String reperson;
    public String style;
    public String content;
    public String wyid;
    public String ifsend;
    public String jsr;
    public String ifck;
    public String iftsfs;
    public String TaskType;
    public String ifComplete;
    public String timelimit;

    public Syssend(String sendtime, String sendperson, String retime, String repersoon, String style, String content, String wyid, String ifsend, String jsr, String ifck, String iftsfs, String taskType, String ifComplete, String timelimit) {
        this.sendtime = sendtime;
        this.sendperson = sendperson;
        this.retime = retime;
        this.reperson = reperson;
        this.style = style;
        this.content = content;
        this.wyid = wyid;
        this.ifsend = ifsend;
        this.jsr = jsr;
        this.ifck = ifck;
        this.iftsfs = iftsfs;
        TaskType = taskType;
        this.ifComplete = ifComplete;
        this.timelimit = timelimit;
    }
}
