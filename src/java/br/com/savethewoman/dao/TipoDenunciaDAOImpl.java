/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.dao;

import br.com.savethewoman.model.TipoDenuncia;
import br.com.savethewoman.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ferbe
 */
public class TipoDenunciaDAOImpl implements GenericDAO{
    
    private Connection conn;
    
    public TipoDenunciaDAOImpl() throws Exception{
        try{
            conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean inserir(Object object) {
        TipoDenuncia oTipo = (TipoDenuncia) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tipoDenuncia("
                    +"nomeTipoDe)"
                    +"VALUES(?)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oTipo.getNomeTipoDe());
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar novo tipo de denúncia \n Erro: " +ex.getMessage());
            ex.printStackTrace();
            return false;
            
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar conn - DAO \n Erro: " +ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM tipoDenuncia";
        
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                TipoDenuncia oTipo = new TipoDenuncia();
                oTipo.setIdTipoDe(rs.getInt("idTipoDe"));
                oTipo.setNomeTipoDe(rs.getString("nomeTipoDe"));
                
                resultado.add(oTipo);
            }
        }catch(SQLException ex){
            System.out.println("Erro ao Listar Tipo Denuncia." +ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar parâmetros de execução." + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoDenuncia oTipo = null;
        
        String sql = "Select * from tipoDenuncia"
                    +" where idTipoDe = ?";
        
        try{
           stmt = conn.prepareStatement(sql);
           stmt.setInt(1, idObject);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                oTipo = new TipoDenuncia();
                oTipo.setNomeTipoDe(rs.getString("nomeTipoDe"));
                oTipo.setIdTipoDe(rs.getInt("idTipoDe"));
           }
        } 
        catch (SQLException ex) {
            System.out.println("Erro ao carregar TipoDenuncia!\n Erro: " +ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt, rs);
            }
            catch(Exception ex){
                System.out.println("Erro ao fechar parâmetros de execução " +ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oTipo;
    }

    @Override
    public Boolean alterar(Object object) {
        TipoDenuncia oTipo = (TipoDenuncia) object;
        PreparedStatement stmt = null;
        String sql = "update tipoDenuncia set "
                    +"nomeTipoDe=? "
                    +"where idTipoDe=?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oTipo.getNomeTipoDe());
            stmt.setInt(2, oTipo.getIdTipoDe());
            
            stmt.executeUpdate();
            return true;
        }catch(Exception ex){
            System.out.println("Erro ao alterar Tipo Denuncia!\n Erro: " +ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar os parãmetros da conexão! \n Erro: " +ex.getMessage());
                ex.printStackTrace();
            }
        }
    }   
}
