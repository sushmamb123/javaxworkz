package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.DiseaseEntity;

import javax.persistence.*;

public class DiseaseRepoImpl implements DiseaseRepo {
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(DiseaseEntity patientEntity) {
        System.out.println("Starting save of PatientEntity:"+patientEntity);
        EntityManager em= this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting ET");
            et.begin();
            System.out.println("Starting persist");
            em.persist(patientEntity);
            System.out.println("persist success");
            et.commit();
            return patientEntity.getId();
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in save method of Patient:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            em.close();
        }
        return null;
    }
}
