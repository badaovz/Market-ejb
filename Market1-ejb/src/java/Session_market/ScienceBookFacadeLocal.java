/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.ScienceBook;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface ScienceBookFacadeLocal {

    void create(ScienceBook scienceBook);

    void edit(ScienceBook scienceBook);

    void remove(ScienceBook scienceBook);

    ScienceBook find(Object id);

    List<ScienceBook> findAll();

    List<ScienceBook> findRange(int[] range);

    int count();
    
}
