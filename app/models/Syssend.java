package models;

import play.db.jpa.GenericModel;

import javax.persistence.Entity;


import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: xcm
 * Date: 13-5-22
 * Time: 下午5:55
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="楼盘")

public class Syssend extends GenericModel{


    public Syssend() {

    }
}
