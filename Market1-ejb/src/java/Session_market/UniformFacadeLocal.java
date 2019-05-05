/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Uniform;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface UniformFacadeLocal {

    void create(Uniform uniform);

    void edit(Uniform uniform);

    void remove(Uniform uniform);

    Uniform find(Object id);

    List<Uniform> findAll();

    List<Uniform> findRange(int[] range);

    int count();
    
}
