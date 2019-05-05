/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author datvl
 */
@Entity
@Table(name = "Guaranty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guaranty.findAll", query = "SELECT g FROM Guaranty g"),
    @NamedQuery(name = "Guaranty.findById", query = "SELECT g FROM Guaranty g WHERE g.id = :id"),
    @NamedQuery(name = "Guaranty.findByMonth", query = "SELECT g FROM Guaranty g WHERE g.month = :month"),
    @NamedQuery(name = "Guaranty.findByPercent", query = "SELECT g FROM Guaranty g WHERE g.percent = :percent")})
public class Guaranty implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Month")
    private int month;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Percent")
    private int percent;
    @ManyToMany(mappedBy = "guarantyCollection")
    private Collection<Product> productCollection;

    public Guaranty() {
    }

    public Guaranty(Integer id) {
        this.id = id;
    }

    public Guaranty(Integer id, int month, int percent) {
        this.id = id;
        this.month = month;
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
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
        if (!(object instanceof Guaranty)) {
            return false;
        }
        Guaranty other = (Guaranty) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Guaranty[ id=" + id + " ]";
    }
    
}
