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
@Table(name = "PupularCustomer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PupularCustomer.findAll", query = "SELECT p FROM PupularCustomer p"),
    @NamedQuery(name = "PupularCustomer.findById", query = "SELECT p FROM PupularCustomer p WHERE p.id = :id"),
    @NamedQuery(name = "PupularCustomer.findByPersonId", query = "SELECT p FROM PupularCustomer p WHERE p.personId = :personId")})
public class PupularCustomer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private int id;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PersonId")
    private Integer personId;
    @JoinColumn(name = "PersonId", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Person person;

    public PupularCustomer() {
    }

    public PupularCustomer(Integer personId) {
        this.personId = personId;
    }

    public PupularCustomer(Integer personId, int id) {
        this.personId = personId;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personId != null ? personId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PupularCustomer)) {
            return false;
        }
        PupularCustomer other = (PupularCustomer) object;
        if ((this.personId == null && other.personId != null) || (this.personId != null && !this.personId.equals(other.personId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PupularCustomer[ personId=" + personId + " ]";
    }
    
}
