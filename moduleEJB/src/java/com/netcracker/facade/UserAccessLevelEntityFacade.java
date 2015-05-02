package com.netcracker.facade;

 /* 18:42 28.04.2015 by Viktor Taranenko */

import com.netcracker.entity.UserAccessLevelEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserAccessLevelEntityFacade extends AbstractFacade<UserAccessLevelEntity> {
    @PersistenceContext(unitName = "TaxiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserAccessLevelEntityFacade() {
        super(UserAccessLevelEntity.class);
    }
    
}