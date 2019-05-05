package entity;

import entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Position.class)
public class Position_ { 

    public static volatile SingularAttribute<Position, String> name;
    public static volatile SingularAttribute<Position, Date> finishdate;
    public static volatile SingularAttribute<Position, Employee> employeePersonId;
    public static volatile SingularAttribute<Position, Integer> id;
    public static volatile SingularAttribute<Position, Date> startdate;

}