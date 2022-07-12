/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.model;
/**
 * @author ferbe
 */
public class TipoDenuncia {
    // ATRIBUTOS
    private int idTipoDe;
    private String nomeTipoDe;
    
    //Métodos Construtores
    // VAZIO
    public TipoDenuncia(){    
    }
    
    //CHEIO
    public TipoDenuncia(int idTipoDe, String nomeTipoDe){
        this.idTipoDe = idTipoDe;
        this.nomeTipoDe = nomeTipoDe;
    }
    
    //Definindo os métodos SETS E GETS
    public void setIdTipoDe(int idTipoDe){
        this.idTipoDe = idTipoDe;
    }
    public int getIdTipoDe(){
        return(idTipoDe);
    }
    public void setNomeTipoDe(String nomeTipoDe){
        this.nomeTipoDe = nomeTipoDe;
    }
    public String getNomeTipoDe(){
        return(nomeTipoDe);
    }
}
