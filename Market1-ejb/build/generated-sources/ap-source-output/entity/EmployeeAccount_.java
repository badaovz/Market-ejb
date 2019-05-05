package entity;

import entity.Account;
import entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(EmployeeAccount.class)
public class EmployeeAccount_ { 

    public static volatile SingularAttribute<EmployeeAccount, Integer> accountId;
    public static volatile SingularAttribute<EmployeeAccount, Employee> employeePersonId;
    public static volatile SingularAttribute<EmployeeAccount, Integer> id;
    public static volatile SingularAttribute<EmployeeAccount, Account> account;

}