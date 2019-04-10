/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import dao.UserProfileDao;
import dao.impl.UserProfileDaoImpl;
import java.util.List;
import model.UserProfile;
import service.UserProfileService;

/**
 *
 * @author student1
 */
public class UserProfileServiceImpl implements UserProfileService{
    private final UserProfileDao userProfileDao;

    public UserProfileServiceImpl() {
        userProfileDao=new UserProfileDaoImpl();
    }

    @Override
    public List<UserProfile> getAll() {
        return userProfileDao.getAll();
    }
 
}
