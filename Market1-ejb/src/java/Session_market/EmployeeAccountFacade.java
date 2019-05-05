/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.EmployeeAccount;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author datvl
 */
@Stateless
public class EmployeeAccountFacade extends AbstractFacade<EmployeeAccount> implements EmployeeAccountFacadeLocal {
    @PersistenceContext(unitName = "Market1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeAccountFacade() {
        super(EmployeeAccount.class);
    }
    
}
