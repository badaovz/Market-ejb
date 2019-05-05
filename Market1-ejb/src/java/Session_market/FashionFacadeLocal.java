/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Fashion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface FashionFacadeLocal {

    void create(Fashion fashion);

    void edit(Fashion fashion);

    void remove(Fashion fashion);

    Fashion find(Object id);

    List<Fashion> findAll();

    List<Fashion> findRange(int[] range);

    int count();
    
}
