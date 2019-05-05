package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile SingularAttribute<Rating, String> img;
    public static volatile SingularAttribute<Rating, Product> productId;
    public static volatile SingularAttribute<Rating, String> name;
    public static volatile SingularAttribute<Rating, String> description;
    public static volatile SingularAttribute<Rating, Integer> id;

}