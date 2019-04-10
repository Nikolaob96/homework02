/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import action.ActionFactory;
import action.IAction;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author student1
 */
public class ApplicationController {

    public String processRequest(HttpServletRequest request) {
        String pathInfo = request.getPathInfo();
        System.out.println("PROCESS REQUEST: " + pathInfo);
        
        IAction action = ActionFactory.getActionFactory(pathInfo);

        return action.processRequest(request);

    }
}
