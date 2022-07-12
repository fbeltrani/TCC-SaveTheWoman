/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.dao;

import br.com.savethewoman.model.Denuncia;
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
public class DenunciaDAOImpl implements GenericDAO{
    
    private Connection conn;
    
    public DenunciaDAOImpl () throws Exception{
        try{
            conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    @Override
    public Boolean inserir(Object object) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }
    
    public Integer inserirI(Object object) {
        Denuncia oDenuncia = (Denuncia) object;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idDenuncia = null;
        
        String sql = "INSERT INTO denuncia("
                    +"nomeVitima, "
                    +"nomeAgressor, "
                    +"descricaoDenuncia, "
                    +"relatoDenuncia, "
                    +"dataDenuncia, "
                    +"horaDenuncia, "
                    +"vitima) "
                    +"VALUES (?, ?, ?, ?, ?, ?, ?) Returning(idDenuncia)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oDenuncia.getNomeVitima());
            stmt.setString(2, oDenuncia.getNomeAgressor());
            stmt.setString(3, oDenuncia.getDescricaoDenuncia());
            stmt.setString(4, oDenuncia.getRelatoDenuncia());
            stmt.setDate(5, new java.sql.Date(oDenuncia.getDataDenuncia().getTime()));
            stmt.setString(6, oDenuncia.getHoraDenuncia());
            stmt.setString(7, oDenuncia.getVitima());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                idDenuncia = rs.getInt("idDenuncia");
            }
            
        }catch(Exception ex){
            System.out.println("Erro ao inserir nova denúncia - DAO \n Erro: " +ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar conn - DAO \n Erro: " +ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idDenuncia;
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM denuncia";
        
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Denuncia oDenuncia = new Denuncia();
                oDenuncia.setIdDenuncia(rs.getInt("idDenuncia"));
                oDenuncia.setNomeVitima(rs.getString("nomeVitima"));
                oDenuncia.setNomeAgressor(rs.getString("nomeAgressor"));
                oDenuncia.setDescricaoDenuncia(rs.getString("descricaoDenuncia"));
                oDenuncia.setRelatoDenuncia(rs.getString("relatoDenuncia"));
                oDenuncia.setDataDenuncia(rs.getDate("dataDenuncia"));
                oDenuncia.setHoraDenuncia(rs.getString("horaDenuncia"));
                oDenuncia.setVitima(rs.getString("vitima"));
                
                resultado.add(oDenuncia);
            }
        }catch(SQLException ex){
            System.out.println("Erro ao Listar Denuncia." +ex.getMessage());
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
        Denuncia oDenuncia = null;
        String sql = "SELECT * FROM denuncia"
                    +" where idDenuncia = ?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                oDenuncia = new Denuncia();
                oDenuncia.setNomeVitima(rs.getString("nomeVitima"));
                oDenuncia.setNomeAgressor(rs.getString("nomeAgressor"));
                oDenuncia.setDescricaoDenuncia(rs.getString("descricaoDenuncia"));
                oDenuncia.setRelatoDenuncia(rs.getString("relatoDenuncia"));
                oDenuncia.setDataDenuncia(rs.getDate("dataDenuncia"));
                oDenuncia.setHoraDenuncia(rs.getString("horaDenuncia"));
                oDenuncia.setVitima(rs.getString("vitima"));
                oDenuncia.setIdDenuncia(rs.getInt("idDenuncia"));
            }
        }catch(Exception ex){
            System.out.println("Erro ao carregar Denuncia!\n Erro: " +ex.getMessage());
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
        return oDenuncia;
    }

    @Override
    public Boolean alterar(Object object) {
        Denuncia oDenuncia = (Denuncia) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE denuncia set "
                    +"nomeVitima=?, "
                    +"nomeAgressor=?, "
                    +"descricaoDenuncia=?, "
                    +"relatoDenuncia=?, "
                    +"dataDenuncia=?, "
                    +"horaDenuncia=?, "
                    +"vitima=? "
                    +"where idDenuncia=?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oDenuncia.getNomeVitima());
            stmt.setString(2, oDenuncia.getNomeAgressor());
            stmt.setString(3, oDenuncia.getDescricaoDenuncia());
            stmt.setString(4, oDenuncia.getRelatoDenuncia());
            stmt.setDate(5, new java.sql.Date(oDenuncia.getDataDenuncia().getTime()));
            stmt.setString(6, oDenuncia.getHoraDenuncia());
            stmt.setString(7, oDenuncia.getVitima());
            stmt.setInt(8, oDenuncia.getIdDenuncia());
            stmt.executeUpdate();
            
            return true;
            
        }catch(Exception ex){
            System.out.println("Erro ao alterar Denuncia!\n Erro: " +ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
               ConnectionFactory.closeConnection(conn, stmt); 
            }
            catch(Exception ex){
                System.out.println("Problemas ao fechar os parâmetros da conexão! \n Erro: " +ex.getMessage());
                ex.printStackTrace();
            }
        }
    }  
}
