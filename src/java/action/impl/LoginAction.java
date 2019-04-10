/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.impl;

import action.IAction;
import config.ConfigView;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Message;
import model.MessageType;
import model.UserProfile;
import service.UserProfileService;
import service.impl.UserProfileServiceImpl;

/**
 *
 * @author student1
 */
public class LoginAction implements IAction {

    @Override
    public String processRequest(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.isEmpty() || password.isEmpty()) {
            Message message = new Message("Username and password empty", MessageType.ERROR_MESSAGE);
            request.setAttribute("message", message);
            UserProfile userProfile = new UserProfile(username, password);
            request.setAttribute("userprofile", userProfile);
            return ConfigView.VIEW_LOGIN;
        } else {
            UserProfileService upService = new UserProfileServiceImpl();
            UserProfile requestUser = new UserProfile(username, password);
            List<UserProfile> list = upService.getAll();
            for (UserProfile userProfile : list) {
                if (userProfile.equals(requestUser)) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("user", userProfile);
                    return ConfigView.VIEW_MAIN;

                }
            }
            Message message = new Message("User doesn't exist!", MessageType.ERROR_MESSAGE);
            request.setAttribute("message", message);
            UserProfile userProfile = new UserProfile(username, password);
            request.setAttribute("userprofile", userProfile);
            return ConfigView.VIEW_LOGIN;
        }
    }

}
