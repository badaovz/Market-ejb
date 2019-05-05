package entity;

import entity.Cart;
import entity.CustomerAccount;
import entity.Order1;
import entity.Person;
import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile CollectionAttribute<Customer, Cart> cartCollection;
    public static volatile CollectionAttribute<Customer, CustomerAccount> customerAccountCollection;
    public static volatile CollectionAttribute<Customer, Order1> order1Collection;
    public static volatile CollectionAttribute<Customer, Product> productCollection;
    public static volatile SingularAttribute<Customer, Person> person;
    public static volatile SingularAttribute<Customer, Integer> personId;
    public static volatile SingularAttribute<Customer, Integer> id;

}