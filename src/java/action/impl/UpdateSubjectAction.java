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
import service.SubjectService;
import service.impl.SubjectServiceImpl;

/**
 *
 * @author Nikola
 */
public class UpdateSubjectAction implements IAction {

    @Override
    public String processRequest(HttpServletRequest request) {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int ects = Integer.parseInt(request.getParameter("ects"));
        
        SubjectService ss = new SubjectServiceImpl();
        ss.update(new Subject(name, description, ects));
        return ConfigView.VIEW_UPDATE_SUBJECT;
    }
    
}
