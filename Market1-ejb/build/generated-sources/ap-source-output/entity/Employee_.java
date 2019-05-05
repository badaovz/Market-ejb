package entity;

import entity.Department;
import entity.EmployeeAccount;
import entity.Person;
import entity.Position;
import entity.Salary;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile CollectionAttribute<Employee, Salary> salaryCollection;
    public static volatile SingularAttribute<Employee, Person> person;
    public static volatile CollectionAttribute<Employee, EmployeeAccount> employeeAccountCollection;
    public static volatile CollectionAttribute<Employee, Position> positionCollection;
    public static volatile SingularAttribute<Employee, Integer> personId;
    public static volatile SingularAttribute<Employee, Integer> id;
    public static volatile SingularAttribute<Employee, String> empno;
    public static volatile CollectionAttribute<Employee, Department> departmentCollection;

}