/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "bloco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bloco.findAll", query = "SELECT b FROM Bloco b")
    , @NamedQuery(name = "Bloco.findById", query = "SELECT b FROM Bloco b WHERE b.id = :id")
    , @NamedQuery(name = "Bloco.findByCodigo", query = "SELECT b FROM Bloco b WHERE b.codigo = :codigo")
    , @NamedQuery(name = "Bloco.findByAtivo", query = "SELECT b FROM Bloco b WHERE b.ativo = :ativo")})
public class Bloco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "ativo")
    private boolean ativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBloco")
    private Collection<Sala> salaCollection;

    public Bloco() {
    }

    public Bloco(Integer id) {
        this.id = id;
    }

    public Bloco(Integer id, String codigo, boolean ativo) {
        this.id = id;
        this.codigo = codigo;
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @XmlTransient
    public Collection<Sala> getSalaCollection() {
        return salaCollection;
    }

    public void setSalaCollection(Collection<Sala> salaCollection) {
        this.salaCollection = salaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloco)) {
            return false;
        }
        Bloco other = (Bloco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Bloco[ id=" + id + " ]";
    }
    
}