/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.ejb;

import br.edu.ifsul.modelo.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ubiratan
 */
@Stateless
public class clienteDAO implements Serializable{
    
    private List<Cliente> lista;
    @PersistenceContext(unitName = "ServicoPessoaPU")
    private EntityManager em;

    public clienteDAO() {
        lista = new ArrayList<>();
    }
    
    public Cliente inserir(Cliente obj){
        obj.setId(null);
        em.persist(obj);
        return obj;
    }
    
    public Cliente alterar(Cliente obj){
        em.merge(obj);
        return obj;
    }
    
    public boolean remover(Integer id){
        try {
            Cliente obj = em.find(Cliente.class, id);
            em.remove(obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    

    public List<Cliente> getLista() {
        return em.createQuery("from pessoa").getResultList();
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }
    
}
