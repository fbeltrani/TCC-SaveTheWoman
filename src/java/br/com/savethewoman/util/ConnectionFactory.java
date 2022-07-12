/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ferbe
 */
public class ConnectionFactory {
    
     public static Connection getConnection() throws Exception{
        try{
            //Abrir Conexão
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto", "postgres", "123456");
        }
        catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public static Connection conectar() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/projeto";
        String user = "postgres";
        String password = "123456";

        try {
            /*Chamar o Driver que vai fazer a conexão*/
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            throw new Exception("Erro ao conectar" + ex.getMessage());
        }
    }

    //Fechar Conexão
    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public static void closeConnection(Connection conn) throws Exception {
        close(conn, null, null);
    }

    public static void closeConnection(Connection conn, Statement stmt) throws Exception {
        close(conn, stmt, null);
    }

    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        close(conn, stmt, rs);
    }
}
