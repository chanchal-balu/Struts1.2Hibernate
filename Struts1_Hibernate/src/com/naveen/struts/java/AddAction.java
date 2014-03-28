package com.naveen.struts.java;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.naveen.struts.java.dao.SubscriberDAO;

public class AddAction extends org.apache.struts.action.Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        AddForm af = (AddForm) form;
        boolean done = SubscriberDAO.add(af.getEmail(), af.getFullname());
        if (done) {
            request.setAttribute("msg", "Added Subscriber Successfully!");
        } else {
            request.setAttribute("msg", "Sorry! Could not add subscriber. Email address may not be unique!");
        }
        return mapping.findForward("added");

    }
}
