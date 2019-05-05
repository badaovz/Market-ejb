package entity;

import entity.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(DeliveryAddress.class)
public class DeliveryAddress_ { 

    public static volatile SingularAttribute<DeliveryAddress, String> address;
    public static volatile SingularAttribute<DeliveryAddress, Order1> orderId;
    public static volatile SingularAttribute<DeliveryAddress, String> description;
    public static volatile SingularAttribute<DeliveryAddress, Integer> id;

}