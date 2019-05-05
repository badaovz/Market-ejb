package entity;

import entity.Customer;
import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, Customer> customerPersonId;
    public static volatile CollectionAttribute<Cart, Product> productCollection;
    public static volatile SingularAttribute<Cart, Integer> id;

}