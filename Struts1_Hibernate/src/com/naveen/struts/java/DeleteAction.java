package com.naveen.struts.java;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.naveen.struts.java.dao.SubscriberDAO;

public class DeleteAction extends org.apache.struts.action.Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        DeleteForm frm = (DeleteForm) form;
        boolean done = SubscriberDAO.delete(frm.getEmail());
        if (done) {
            request.setAttribute("msg", "Subscriber Deleted Successfully!");
        } else {
            request.setAttribute("msg", "Sorry! Could not delete subscriber. Email address may not be present!");
        }
        return mapping.findForward("deleted");
    }
}

