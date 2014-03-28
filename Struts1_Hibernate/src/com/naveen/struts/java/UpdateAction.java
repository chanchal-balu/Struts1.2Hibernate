package com.naveen.struts.java;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.naveen.struts.java.dao.SubscriberDAO;

public class UpdateAction extends org.apache.struts.action.Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        UpdateForm uf = (UpdateForm) form;
        boolean done = SubscriberDAO.update(uf.getEmail(), uf.getFullname());
        if (done) {
            request.setAttribute("msg", "Updated Subscriber Successfully!");
        } else {
            request.setAttribute("msg", "Sorry! Could not update subscriber!");
        }
        return mapping.findForward("updated");

    }
}
