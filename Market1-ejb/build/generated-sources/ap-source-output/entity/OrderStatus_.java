package entity;

import entity.OrderDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(OrderStatus.class)
public class OrderStatus_ { 

    public static volatile SingularAttribute<OrderStatus, Date> date;
    public static volatile SingularAttribute<OrderStatus, String> name;
    public static volatile SingularAttribute<OrderStatus, String> description;
    public static volatile SingularAttribute<OrderStatus, Integer> id;
    public static volatile SingularAttribute<OrderStatus, OrderDetail> orderDetailId;

}