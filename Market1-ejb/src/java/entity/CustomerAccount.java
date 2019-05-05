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
@Table(name = "CustomerAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerAccount.findAll", query = "SELECT c FROM CustomerAccount c"),
    @NamedQuery(name = "CustomerAccount.findById", query = "SELECT c FROM CustomerAccount c WHERE c.id = :id"),
    @NamedQuery(name = "CustomerAccount.findByAccountId", query = "SELECT c FROM CustomerAccount c WHERE c.accountId = :accountId")})
public class CustomerAccount implements Serializable {
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
    @JoinColumn(name = "CustomerPersonId", referencedColumnName = "PersonId")
    @ManyToOne(optional = false)
    private Customer customerPersonId;

    public CustomerAccount() {
    }

    public CustomerAccount(Integer accountId) {
        this.accountId = accountId;
    }

    public CustomerAccount(Integer accountId, int id) {
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

    public Customer getCustomerPersonId() {
        return customerPersonId;
    }

    public void setCustomerPersonId(Customer customerPersonId) {
        this.customerPersonId = customerPersonId;
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
        if (!(object instanceof CustomerAccount)) {
            return false;
        }
        CustomerAccount other = (CustomerAccount) object;
        if ((this.accountId == null && other.accountId != null) || (this.accountId != null && !this.accountId.equals(other.accountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CustomerAccount[ accountId=" + accountId + " ]";
    }
    
}
