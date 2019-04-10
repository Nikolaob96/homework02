/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.impl;

import action.IAction;
import config.ConfigView;
import javax.servlet.http.HttpServletRequest;
import service.SubjectService;
import service.impl.SubjectServiceImpl;

/**
 *
 * @author Nikola
 */
public class DeleteSubjectAction implements IAction{

    @Override
    public String processRequest(HttpServletRequest request) {
        SubjectService subjectService = new SubjectServiceImpl();
        subjectService.remove(request.getParameter("name"));
        return ConfigView.VIEW_DELETE_SUBJECT;
    }
    
}
