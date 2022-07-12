/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.model;

import java.util.Date;

/**
 * @author ferbe
 */
public class Denuncia {
    //ATRIBUTOS

    private int idDenuncia;
    private String nomeVitima;
    private String nomeAgressor;
    private String descricaoDenuncia;
    private String relatoDenuncia;
    private Date dataDenuncia;
    private String horaDenuncia;
    private String vitima;

    //Métodos Construtores
    //VAZIO
    public Denuncia() {
    }

    public Denuncia(int idDenuncia, String nomeVitima, String nomeAgressor, String descricaoDenuncia, String relatoDenuncia, Date dataDenuncia, String horaDenuncia, String vitima) {
        this.idDenuncia = idDenuncia;
        this.nomeVitima = nomeVitima;
        this.nomeAgressor = nomeAgressor;
        this.descricaoDenuncia = descricaoDenuncia;
        this.relatoDenuncia = relatoDenuncia;
        this.dataDenuncia = dataDenuncia;
        this.horaDenuncia = horaDenuncia;
        this.vitima = vitima;
    }

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getNomeVitima() {
        return nomeVitima;
    }

    public void setNomeVitima(String nomeVitima) {
        this.nomeVitima = nomeVitima;
    }

    public String getNomeAgressor() {
        return nomeAgressor;
    }

    public void setNomeAgressor(String nomeAgressor) {
        this.nomeAgressor = nomeAgressor;
    }

    public String getDescricaoDenuncia() {
        return descricaoDenuncia;
    }

    public void setDescricaoDenuncia(String descricaoDenuncia) {
        this.descricaoDenuncia = descricaoDenuncia;
    }

    public String getRelatoDenuncia() {
        return relatoDenuncia;
    }

    public void setRelatoDenuncia(String relatoDenuncia) {
        this.relatoDenuncia = relatoDenuncia;
    }

    public Date getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(Date dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }

    public String getHoraDenuncia() {
        return horaDenuncia;
    }

    public void setHoraDenuncia(String horaDenuncia) {
        this.horaDenuncia = horaDenuncia;
    }

    public String getVitima() {
        return vitima;
    }

    public void setVitima(String vitima) {
        this.vitima = vitima;
    }
}
