/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.control;

import br.com.savethewoman.dao.UsuarioDAOImpl;
import br.com.savethewoman.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ferbe
 */
@WebServlet(name = "LogarUsuario", urlPatterns = {"/LogarUsuario"})
public class LogarUsuario extends HttpServlet {

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

        String mensagem = "";

        if (request.getParameter("acao").equals("logar")) {

            String telefone = request.getParameter("telefone");
            String senha = request.getParameter("senha");

            if (!telefone.equals("") && !senha.equals("")) {
                try {
                    UsuarioDAOImpl dao = new UsuarioDAOImpl();
                    Usuario oUser = dao.logarUser(telefone, senha);

                    if (oUser != null) {
                        HttpSession session = request.getSession(true);
                        session.setAttribute("usuario", oUser);
                        session.setAttribute("saudacao", mensagem);
                        request.getRequestDispatcher("home.jsp").forward(request, response);
                    } else {
                        mensagem = "Você não tem permissão para acessar o sistema. Fale com um Administrador para poder ser resolvido.";
                        request.setAttribute("mensagem", mensagem);
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                } catch (Exception ex) {
                    System.out.println("Erro ao logar Usuário" + ex.getMessage());
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } else {
                mensagem = "Telefone ou Senha com campos vazios. Verifique e tente novamente";
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else if (request.getParameter("acao").equals("logout")) {
            //EXECUTA O LOGOUT
            response.sendRedirect("login.jsp");
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
