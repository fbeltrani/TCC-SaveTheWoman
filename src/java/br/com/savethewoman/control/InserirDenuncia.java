/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.control;

import br.com.savethewoman.dao.DenunciaDAOImpl;
import br.com.savethewoman.model.Denuncia;
import br.com.savethewoman.util.Conversoes;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferbe
 */
@WebServlet(name = "InserirDenuncia", urlPatterns = {"/InserirDenuncia"})
public class InserirDenuncia extends HttpServlet {

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
        
        Denuncia oDenuncia = new Denuncia();
        oDenuncia.setNomeVitima(request.getParameter("nomeVitima"));
        oDenuncia.setNomeAgressor(request.getParameter("nomeAgressor"));
        oDenuncia.setDescricaoDenuncia(request.getParameter("descricaoDenuncia"));
        oDenuncia.setRelatoDenuncia(request.getParameter("relatoDenuncia"));
        oDenuncia.setDataDenuncia(Conversoes.converterData(request.getParameter("dataDenuncia")));
        oDenuncia.setHoraDenuncia(request.getParameter("horaDenuncia"));
        oDenuncia.setVitima(request.getParameter("vitima"));
        
        String mensagem = "";
        Integer idDenuncia = null;
        
        try{
            DenunciaDAOImpl dao = new DenunciaDAOImpl();
            if(request.getParameter("idDenuncia").equals("")){
                idDenuncia = dao.inserirI(oDenuncia);
                
                if(idDenuncia != null){
                    mensagem = "Sua denúncia foi realizada";
                } else {
                    mensagem = "Não foi possível cadastrar a denúncia " + oDenuncia.getDescricaoDenuncia() + ". Tente novamente";
                }
            } else{
                oDenuncia.setIdDenuncia(Integer.parseInt(request.getParameter("idDenuncia")));
                if(dao.alterar(oDenuncia)){
                    mensagem = "Denúncia " + oDenuncia.getDescricaoDenuncia() + " alterada com sucesso!";
                } else{
                    mensagem = "Não foi possível alterar a denúncia " + oDenuncia.getDescricaoDenuncia() + ". Tente novamente";
                }
            }
        }catch(Exception ex){
            System.out.println("Erro ao Cadastrar Denuncia - Servlet \n Erro:" + ex.getMessage());
            ex.printStackTrace();
        }
        
        request.setAttribute("mensagem", mensagem);
        request.setAttribute("idDenuncia", idDenuncia);
        request.getRequestDispatcher("ListarDenuncia").forward(request, response);
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
