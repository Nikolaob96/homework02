/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import dao.SubjectDao;
import dao.impl.SubjectDaoImpl;
import java.util.List;
import model.Subject;
import service.SubjectService;

/**
 *
 * @author student1
 */
public class SubjectServiceImpl implements SubjectService {

    private final SubjectDao subjectDao;

    public SubjectServiceImpl() {
        this.subjectDao = new SubjectDaoImpl();
    }

    @Override
    public List<Subject> getAll() {
        return subjectDao.getAll();
    }

    @Override
    public void add(Subject subject) {
        subjectDao.add(subject);
    }

    @Override
    public Subject getOne(String name) {
        return subjectDao.getOne(name);
    }

    @Override
    public void remove(String parameter) {
        subjectDao.remove(parameter);
    }

    @Override
    public void update(Subject subject) {
        subjectDao.update(subject);
    }

}
