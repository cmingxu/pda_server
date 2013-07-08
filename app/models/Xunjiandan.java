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
@Table(name="巡检单")
public class Xunjiandan extends Model {
    public String  单据编号;
    public String 单据序号;
    public String 制单日起;
    public String 录入人;
    public String 录入时间;
    public String 计划起始时间;
    public String 计划终止时间;
    public boolean 是否完成;
    public String 巡检起始时间;
    public String 巡检终止时间;
    public boolean 是否审核;
    public String 审核日期;
    public String 审核人;


    public Xunjiandan(String 单据编号, String 单据序号, String 制单日起, String 录入人, String 录入时间, String 计划起始时间, String 计划终止时间, boolean 是否完成, String 巡检起始时间, String 巡检终止时间, boolean 是否审核, String 审核日期, String 审核人) {
        this.单据编号 = 单据编号;
        this.单据序号 = 单据序号;
        this.制单日起 = 制单日起;
        this.录入人 = 录入人;
        this.录入时间 = 录入时间;
        this.计划起始时间 = 计划起始时间;
        this.计划终止时间 = 计划终止时间;
        this.是否完成 = 是否完成;
        this.巡检起始时间 = 巡检起始时间;
        this.巡检终止时间 = 巡检终止时间;
        this.是否审核 = 是否审核;
        this.审核日期 = 审核日期;
        this.审核人 = 审核人;
    }
}