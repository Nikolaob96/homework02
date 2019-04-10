/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import config.ConfigView;

/**
 *
 * @author student1
 */
public class ViewResolver {

    public String getPage(String view) {
        String page = "";
        switch (view) {
            case ConfigView.VIEW_LOGIN:
                page = "/login.jsp";
                break;
            case ConfigView.VIEW_MAIN:
                page = "/WEB-INF/pages/main.jsp";
                break;
            case ConfigView.VIEW_ADD_SUBJECT:
                page = "/WEB-INF/pages/subject.jsp";
                break;
            case ConfigView.VIEW_LOGOUT:
                page = "/login.jsp";
                break;
            case ConfigView.VIEW_ALL_SUBJECTS:
                page = "/WEB-INF/pages/subjects.jsp";
                break;
            case ConfigView.VIEW_ONE_SUBJECT:
                page = "/WEB-INF/pages/subject.jsp";
                break;
            case ConfigView.VIEW_UPDATE_SUBJECT:
                //page = "/WEB-INF/pages/subject.jsp";
                page = "/application/allSubjects";
                break;
            case ConfigView.VIEW_DELETE_SUBJECT:
                //page = "/WEB-INF/pages/main.jsp";
                page = "/application/allSubjects";
                break;
            case ConfigView.VIEW_SAVE_SUBJECT:
                page = "/application/allSubjects";
                break;
            case ConfigView.VIEW_DEFAULT:
                page = "/WEB-INF/pages/errorpage.jsp";
                break;
            case ConfigView.VIEW_RETURN_TO_HOME:
                page = "/WEB-INF/pages/main.jsp";
                break;
        }
        return page;
    }
}
