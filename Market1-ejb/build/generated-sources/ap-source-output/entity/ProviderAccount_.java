package entity;

import entity.Account;
import entity.Provider;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-05-06T01:14:36")
@StaticMetamodel(ProviderAccount.class)
public class ProviderAccount_ { 

    public static volatile SingularAttribute<ProviderAccount, Integer> accountId;
    public static volatile SingularAttribute<ProviderAccount, Provider> providerPersonId;
    public static volatile SingularAttribute<ProviderAccount, Integer> id;
    public static volatile SingularAttribute<ProviderAccount, Account> account;

}