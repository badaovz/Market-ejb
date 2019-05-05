package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Quantity.class)
public class Quantity_ { 

    public static volatile SingularAttribute<Quantity, Integer> total;
    public static volatile SingularAttribute<Quantity, Integer> quantity;
    public static volatile SingularAttribute<Quantity, Product> productId;
    public static volatile SingularAttribute<Quantity, Integer> id;

}