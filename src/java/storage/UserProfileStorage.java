/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.util.ArrayList;
import java.util.List;
import model.UserProfile;
import util.UserProfileUtil;

/**
 *
 * @author student1
 */
public class UserProfileStorage {

    private static UserProfileStorage instance;
    private final List<UserProfile> userProfiles;

    private UserProfileStorage() {
        userProfiles = new ArrayList<>();
        userProfiles.addAll(UserProfileUtil.init());
    }

    public static UserProfileStorage getInstance() {
        if (instance == null) {
            instance = new UserProfileStorage();
        }
        return instance;
    }

    public List<UserProfile> getAll() {
        return userProfiles;
    }
}
