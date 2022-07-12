/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.dao;

import br.com.savethewoman.model.Contato;
import br.com.savethewoman.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferbe
 */
public class ContatoDAOImpl implements GenericDAO{
    
    private Connection conn;
    
    public ContatoDAOImpl () throws Exception{
        try{
            conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean inserir(Object object) {
        Contato oContato = (Contato) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO contato("
                    +"nomeContato, "
                    +"numeroContato, "
                    +"emailContato)"
                    +"VALUES (?, ?, ?)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oContato.getNomeContato());
            stmt.setString(2, oContato.getNumeroContato());
            stmt.setString(3, oContato.getEmailContato());
            stmt.execute();
            return true;
            
        }
        catch(Exception ex){
            System.out.println("Erro ao inserir novo contato - DAO \n Erro: " +ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally{
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
        String sql = "SELECT * FROM contato";
        
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Contato oContato = new Contato();
                oContato.setIdContato(rs.getInt("idContato"));
                oContato.setNomeContato(rs.getString("nomeContato"));
                oContato.setNumeroContato(rs.getString("numeroContato"));
                oContato.setEmailContato(rs.getString("emailContato"));
                
                resultado.add(oContato);
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao Listar Contato." +ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
               ConnectionFactory.closeConnection(conn, stmt, rs); 
            }
            catch(Exception ex){
                System.out.println("Problemas ao fechar parâmetros de execução." + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM contato "
                    +" where idContato = ?";
         try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
         }
         catch(Exception ex){
            System.out.println("Erro ao excluir Contato!\n Erro: " +ex.getMessage());
            ex.printStackTrace();
         }finally{
             try{
                ConnectionFactory.closeConnection (conn, stmt); 
             }
             catch(Exception ex){
                System.out.println("Problemas ao fechar os parãmetros da conexão! \n Erro: " +ex.getMessage());
                ex.printStackTrace();  
             }
         }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Contato oContato = null;
        String sql = "SELECT * FROM contato"
                    +" where idContato = ?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                oContato = new Contato();
                oContato.setNomeContato(rs.getString("nomeContato"));
                oContato.setNumeroContato(rs.getString("numeroContato"));
                oContato.setEmailContato(rs.getString("emailContato"));
                oContato.setIdContato(rs.getInt("idContato"));
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao carregar Contato!\n Erro: " +ex.getMessage());
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
        return oContato;
    }

    @Override
    public Boolean alterar(Object object) {
        Contato oContato = (Contato) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE contato set "
                    +"nomeContato=?, "
                    +"numeroContato=?,"
                    +"emailContato=? "
                    +"where idContato=?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oContato.getNomeContato());
            stmt.setString(2, oContato.getNumeroContato());
            stmt.setString(3, oContato.getEmailContato());
            stmt.setInt(4, oContato.getIdContato());
            
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println("Erro ao alterar Contato!\n Erro: " +ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar os parâmetros da conexão! \n Erro: " +ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}