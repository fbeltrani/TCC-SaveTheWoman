/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.model;
/**
 * @author ferbe
 */
public class Contato {
        //ATRIBUTOS
        private int idContato;
        private String nomeContato;
        private String numeroContato;
        private String emailContato;
        
        //Métodos Construtores
        
        //VAZIO
        public Contato (){
        }
        
        //CHEIO
        public Contato (int idContato, String nomeContato, String numeroContato, String email){
            this.idContato = idContato;
            this.nomeContato = nomeContato;
            this.numeroContato = numeroContato;
            this.emailContato = emailContato;
        }

    //Definindo os métodos SETS E GETS
    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }    

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    
}
