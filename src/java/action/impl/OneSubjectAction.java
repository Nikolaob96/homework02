/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.impl;

import action.IAction;
import config.ConfigView;
import javax.servlet.http.HttpServletRequest;
import model.Subject;
import service.impl.SubjectServiceImpl;

/**
 *
 * @author student1
 */
public class OneSubjectAction implements IAction {

    @Override
    public String processRequest(HttpServletRequest request) {
        Subject result=new SubjectServiceImpl().getOne(request.getParameter("name"));
        request.setAttribute("subject", result);
        request.setAttribute("view", "disabled");
        return ConfigView.VIEW_ONE_SUBJECT;
    }

}
