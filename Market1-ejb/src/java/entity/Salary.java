/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author datvl
 */
@Entity
@Table(name = "Salary")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salary.findAll", query = "SELECT s FROM Salary s"),
    @NamedQuery(name = "Salary.findById", query = "SELECT s FROM Salary s WHERE s.id = :id"),
    @NamedQuery(name = "Salary.findBySalary", query = "SELECT s FROM Salary s WHERE s.salary = :salary"),
    @NamedQuery(name = "Salary.findByStartdate", query = "SELECT s FROM Salary s WHERE s.startdate = :startdate"),
    @NamedQuery(name = "Salary.findByFinishdate", query = "SELECT s FROM Salary s WHERE s.finishdate = :finishdate")})
public class Salary implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Salary")
    private float salary;
    @Column(name = "Startdate")
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @Column(name = "Finishdate")
    @Temporal(TemporalType.DATE)
    private Date finishdate;
    @JoinColumn(name = "EmployeePersonId", referencedColumnName = "PersonId")
    @ManyToOne(optional = false)
    private Employee employeePersonId;

    public Salary() {
    }

    public Salary(Integer id) {
        this.id = id;
    }

    public Salary(Integer id, float salary) {
        this.id = id;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salary)) {
            return false;
        }
        Salary other = (Salary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Salary[ id=" + id + " ]";
    }
    
}
