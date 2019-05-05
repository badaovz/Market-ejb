/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.GirlFashion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface GirlFashionFacadeLocal {

    void create(GirlFashion girlFashion);

    void edit(GirlFashion girlFashion);

    void remove(GirlFashion girlFashion);

    GirlFashion find(Object id);

    List<GirlFashion> findAll();

    List<GirlFashion> findRange(int[] range);

    int count();
    
}
