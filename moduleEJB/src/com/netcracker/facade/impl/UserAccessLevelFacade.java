package com.netcracker.facade.impl;

 /* 18:42 28.04.2015 by Viktor Taranenko */

import com.netcracker.entity.UserAccessLevelEntity;
import com.netcracker.facade.local_int.UserAccessLevel;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserAccessLevelFacade extends AbstractFacade<UserAccessLevelEntity> implements UserAccessLevel {
    @PersistenceContext(unitName = "TaxiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserAccessLevelFacade() {
        super(UserAccessLevelEntity.class);
    }
    
}
