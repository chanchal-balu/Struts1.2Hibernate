package com.naveen.struts.java.entities;


import java.util.Date;

import com.naveen.struts.java.dao.SubscriberDAO;

public class Subscriber implements java.io.Serializable {

    private String email;
    private String fullname;
    private Date dj;

    public Subscriber() {
    }

    public Subscriber(String email) {
        this.email = email;
    }

    public Subscriber(String email, String fullname, Date dj) {
        this.email = email;
        this.fullname = fullname;
        this.dj = dj;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDj() {
        return this.dj;
    }

    public void setDj(Date dj) {
        this.dj = dj;
    }

    public static Subscriber getSubscriber(String email) {
        return  SubscriberDAO.getSubscriber(email);
    }
}


