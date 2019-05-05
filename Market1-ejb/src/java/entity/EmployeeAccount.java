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
@Table(name = "EmployeeAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeAccount.findAll", query = "SELECT e FROM EmployeeAccount e"),
    @NamedQuery(name = "EmployeeAccount.findById", query = "SELECT e FROM EmployeeAccount e WHERE e.id = :id"),
    @NamedQuery(name = "EmployeeAccount.findByAccountId", query = "SELECT e FROM EmployeeAccount e WHERE e.accountId = :accountId")})
public class EmployeeAccount implements Serializable {
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
    @JoinColumn(name = "EmployeePersonId", referencedColumnName = "PersonId")
    @ManyToOne(optional = false)
    private Employee employeePersonId;

    public EmployeeAccount() {
    }

    public EmployeeAccount(Integer accountId) {
        this.accountId = accountId;
    }

    public EmployeeAccount(Integer accountId, int id) {
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

    public Employee getEmployeePersonId() {
        return employeePersonId;
    }

    public void setEmployeePersonId(Employee employeePersonId) {
        this.employeePersonId = employeePersonId;
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
        if (!(object instanceof EmployeeAccount)) {
            return false;
        }
        EmployeeAccount other = (EmployeeAccount) object;
        if ((this.accountId == null && other.accountId != null) || (this.accountId != null && !this.accountId.equals(other.accountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.EmployeeAccount[ accountId=" + accountId + " ]";
    }
    
}
