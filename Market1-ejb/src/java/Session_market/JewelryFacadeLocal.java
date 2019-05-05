/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Jewelry;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface JewelryFacadeLocal {

    void create(Jewelry jewelry);

    void edit(Jewelry jewelry);

    void remove(Jewelry jewelry);

    Jewelry find(Object id);

    List<Jewelry> findAll();

    List<Jewelry> findRange(int[] range);

    int count();
    
}
