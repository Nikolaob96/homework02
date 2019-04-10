/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Subject;

/**
 *
 * @author student1
 */
public interface SubjectDao {

    public List<Subject> getAll();

    public void add(Subject subject);

    public Subject getOne(String name);

    public void remove(String parameter);

    public void update(Subject subject);
    
}
