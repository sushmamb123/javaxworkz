package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.EmailEntity;

import javax.persistence.*;

public class EmailRepoImpl implements EmailRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(EmailEntity emailEntity) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting ET");
            et.begin();
            System.out.println("Starting persist");
            em.persist(emailEntity);
            System.out.println("Persist success");
            et.commit();
            return  emailEntity.getId();
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in save method of EmailEntity:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            em.close();
        }
        return null;
    }
}
