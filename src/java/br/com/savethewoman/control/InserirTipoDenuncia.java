/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.control;

import br.com.savethewoman.dao.GenericDAO;
import br.com.savethewoman.dao.TipoDenunciaDAOImpl;
import br.com.savethewoman.model.Denuncia;
import br.com.savethewoman.model.TipoDenuncia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferbe
 */
@WebServlet(name = "InserirTipoDenuncia", urlPatterns = {"/InserirTipoDenuncia"})
public class InserirTipoDenuncia extends HttpServlet {

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
        
        TipoDenuncia oTipo = new TipoDenuncia();
        
        oTipo.setNomeTipoDe(request.getParameter("nomeTipoDe"));
        
        String mensagem="";
        
        try{
            GenericDAO dao = new TipoDenunciaDAOImpl();
            if(request.getParameter("idTipoDe").equals("")){
                if(dao.inserir(oTipo)){
                    mensagem = "Tipo Denuncia " + oTipo.getNomeTipoDe() + " cadastrado com sucesso.";
                }else{
                    mensagem = "Tipo Denuncia " + oTipo.getNomeTipoDe() + " erro ao cadastrar.";
                }
            }else{
                oTipo.setIdTipoDe(Integer.parseInt(request.getParameter("idTipoDe")));
                if(dao.alterar(oTipo)){
                    mensagem = "Tipo Denuncia " + oTipo.getNomeTipoDe() + " alterado com sucesso.";
                }else{
                    mensagem = "Tipo Denuncia " + oTipo.getNomeTipoDe() + " erro ao alterar.";
                }
            }
        }catch(Exception ex){
            System.out.println("Erro ao Cadastrar Tipo Denuncia - Servlet \n Erro:" + ex.getMessage());
            ex.printStackTrace();
        }
        
        request.setAttribute("mensagem", mensagem);
        request.getRequestDispatcher("ListarTipoDenuncia").forward(request, response);
       
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
