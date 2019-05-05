/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.Watch;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author datvl
 */
@Stateless
public class WatchFacade extends AbstractFacade<Watch> implements WatchFacadeLocal {
    @PersistenceContext(unitName = "Market1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WatchFacade() {
        super(Watch.class);
    }
    
}
