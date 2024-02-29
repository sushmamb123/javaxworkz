package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import javax.persistence.*;
import java.util.List;

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

    @Override
    public void saveAll(List<FertilizerEntity> entities) {
        System.out.println("Starting of FertilizerEntity:"+entities);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction et=entityManager.getTransaction();
        try{
            System.out.println("Starting of ET");
            et.begin();
            System.out.println("Starting persist");
           entities.forEach(a->entityManager.persist(a));
            System.out.println("List saved successfully");
            et.commit();
        }
        catch(PersistenceException pe){
            System.err.println("PersistenceException in save method of Fertilizer:"+pe.getMessage());
            et.rollback();


        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();

        }

    }

    @Override
    public List<FertilizerEntity> findAllByQuantity(int quantity) {
        System.out.println("Starting of FertilizerEntity:"+quantity);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction et=entityManager.getTransaction();
        try{
            System.out.println("Starting of ET");
            et.begin();
            System.out.println("Starting persist");
           Query query=entityManager.createNamedQuery("findAllByQuantity");
           query.setParameter("qt",quantity);
           List<FertilizerEntity> list=query.getResultList();
           et.commit();
            System.out.println("List saved successfully");
            return list;
        }
        catch(PersistenceException pe){
            System.err.println("PersistenceException in save method of Fertilizer:"+pe.getMessage());
            et.rollback();


        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();

        }

        return FertilizerRepo.super.findAllByQuantity(quantity);
    }
}
