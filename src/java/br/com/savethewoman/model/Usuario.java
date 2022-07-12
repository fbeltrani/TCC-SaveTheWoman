package br.com.savethewoman.model;

/**
 * @author ferbe
 */
public class Usuario {
    
    private Integer idUsuario;
    private String nome;
    private String telefone;
    private String senha;

    public Usuario(Integer idUsuario, String nome, String telefone, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Usuario() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 
}
