package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.TravelEntity;

import javax.persistence.*;

public class TravelRepoImpl implements TravelRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(TravelEntity travelEntity) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("Starting ET");
            et.begin();
            System.out.println("Starting persist");
            em.persist(travelEntity);
            System.out.println("persist success");
            et.commit();
            return travelEntity.getId();
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in save method of TravelEntity:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing the resources.");
            em.close();
        }
        return null;
    }
}
