/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Wine;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface WineFacadeLocal {

    void create(Wine wine);

    void edit(Wine wine);

    void remove(Wine wine);

    Wine find(Object id);

    List<Wine> findAll();

    List<Wine> findRange(int[] range);

    int count();
    
}
