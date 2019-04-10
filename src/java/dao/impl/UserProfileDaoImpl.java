/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.UserProfileDao;
import java.util.List;
import model.UserProfile;
import storage.UserProfileStorage;

/**
 *
 * @author student1
 */
public class UserProfileDaoImpl implements UserProfileDao{

    @Override
    public List<UserProfile> getAll() {
        return UserProfileStorage.getInstance().getAll();
    }
    
}
