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
public class LogoutAction implements IAction {

    @Override
    public String processRequest(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();
        return ConfigView.VIEW_LOGOUT;
    }

}
