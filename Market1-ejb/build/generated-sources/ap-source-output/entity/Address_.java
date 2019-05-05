package entity;

import entity.District;
import entity.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, District> districtId;
    public static volatile SingularAttribute<Address, String> homenumber;
    public static volatile SingularAttribute<Address, Person> personId;
    public static volatile SingularAttribute<Address, Integer> id;

}