/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.StudyBook;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface StudyBookFacadeLocal {

    void create(StudyBook studyBook);

    void edit(StudyBook studyBook);

    void remove(StudyBook studyBook);

    StudyBook find(Object id);

    List<StudyBook> findAll();

    List<StudyBook> findRange(int[] range);

    int count();
    
}
