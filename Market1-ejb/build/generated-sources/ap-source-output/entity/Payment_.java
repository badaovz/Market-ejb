package entity;

import entity.Order1;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Date> date;
    public static volatile SingularAttribute<Payment, Float> amount;
    public static volatile SingularAttribute<Payment, Order1> orderId;
    public static volatile SingularAttribute<Payment, String> description;
    public static volatile SingularAttribute<Payment, String> number2;
    public static volatile SingularAttribute<Payment, String> description2;
    public static volatile SingularAttribute<Payment, String> description3;
    public static volatile SingularAttribute<Payment, String> discriminator;
    public static volatile SingularAttribute<Payment, String> number;
    public static volatile SingularAttribute<Payment, Integer> int1;
    public static volatile SingularAttribute<Payment, Integer> id2;
    public static volatile SingularAttribute<Payment, String> name;
    public static volatile SingularAttribute<Payment, Integer> id3;
    public static volatile SingularAttribute<Payment, Integer> id;
    public static volatile SingularAttribute<Payment, String> name2;

}