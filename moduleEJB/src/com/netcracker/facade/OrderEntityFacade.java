package com.netcracker.facade;

 /* 18:42 28.04.2015 by Viktor Taranenko */

import com.netcracker.entity.OrderEntity;
import com.netcracker.facade.local_int.Order;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrderEntityFacade extends AbstractFacade<OrderEntity> implements Order {
    @PersistenceContext(unitName = "TaxiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderEntityFacade() {
        super(OrderEntity.class);
    }
    
}
