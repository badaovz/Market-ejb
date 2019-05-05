/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.CustomerAccount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface CustomerAccountFacadeLocal {

    void create(CustomerAccount customerAccount);

    void edit(CustomerAccount customerAccount);

    void remove(CustomerAccount customerAccount);

    CustomerAccount find(Object id);

    List<CustomerAccount> findAll();

    List<CustomerAccount> findRange(int[] range);

    int count();
    
}
