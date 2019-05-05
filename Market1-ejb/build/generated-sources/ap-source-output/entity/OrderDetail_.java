package entity;

import entity.Order1;
import entity.OrderStatus;
import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Integer> quantity;
    public static volatile SingularAttribute<OrderDetail, Product> productId;
    public static volatile SingularAttribute<OrderDetail, Order1> orderId;
    public static volatile SingularAttribute<OrderDetail, Float> price;
    public static volatile CollectionAttribute<OrderDetail, OrderStatus> orderStatusCollection;
    public static volatile SingularAttribute<OrderDetail, Float> discount;
    public static volatile SingularAttribute<OrderDetail, Integer> id;

}