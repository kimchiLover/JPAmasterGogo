package com.adi.entity;
/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import java.util.Date;
@MappedSuperclass
public class AbstractEntity {
    private Date created;
    private Date updated;


    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}

