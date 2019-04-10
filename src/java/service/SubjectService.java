/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Subject;

/**
 *
 * @author student1
 */
public interface SubjectService {
    List<Subject> getAll();
    void add(Subject subject);
    Subject getOne(String name);

    public void remove(String parameter);

    public void update(Subject subject);
}
