package entity;

import entity.Address;
import entity.City;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(District.class)
public class District_ { 

    public static volatile CollectionAttribute<District, Address> addressCollection;
    public static volatile SingularAttribute<District, String> name;
    public static volatile SingularAttribute<District, Integer> id;
    public static volatile SingularAttribute<District, City> cityId;

}