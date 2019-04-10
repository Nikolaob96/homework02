/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Subject;
import service.SubjectService;
import service.impl.SubjectServiceImpl;

/**
 *
 * @author student1
 */
@WebServlet(name = "ServletSubject", urlPatterns = {"/subject"})
public class ServletSubject extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        String page="/main.jsp";
        switch (action) {
            case "add":
                page="/subject.jsp";
                break;
            case "viewAll":
                page="/subjects.jsp";
                List<Subject> allSubjects=new SubjectServiceImpl().getAll();
                request.setAttribute("subjects", allSubjects);
                break;
            case "save":
                String name=request.getParameter("name");
                String description=request.getParameter("description");
                Integer ects=Integer.parseInt(request.getParameter("ects"));
                Subject subject=new Subject(name, description, ects);
                SubjectService subjectService=new SubjectServiceImpl();
                subjectService.add(subject);
                page="/subject.jsp";
                break;
            default:
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/pages"+page).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
