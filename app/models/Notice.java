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
@Table(name="系统_发送PDA")
public class Notice extends Model {
  public String 发送时间;
    public String 发送人;
    public String 单据类型;
    public String 单据id;
    public String 单据标题;
    public String  单据内容;
    public String 接收期限;
    public String 接收人;
    public String 是否接收;
    public String 接收时间;
    public String 是否完成;
    public String 完成时间;


    public Notice(String 发送时间, String 发送人, String 单据类型, String 单据id, String 单据标题, String 单据内容, String 接收期限, String 接收人, String 是否接收, String 接收时间, String 是否完成, String 完成时间) {
        this.发送时间 = 发送时间;
        this.发送人 = 发送人;
        this.单据类型 = 单据类型;
        this.单据id = 单据id;
        this.单据标题 = 单据标题;
        this.单据内容 = 单据内容;
        this.接收期限 = 接收期限;
        this.接收人 = 接收人;
        this.是否接收 = 是否接收;
        this.接收时间 = 接收时间;
        this.是否完成 = 是否完成;
        this.完成时间 = 完成时间;
    }
}
