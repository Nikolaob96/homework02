/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.impl;

import action.IAction;
import config.ConfigView;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author student1
 */
public class AddSubjectAction implements IAction {

    @Override
    public String processRequest(HttpServletRequest request) {
        request.setAttribute("view", "");
        return ConfigView.VIEW_ADD_SUBJECT;
    }

}
