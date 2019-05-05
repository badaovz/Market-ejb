package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Guaranty.class)
public class Guaranty_ { 

    public static volatile SingularAttribute<Guaranty, Integer> month;
    public static volatile CollectionAttribute<Guaranty, Product> productCollection;
    public static volatile SingularAttribute<Guaranty, Integer> id;
    public static volatile SingularAttribute<Guaranty, Integer> percent;

}