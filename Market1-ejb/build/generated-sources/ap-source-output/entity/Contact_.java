package entity;

import entity.Email;
import entity.Person;
import entity.Phone;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(Contact.class)
public class Contact_ { 

    public static volatile CollectionAttribute<Contact, Phone> phoneCollection;
    public static volatile SingularAttribute<Contact, Person> personId;
    public static volatile SingularAttribute<Contact, Integer> id;
    public static volatile CollectionAttribute<Contact, Email> emailCollection;

}