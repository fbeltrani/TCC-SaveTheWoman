/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.savethewoman.dao;

import java.util.List;

/**
 *
 * @author ferbe
 */
public interface GenericDAO 
{
    public Boolean inserir (Object object);//P.O.
    public List<Object> listar();//add importação java.util.List
    public void excluir(int idObject);
    ///Update - Primeiramente Buscar a informação que quer alterar
    //e depois alterar;
    public Object carregar(int idObject);
    public Boolean alterar(Object object); 
}
