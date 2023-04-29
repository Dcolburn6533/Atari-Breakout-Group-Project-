package AtariBreakout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author kiernan
 */
@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            // If the user entered information into both fields, check the submission type
            if(!request.getParameter("username").equals("") && !request.getParameter("password").equals("")) {
                
                // If the user pressed log in
                if(request.getParameter("logIn") != null) {
                    out.println("<h1>Hello " + request.getParameter("username") +". Your password is " + request.getParameter("password") + " and you pressed  " + request.getParameter("logIn") + "</h1>");
               
                    // If login credentials match a known user within the database, redirect the user to the download link
                    // ADD CODE TO CHECK THE DATABASE AND MATCH WITH THE USERS CREDENTIALS
                    if(request.getParameter("username").equals("Kiernan")) {
                        request.getRequestDispatcher("Download.jsp").forward(request, response);
                    }
                
                    // If login credentials do not match, redirect to the home page with an error message
                    else {
                        request.getRequestDispatcher("Redirect.jsp").forward(request, response);
                    }
                }
                
                // If the user pressed sign up
                else {
                    out.println("<h1>Hello " + request.getParameter("username") +". Your password is " + request.getParameter("password") + " and you pressed  " + request.getParameter("signUp") + "</h1>");
                    
                    /*
                    ADD CODE TO SIGN USER UP WITHIN THE DATABASE
                    */
                    
                    request.getRequestDispatcher("Download.jsp").forward(request, response);
                }
            
            }
            
            // If the user did not enter information for both form fields, redirect to the home page with an error message
            else {
                request.getRequestDispatcher("Redirect.jsp").forward(request, response);
            }
            
        }
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
