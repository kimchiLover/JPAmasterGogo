package com.adi.entity;
/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */
@Entity
public class User extends AbstractEntity {

    @Id
    private Integer     id;
    private Integer name;
    @Column(unique = true)
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

