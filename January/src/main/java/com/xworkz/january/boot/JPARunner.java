package com.xworkz.january.boot;

import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {
    public static void main(String[] args) {
     EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
   EntityManager em= emf.createEntityManager();
   System.out.println("EM:"+em);
        EntityTransaction et=em.getTransaction();
        System.out.println("Et:"+et);
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation");
        SuperHeroEntity superHeroEntity=new SuperHeroEntity(2,"Darshan","dboss","India","Wife");
        em.persist(superHeroEntity);
        System.out.println("Operation completed");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();

    }
}
