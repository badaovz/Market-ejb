/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.HomeElectronic;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface HomeElectronicFacadeLocal {

    void create(HomeElectronic homeElectronic);

    void edit(HomeElectronic homeElectronic);

    void remove(HomeElectronic homeElectronic);

    HomeElectronic find(Object id);

    List<HomeElectronic> findAll();

    List<HomeElectronic> findRange(int[] range);

    int count();
    
}
