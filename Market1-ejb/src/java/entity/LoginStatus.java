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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author datvl
 */
@Entity
@Table(name = "LoginStatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginStatus.findAll", query = "SELECT l FROM LoginStatus l"),
    @NamedQuery(name = "LoginStatus.findById", query = "SELECT l FROM LoginStatus l WHERE l.id = :id"),
    @NamedQuery(name = "LoginStatus.findByStatus", query = "SELECT l FROM LoginStatus l WHERE l.status = :status")})
public class LoginStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Status")
    private String status;
    @JoinTable(name = "LoginStatus_Account", joinColumns = {
        @JoinColumn(name = "LoginStatusId", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "AccountId", referencedColumnName = "Id")})
    @ManyToMany
    private Collection<Account> accountCollection;

    public LoginStatus() {
    }

    public LoginStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Account> getAccountCollection() {
        return accountCollection;
    }

    public void setAccountCollection(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
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
        if (!(object instanceof LoginStatus)) {
            return false;
        }
        LoginStatus other = (LoginStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.LoginStatus[ id=" + id + " ]";
    }
    
}
