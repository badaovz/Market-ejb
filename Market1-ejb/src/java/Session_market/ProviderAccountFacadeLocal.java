/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.ProviderAccount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface ProviderAccountFacadeLocal {

    void create(ProviderAccount providerAccount);

    void edit(ProviderAccount providerAccount);

    void remove(ProviderAccount providerAccount);

    ProviderAccount find(Object id);

    List<ProviderAccount> findAll();

    List<ProviderAccount> findRange(int[] range);

    int count();
    
}
