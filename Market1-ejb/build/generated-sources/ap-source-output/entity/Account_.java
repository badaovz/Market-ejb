package entity;

import entity.CustomerAccount;
import entity.EmployeeAccount;
import entity.LoginStatus;
import entity.ProviderAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, EmployeeAccount> employeeAccount;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, CustomerAccount> customerAccount;
    public static volatile CollectionAttribute<Account, LoginStatus> loginStatusCollection;
    public static volatile SingularAttribute<Account, String> username;
    public static volatile SingularAttribute<Account, ProviderAccount> providerAccount;

}