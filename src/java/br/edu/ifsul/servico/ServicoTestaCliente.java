/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.servico;

import br.edu.ifsul.modelo.Cliente;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author ubiratan
 */
@WebService
public class ServicoTestaCliente {
    
    @WebMethod
    public Cliente testaCliente(@WebParam(name = "cliente")
            @XmlElement(required = true) Cliente objeto){
        objeto.setNome("João Borges");
        objeto.setEndereco("Avenida Presidente Vargas, 1313");
        objeto.setCep_origem("99020020");
        objeto.setCep_destino("99030030");
        objeto.setPrazo_entrega(10);
        objeto.setVal_frete(100.00);
        objeto.setVal_compra(150.00);
        objeto.setVal_total(110.00);
        return objeto;
    }
}
