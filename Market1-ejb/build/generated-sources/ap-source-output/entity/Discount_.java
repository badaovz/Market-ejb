package entity;

import entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Discount.class)
public class Discount_ { 

    public static volatile CollectionAttribute<Discount, Product> productCollection;
    public static volatile SingularAttribute<Discount, Date> finishDate;
    public static volatile SingularAttribute<Discount, Integer> id;
    public static volatile SingularAttribute<Discount, Integer> percent;
    public static volatile SingularAttribute<Discount, Date> startDate;

}