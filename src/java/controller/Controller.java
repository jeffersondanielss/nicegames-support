/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Contact;
import bean.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ContactDAO;
import models.UsuarioDAO;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

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
            
            // start
            
            String mensagem;
            response.setContentType("text/html;charset=UTF-8");
            String flag = request.getParameter("flag");

            if(flag.equalsIgnoreCase("contact")) {

                Contact contact = new Contact();

                contact.setEmail(request.getParameter("email"));
                contact.setSubject(request.getParameter("subject"));
                contact.setPassword(request.getParameter("password"));
                contact.setMessage(request.getParameter("message"));
                

                ContactDAO dao = new ContactDAO();
                UsuarioDAO usuarioDAO = new UsuarioDAO();

                int r = dao.connect();

                if(r == 0) {
                    mensagem = "Erro ao se conectar ao banco de dados";
                    
                } else {
                    
                    if(usuarioDAO.getLogin(contact.getEmail(), contact.getPassword()) >= 1) {
                        r = dao.saveSupport(contact);
                        
                    } else {
                        r = 3;
                    }
                    
                    switch (r) {
                        case 1:  
                            mensagem = "Mensagem Enviada";
                            break;
                        
                        case 2:  
                            mensagem = "Erro!";
                            break;
                            
                        case 3:  
                            mensagem = "Senha ou usuário inválidos";
                            break;
                            
                        default:
                            mensagem = "Erro!";
                    }

                    dao.desconnect();
                }

                request.setAttribute("mensagem", mensagem);
                RequestDispatcher d = request.getRequestDispatcher("cadastrosucesso.jsp");
                d.forward(request,response);


            }         
            
            //end
            
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
