/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package br.edu.ifsul.servico;
//
//import br.edu.ifsul.ejb.PessoaDAO;
//import br.edu.ifsul.modelo.Pessoa;
//import java.util.List;
//import javax.ejb.EJB;
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebService;
//import javax.xml.bind.annotation.XmlElement;
//
///**
// *
// * @author ubiratan
// */
//@WebService
//public class ServicoCliente {
//    
//    @EJB
//    private PessoaDAO dao;
//    
//    public ServicoCliente(){
//        
//    }
//    
//    @WebMethod
//    public List<Pessoa> listaPessoas(){
//        return dao.getLista();                
//    }
//    
//    @WebMethod
//    public Pessoa inserir(@WebParam(name = "pessoa")
//            @XmlElement(required = true)Pessoa obj){
//        return dao.inserir(obj);
//    }
//    
//    @WebMethod
//    public Pessoa alterar(@WebParam(name = "pessoa")
//            @XmlElement(required = true)Pessoa obj){
//        return dao.alterar(obj);
//    }
//    
//    @WebMethod
//    public boolean remover(@WebParam(name = "pessoa")
//            @XmlElement(required = true) Integer id){
//        return dao.remover(id);
//    }
//}
package br.edu.ifsul.servico;

import br.edu.ifsul.ejb.PessoaDAO;
import br.edu.ifsul.modelo.Pessoa;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@WebService
public class ServicoCliente {
    
    @EJB    
    private PessoaDAO dao;
    
    public ServicoCliente(){
        
    }
    
    @WebMethod
    public List<Pessoa> listaPessoas(){
        return dao.getLista();
    }
    
    @WebMethod
    public Pessoa inserir(@WebParam(name = "pessoa")
            @XmlElement(required = true) Pessoa obj){
        return dao.inserir(obj);
    }
    
    @WebMethod
    public Pessoa alterar(@WebParam(name = "pessoa")
            @XmlElement(required = true) Pessoa obj){
        return dao.alterar(obj);
    }
    
    @WebMethod
    public boolean remover(@WebParam(name = "id")
            @XmlElement(required = true) Integer id){
        return dao.remover(id);
    }

}
