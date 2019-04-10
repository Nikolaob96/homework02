/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import model.UserProfile;

/**
 *
 * @author student1
 */
public class UserProfileUtil {
    public static List<UserProfile> init(){
        List<UserProfile> list=new ArrayList<UserProfile>()
        {{
            add(new UserProfile("pera", "pera", "pera@gmail.com"));
            add(new UserProfile("mika", "mika", "mika@gmail.com"));
            add(new UserProfile("prika", "prika", "prika@gmail.com"));
        }};
        return list;
    }
}
