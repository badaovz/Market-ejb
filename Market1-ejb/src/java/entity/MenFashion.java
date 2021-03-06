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
@Table(name = "MenFashion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenFashion.findAll", query = "SELECT m FROM MenFashion m"),
    @NamedQuery(name = "MenFashion.findById", query = "SELECT m FROM MenFashion m WHERE m.id = :id"),
    @NamedQuery(name = "MenFashion.findByProductId", query = "SELECT m FROM MenFashion m WHERE m.productId = :productId")})
public class MenFashion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private int id;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductId")
    private Integer productId;
    @JoinColumn(name = "ProductId", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public MenFashion() {
    }

    public MenFashion(Integer productId) {
        this.productId = productId;
    }

    public MenFashion(Integer productId, int id) {
        this.productId = productId;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenFashion)) {
            return false;
        }
        MenFashion other = (MenFashion) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MenFashion[ productId=" + productId + " ]";
    }
    
}
