/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.BoyFashion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface BoyFashionFacadeLocal {

    void create(BoyFashion boyFashion);

    void edit(BoyFashion boyFashion);

    void remove(BoyFashion boyFashion);

    BoyFashion find(Object id);

    List<BoyFashion> findAll();

    List<BoyFashion> findRange(int[] range);

    int count();
    
}
