/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Contact;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author datvl
 */
@Local
public interface ContactFacadeLocal {

    void create(Contact contact);

    void edit(Contact contact);

    void remove(Contact contact);

    Contact find(Object id);

    List<Contact> findAll();

    List<Contact> findRange(int[] range);

    int count();
    
}
