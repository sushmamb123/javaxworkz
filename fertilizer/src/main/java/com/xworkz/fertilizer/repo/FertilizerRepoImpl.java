package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import javax.persistence.*;

public class FertilizerRepoImpl implements FertilizerRepo{
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(FertilizerEntity fertilizerEntity) {
        System.out.println("Starting of FertilizerEntity:"+fertilizerEntity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting of ET");
            et.begin();
            System.out.println("Starting persist");
            em.persist(fertilizerEntity);
            System.out.println("persist success");
            et.commit();
            return fertilizerEntity.getId();
        }
        catch(PersistenceException pe){
            System.err.println("PersistenceException in save method of Fertilizer:"+pe.getMessage());
            et.rollback();


        }
        finally {
            System.out.println("Closing the resources");
            em.close();

        }
        return null;
    }
}
