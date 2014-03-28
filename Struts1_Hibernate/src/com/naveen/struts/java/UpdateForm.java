package com.naveen.struts.java;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UpdateForm extends org.apache.struts.action.ActionForm {

    private String email,fullname;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if ( getEmail().equals(""))
              errors.add("email", new ActionMessage("email.required.error"));

        if ( getFullname().equals(""))
              errors.add("fullname", new ActionMessage("fullname.required.error"));

        return errors;
    }
}
