package entity;

import entity.Account;
import entity.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(CustomerAccount.class)
public class CustomerAccount_ { 

    public static volatile SingularAttribute<CustomerAccount, Integer> accountId;
    public static volatile SingularAttribute<CustomerAccount, Customer> customerPersonId;
    public static volatile SingularAttribute<CustomerAccount, Integer> id;
    public static volatile SingularAttribute<CustomerAccount, Account> account;

}