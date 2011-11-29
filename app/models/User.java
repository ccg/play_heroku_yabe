package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: chad
 * Date: 11/28/11
 * Time: 10:27 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name="my_user")
public class User extends Model {
    public String email;
    public String fullName;
    public boolean isAdmin;

    public User(String email, String fullName, boolean isAdmin) {
        this.email = email;
        this.fullName = fullName;
        this.isAdmin = isAdmin;
    }
}
