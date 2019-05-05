package entity;

import entity.Person;
import entity.Product;
import entity.ProviderAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Provider.class)
public class Provider_ { 

    public static volatile CollectionAttribute<Provider, ProviderAccount> providerAccountCollection;
    public static volatile CollectionAttribute<Provider, Product> productCollection;
    public static volatile SingularAttribute<Provider, Person> person;
    public static volatile SingularAttribute<Provider, Integer> personId;
    public static volatile SingularAttribute<Provider, Integer> id;

}