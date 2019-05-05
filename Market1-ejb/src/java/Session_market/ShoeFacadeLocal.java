/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Shoe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface ShoeFacadeLocal {

    void create(Shoe shoe);

    void edit(Shoe shoe);

    void remove(Shoe shoe);

    Shoe find(Object id);

    List<Shoe> findAll();

    List<Shoe> findRange(int[] range);

    int count();
    
}
