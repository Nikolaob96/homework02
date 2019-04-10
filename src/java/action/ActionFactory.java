/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import action.impl.AddSubjectAction;
import action.impl.AllSubjectsAction;
import action.impl.DefaultRedirectAction;
import action.impl.DeleteSubjectAction;
import action.impl.LoginAction;
import action.impl.LogoutAction;
import action.impl.OneSubjectAction;
import action.impl.ReturnToHomeAction;
import action.impl.SaveAction;
import action.impl.UpdateSubjectAction;

/**
 *
 * @author student1
 */
public class ActionFactory {

    public static IAction getActionFactory(String path) {
        IAction action = null;
        switch (path) {
            case "/login":
                action = new LoginAction();
                break;
            case "/addSubject":
                action = new AddSubjectAction();
                break;
            case "/logout":
                action = new LogoutAction();
                break;
            case "/allSubjects":
                action = new AllSubjectsAction();
                break;
            case "/oneSubject":
                action = new OneSubjectAction();
                break;
            case "/deleteSubject":
                action = new DeleteSubjectAction();
                break;
            case "/saveSubject":
                action = new SaveAction();
                break;
            case "/updateSubject":
                action = new UpdateSubjectAction();
                break;
            case "/home":
                action = new ReturnToHomeAction();
                break;
            default:
                action = new DefaultRedirectAction();
        }
        return action;
    }
}
