package entity;

import entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Salary.class)
public class Salary_ { 

    public static volatile SingularAttribute<Salary, Date> finishdate;
    public static volatile SingularAttribute<Salary, Employee> employeePersonId;
    public static volatile SingularAttribute<Salary, Integer> id;
    public static volatile SingularAttribute<Salary, Float> salary;
    public static volatile SingularAttribute<Salary, Date> startdate;

}