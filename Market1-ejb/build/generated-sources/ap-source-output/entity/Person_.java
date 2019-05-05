package entity;

import entity.Address;
import entity.Contact;
import entity.Customer;
import entity.Employee;
import entity.Provider;
import entity.PupularCustomer;
import entity.VipCustomer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Date> birthday;
    public static volatile CollectionAttribute<Person, Address> addressCollection;
    public static volatile SingularAttribute<Person, PupularCustomer> pupularCustomer;
    public static volatile SingularAttribute<Person, String> gender;
    public static volatile SingularAttribute<Person, Provider> provider;
    public static volatile CollectionAttribute<Person, Contact> contactCollection;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile SingularAttribute<Person, String> fullname;
    public static volatile SingularAttribute<Person, Employee> employee;
    public static volatile SingularAttribute<Person, VipCustomer> vipCustomer;
    public static volatile SingularAttribute<Person, Customer> customer;

}