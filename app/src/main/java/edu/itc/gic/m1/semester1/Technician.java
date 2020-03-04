package edu.itc.gic.m1.semester1;

import java.util.Date;

/**
 * This class is used for ...
 *
 * @autor MAO Hieng 3/4/2020
 */
public class Technician {

    long id;
    String phone;
    String name;
    Date created_date, modified_date;

    public Technician(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }
}
