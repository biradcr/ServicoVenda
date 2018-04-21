/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ubiratan
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)
    @XmlElement(required = true)
    private Integer id;    
    @Column(name = "nome", length = 50, nullable = false)
    @XmlElement(required = true)
    private String nome;    
    @Column(name = "endereco", length = 50, nullable = false)
    @XmlElement(required = true)
    private String endereco;    
    @XmlElement(required = true)
    @Column(name = "val_compra", nullable = false, columnDefinition = "numerica(5,2)")
    private Double val_compra;    
    @XmlElement(required = true)
    @Column(name = "cep_origem", nullable = false)
    private String cep_origem;    
    @XmlElement(required = true)
    @Column(name = "cep_destino", nullable = false, columnDefinition = "numerica(5,2)")
    private String cep_destino;    
    @XmlElement(required = true)
    @Column(name = "val_frete", nullable = false, columnDefinition = "numerica(5,2)")
    private Double val_frete;
    @XmlElement(required = true)
    @Column(name = "val_total", nullable = false, columnDefinition = "numerica(5,2)")
    private Double val_total;      
    @XmlElement(required = true)
    @Column(name = "prazo_entrega", nullable = false, columnDefinition = "numerica(5,2)")
    private Integer prazo_entrega;    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getVal_compra() {
        return val_compra;
    }

    public void setVal_compra(Double val_compra) {
        this.val_compra = val_compra;
    }

    public String getCep_origem() {
        return cep_origem;
    }

    public void setCep_origem(String cep_origem) {
        this.cep_origem = cep_origem;
    }

    public String getCep_destino() {
        return cep_destino;
    }

    public void setCep_destino(String cep_destino) {
        this.cep_destino = cep_destino;
    }

    public Double getVal_frete() {
        return val_frete;
    }

    public void setVal_frete(Double val_frete) {
        this.val_frete = val_frete;
    }

    public Integer getPrazo_entrega() {
        return prazo_entrega;
    }

    public void setPrazo_entrega(Integer prazo_entrega) {
        this.prazo_entrega = prazo_entrega;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

  
    
    
}
