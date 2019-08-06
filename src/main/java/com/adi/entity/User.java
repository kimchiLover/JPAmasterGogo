package com.adi.entity;
/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */

import javax.persistence.*;

/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */
@Entity
@Table(name = "User")
public class User extends AbstractEntity {

    @Id
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

