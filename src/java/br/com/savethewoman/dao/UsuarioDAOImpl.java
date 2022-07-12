package br.com.savethewoman.dao;

import br.com.savethewoman.model.Usuario;
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
public class UsuarioDAOImpl implements GenericDAO {

    private Connection conn;

    public UsuarioDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso.");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean inserir(Object object) {
        Usuario oUser = (Usuario) object;
        PreparedStatement stmt = null;

        String sql = "INSERT into usuario("
                + "nome, "
                + "telefone, "
                + "senha) "
                + "VALUES (?, ?, ?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oUser.getNome());
            stmt.setString(2, oUser.getTelefone());
            stmt.setString(3, oUser.getSenha());

            stmt.execute();
            return true;

        } catch (Exception ex) {
            System.out.println("Erro ao inserir usuário - DAO \n Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conn - DAO \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM usuario "
                + "ORDER BY nome;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario oUser = new Usuario();
                oUser.setIdUsuario(rs.getInt("idUsuario"));
                oUser.setNome(rs.getString("nome"));
                oUser.setTelefone(rs.getString("telefone"));
                oUser.setSenha(rs.getString("senha"));
                resultado.add(oUser);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Usuário \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão. \n Erro: " + ex.getMessage());
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
        Usuario oUser = null;

        String sql = "SELECT * FROM usuario "
                + "WHERE  idusuario =?; ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            if (rs.next()) {
                oUser = new Usuario();

                oUser.setIdUsuario(rs.getInt("idUsuario"));
                oUser.setNome(rs.getString("nome"));
                oUser.setTelefone(rs.getString("telefone"));
                oUser.setSenha(rs.getString("senha"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar Usuario \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão. \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oUser;
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario logarUser(String telefone, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario oUser = null;

        String sql = "select * from usuario "
                + "WHERE telefone=? "
                + "AND senha=?; ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, telefone);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                oUser = new Usuario();
                oUser.setIdUsuario(rs.getInt("idUsuario"));
                oUser.setNome(rs.getString("nome"));
                oUser.setTelefone(rs.getString("telefone"));
                oUser.setSenha(rs.getString("senha"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar Usuário \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão. \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return oUser;
    }
}
