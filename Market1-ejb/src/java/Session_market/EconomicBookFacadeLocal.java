/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.EconomicBook;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface EconomicBookFacadeLocal {

    void create(EconomicBook economicBook);

    void edit(EconomicBook economicBook);

    void remove(EconomicBook economicBook);

    EconomicBook find(Object id);

    List<EconomicBook> findAll();

    List<EconomicBook> findRange(int[] range);

    int count();
    
}
