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
import service.impl.SubjectServiceImpl;

/**
 *
 * @author student1
 */
public class AllSubjectsAction implements IAction {

    @Override
    public String processRequest(HttpServletRequest request) {
        List<Subject> allSubjects = new SubjectServiceImpl().getAll();
        request.setAttribute("subjects", allSubjects);
        
        for (Subject allSubject : allSubjects) {
            System.out.println("ime"+ allSubject.getName());
        }
        return config.ConfigView.VIEW_ALL_SUBJECTS;
    }

}
