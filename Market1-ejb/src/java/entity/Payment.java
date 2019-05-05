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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author datvl
 */
@Entity
@Table(name = "Payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findById", query = "SELECT p FROM Payment p WHERE p.id = :id"),
    @NamedQuery(name = "Payment.findByAmount", query = "SELECT p FROM Payment p WHERE p.amount = :amount"),
    @NamedQuery(name = "Payment.findByDate", query = "SELECT p FROM Payment p WHERE p.date = :date"),
    @NamedQuery(name = "Payment.findById2", query = "SELECT p FROM Payment p WHERE p.id2 = :id2"),
    @NamedQuery(name = "Payment.findByNumber", query = "SELECT p FROM Payment p WHERE p.number = :number"),
    @NamedQuery(name = "Payment.findByName", query = "SELECT p FROM Payment p WHERE p.name = :name"),
    @NamedQuery(name = "Payment.findByDescription", query = "SELECT p FROM Payment p WHERE p.description = :description"),
    @NamedQuery(name = "Payment.findByInt1", query = "SELECT p FROM Payment p WHERE p.int1 = :int1"),
    @NamedQuery(name = "Payment.findByDescription2", query = "SELECT p FROM Payment p WHERE p.description2 = :description2"),
    @NamedQuery(name = "Payment.findById3", query = "SELECT p FROM Payment p WHERE p.id3 = :id3"),
    @NamedQuery(name = "Payment.findByName2", query = "SELECT p FROM Payment p WHERE p.name2 = :name2"),
    @NamedQuery(name = "Payment.findByNumber2", query = "SELECT p FROM Payment p WHERE p.number2 = :number2"),
    @NamedQuery(name = "Payment.findByDescription3", query = "SELECT p FROM Payment p WHERE p.description3 = :description3"),
    @NamedQuery(name = "Payment.findByDiscriminator", query = "SELECT p FROM Payment p WHERE p.discriminator = :discriminator")})
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private float amount;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "Id2")
    private Integer id2;
    @Size(max = 255)
    @Column(name = "Number")
    private String number;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Column(name = "Int")
    private Integer int1;
    @Size(max = 255)
    @Column(name = "Description2")
    private String description2;
    @Column(name = "Id3")
    private Integer id3;
    @Size(max = 255)
    @Column(name = "Name2")
    private String name2;
    @Size(max = 255)
    @Column(name = "Number2")
    private String number2;
    @Size(max = 255)
    @Column(name = "Description3")
    private String description3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Discriminator")
    private String discriminator;
    @JoinColumn(name = "OrderId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Order1 orderId;

    public Payment() {
    }

    public Payment(Integer id) {
        this.id = id;
    }

    public Payment(Integer id, float amount, String discriminator) {
        this.id = id;
        this.amount = amount;
        this.discriminator = discriminator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public Integer getId3() {
        return id3;
    }

    public void setId3(Integer id3) {
        this.id3 = id3;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public Order1 getOrderId() {
        return orderId;
    }

    public void setOrderId(Order1 orderId) {
        this.orderId = orderId;
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Payment[ id=" + id + " ]";
    }
    
}
