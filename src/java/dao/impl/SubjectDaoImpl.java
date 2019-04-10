/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.SubjectDao;
import java.util.List;
import model.Subject;
import storage.SubjectStorage;

/**
 *
 * @author student1
 */
public class SubjectDaoImpl implements SubjectDao{

    @Override
    public List<Subject> getAll() {
        return SubjectStorage.getInstance().getAll();
    }

    @Override
    public void add(Subject subject) {
        SubjectStorage.getInstance().add(subject);
    }

    @Override
    public Subject getOne(String name) {
        return SubjectStorage.getInstance().getOne(name);
    }

    @Override
    public void remove(String parameter) {
        SubjectStorage.getInstance().remove(parameter);
    }

    @Override
    public void update(Subject subject) {
        SubjectStorage.getInstance().update(subject);
    }
    
}
