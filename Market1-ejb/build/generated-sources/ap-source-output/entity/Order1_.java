package entity;

import entity.Customer;
import entity.DeliveryAddress;
import entity.OrderDetail;
import entity.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Customer> customerPersonId;
    public static volatile SingularAttribute<Order1, Integer> amount;
    public static volatile CollectionAttribute<Order1, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<Order1, Float> price;
    public static volatile CollectionAttribute<Order1, DeliveryAddress> deliveryAddressCollection;
    public static volatile SingularAttribute<Order1, String> id;
    public static volatile CollectionAttribute<Order1, Payment> paymentCollection;

}