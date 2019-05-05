/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.DeliveryAddress;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface DeliveryAddressFacadeLocal {

    void create(DeliveryAddress deliveryAddress);

    void edit(DeliveryAddress deliveryAddress);

    void remove(DeliveryAddress deliveryAddress);

    DeliveryAddress find(Object id);

    List<DeliveryAddress> findAll();

    List<DeliveryAddress> findRange(int[] range);

    int count();
    
}
