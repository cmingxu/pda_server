package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
@Table(name="用户组")
public class User extends Model {

    public String 用户组;
    public String 密码;
    public String 用户名;

    public User(String 用户组, String 密码, String 用户名) {
        this.用户组 = 用户组;
        this.密码 = 密码;
        this.用户名 = 用户名;
    }

}
