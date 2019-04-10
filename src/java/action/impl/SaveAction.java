/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.impl;

import action.IAction;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Subject;
import service.SubjectService;
import service.impl.SubjectServiceImpl;

/**
 *
 * @author student1
 */
public class SaveAction implements IAction {

    @Override
    public String processRequest(HttpServletRequest request) {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Integer ects = Integer.parseInt(request.getParameter("ects"));
        Subject subject = new Subject(name, description, ects);
        SubjectService subjectService = new SubjectServiceImpl();
        subjectService.add(subject);
        return config.ConfigView.VIEW_SAVE_SUBJECT;
    }

}
