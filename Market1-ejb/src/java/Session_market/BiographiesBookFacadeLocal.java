/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.BiographiesBook;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface BiographiesBookFacadeLocal {

    void create(BiographiesBook biographiesBook);

    void edit(BiographiesBook biographiesBook);

    void remove(BiographiesBook biographiesBook);

    BiographiesBook find(Object id);

    List<BiographiesBook> findAll();

    List<BiographiesBook> findRange(int[] range);

    int count();
    
}
