/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Fridge;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface FridgeFacadeLocal {

    void create(Fridge fridge);

    void edit(Fridge fridge);

    void remove(Fridge fridge);

    Fridge find(Object id);

    List<Fridge> findAll();

    List<Fridge> findRange(int[] range);

    int count();
    
}
