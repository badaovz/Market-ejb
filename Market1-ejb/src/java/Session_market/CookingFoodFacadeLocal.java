/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.CookingFood;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface CookingFoodFacadeLocal {

    void create(CookingFood cookingFood);

    void edit(CookingFood cookingFood);

    void remove(CookingFood cookingFood);

    CookingFood find(Object id);

    List<CookingFood> findAll();

    List<CookingFood> findRange(int[] range);

    int count();
    
}
