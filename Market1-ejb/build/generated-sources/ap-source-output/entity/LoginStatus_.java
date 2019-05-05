package entity;

import entity.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(LoginStatus.class)
public class LoginStatus_ { 

    public static volatile CollectionAttribute<LoginStatus, Account> accountCollection;
    public static volatile SingularAttribute<LoginStatus, Integer> id;
    public static volatile SingularAttribute<LoginStatus, String> status;

}