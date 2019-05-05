package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Type.class)
public class Type_ { 

    public static volatile CollectionAttribute<Type, Product> productCollection;
    public static volatile SingularAttribute<Type, String> name;
    public static volatile SingularAttribute<Type, String> description;
    public static volatile SingularAttribute<Type, Integer> id;

}