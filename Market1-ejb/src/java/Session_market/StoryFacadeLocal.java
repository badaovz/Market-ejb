/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Story;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface StoryFacadeLocal {

    void create(Story story);

    void edit(Story story);

    void remove(Story story);

    Story find(Object id);

    List<Story> findAll();

    List<Story> findRange(int[] range);

    int count();
    
}
