/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Session_market;

import entity.WomenFashion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author datvl
 */
@Stateless
public class WomenFashionFacade extends AbstractFacade<WomenFashion> implements WomenFashionFacadeLocal {
    @PersistenceContext(unitName = "Market1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WomenFashionFacade() {
        super(WomenFashion.class);
    }
    
}
