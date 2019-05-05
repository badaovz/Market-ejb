/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author datvl
 */
@Entity
@Table(name = "ProviderAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProviderAccount.findAll", query = "SELECT p FROM ProviderAccount p"),
    @NamedQuery(name = "ProviderAccount.findById", query = "SELECT p FROM ProviderAccount p WHERE p.id = :id"),
    @NamedQuery(name = "ProviderAccount.findByAccountId", query = "SELECT p FROM ProviderAccount p WHERE p.accountId = :accountId")})
public class ProviderAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private int id;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AccountId")
    private Integer accountId;
    @JoinColumn(name = "AccountId", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Account account;
    @JoinColumn(name = "ProviderPersonId", referencedColumnName = "PersonId")
    @ManyToOne(optional = false)
    private Provider providerPersonId;

    public ProviderAccount() {
    }

    public ProviderAccount(Integer accountId) {
        this.accountId = accountId;
    }

    public ProviderAccount(Integer accountId, int id) {
        this.accountId = accountId;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Provider getProviderPersonId() {
        return providerPersonId;
    }

    public void setProviderPersonId(Provider providerPersonId) {
        this.providerPersonId = providerPersonId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountId != null ? accountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProviderAccount)) {
            return false;
        }
        ProviderAccount other = (ProviderAccount) object;
        if ((this.accountId == null && other.accountId != null) || (this.accountId != null && !this.accountId.equals(other.accountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ProviderAccount[ accountId=" + accountId + " ]";
    }
    
}
