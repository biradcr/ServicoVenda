/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.servico;

import br.edu.ifsul.modelo.Pessoa;
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
    public Pessoa testaPessoa(@WebParam(name = "pessoa")
            @XmlElement(required = true) Pessoa objeto){
        objeto.setId(9999);
        return objeto;
    }
}
