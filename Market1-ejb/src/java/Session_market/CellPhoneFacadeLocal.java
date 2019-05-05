/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.CellPhone;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface CellPhoneFacadeLocal {

    void create(CellPhone cellPhone);

    void edit(CellPhone cellPhone);

    void remove(CellPhone cellPhone);

    CellPhone find(Object id);

    List<CellPhone> findAll();

    List<CellPhone> findRange(int[] range);

    int count();
    
}
