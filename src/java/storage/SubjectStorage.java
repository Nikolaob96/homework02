/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.util.ArrayList;
import java.util.List;
import model.Subject;

/**
 *
 * @author student1
 */
public class SubjectStorage {
    List<Subject> subjects;
    private static SubjectStorage instance;

    private SubjectStorage() {
        subjects=new ArrayList<>();
    }
    public static SubjectStorage getInstance(){
        if (instance==null) {
            instance=new SubjectStorage();
            
        }
        return instance;
    }
    public List<Subject> getAll(){
        return subjects;
    }
    public void add(Subject subject){
//        if(subjects.contains(subject)) {
//            subjects.add(subject);
//        } else {
//            updateSubject(subject);
//        }
        subjects.add(subject);
    }

    public Subject getOne(String name) {
        for (Subject subject : subjects) {
            if(subject.getName().equals(name))
                return subject;
        }
        return null;
    }

    private void updateSubject(Subject subject) {
        for (Subject subject1 : subjects) {
            if(subject1.equals(subject)) {
                subject1.setName(subject.getName());
                subject1.setDescription(subject.getDescription());
                subject1.setEcts(subject.getEcts());
                break;
            }
        }
    }

    public void remove(String parameter) {
        for (Subject subject : subjects) {
            if(subject.getName().equals(parameter)) {
                subjects.remove(subject);
                break;
            }
        }
    }

    public void update(Subject subject) {
        for (Subject subject1 : subjects) {
            if(subject.getName().equals(subject.getName())) {
                subject1.setDescription(subject.getDescription());
                subject1.setEcts(subject.getEcts());
                break;
            }
        }
    }
    
    
}
