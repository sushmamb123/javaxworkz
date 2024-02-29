package com.xworkz.lock.repo;

import com.xworkz.lock.entity.LockEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class LockRepoImpl implements LockRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(LockEntity entity) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting ET");
            et.begin();
            System.out.println("Starting persist");
            em.persist(entity);
            System.out.println("persist success");
            et.commit();
            return entity.getId();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in save method of LockRepo:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing the resources");
            em.close();
        }
        return null;
    }

    @Override
    public void saveAll(List<LockEntity> entities) {
        System.out.println("Starting of LockEntity:"+entities);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try{
            System.out.println("Starting ET");
            entityTransaction.begin();
            System.out.println("Starting persisst");
            entities.forEach(a->entityManager.persist(a));
            System.out.println("List saved successfully");
            entityTransaction.commit();
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll method of LockEntity:"+pe.getMessage());
            entityTransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();
        }

        LockRepo.super.saveAll(entities);
    }

    @Override
    public List<LockEntity> deleteByMaterial(String material) {
        System.out.println("Starting of LockEntity:"+material);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try{
            System.out.println("Starting ET");
            entityTransaction.begin();
            System.out.println("Starting persisst");
            Query query=entityManager.createNamedQuery("deleteByMaterial");
            query.setParameter("mats",material);
            int rowsDelete=query.executeUpdate();
            entityTransaction.commit();
            System.out.println("Rows updated.."+rowsDelete);
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll method of LockEntity:"+pe.getMessage());
            entityTransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();
        }
        return LockRepo.super.deleteByMaterial(material);
    }

    @Override
    public List<LockEntity> updateKeyTypeByFuntionallity(String keyType, String functionality) {
        System.out.println("Starting of LockEntity:"+keyType+" "+functionality);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try{
            System.out.println("Starting ET");
            entityTransaction.begin();
            System.out.println("Starting persisst");
            Query query=entityManager.createNamedQuery("updateKeyTypeByFuntionallity");
            query.setParameter("key",keyType);
            query.setParameter("fun",functionality);
           int rowsUpdate=query.executeUpdate();
           entityTransaction.commit();
            System.out.println("Rows updated.."+rowsUpdate);
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll method of LockEntity:"+pe.getMessage());
            entityTransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();
        }
        return LockRepo.super.updateKeyTypeByFuntionallity(keyType, functionality);
    }

    @Override
    public List<LockEntity> findByMaterial(String material) {
        System.out.println("Starting of LockEntity:"+material);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try{
            System.out.println("Starting ET");
            entityTransaction.begin();
            System.out.println("Starting persisst");
            Query query=entityManager.createNamedQuery("findByMaterial");
            query.setParameter("mat",material);
            List<LockEntity> list=query.getResultList();
            entityTransaction.commit();
            System.out.println("List saved successfully:"+list);
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll method of LockEntity:"+pe.getMessage());
            entityTransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();
        }
        return LockRepo.super.findByMaterial(material);
    }

    @Override
    public List<LockEntity> findAll() {
        System.out.println("Starting of LockEntity");
        EntityManager entityManager=this.emf.createEntityManager();
        List<LockEntity> list=new ArrayList<>();
        try{

            Query query=entityManager.createNamedQuery("findAll");
            list=query.getResultList();
            list.forEach(s-> System.out.println(s));
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll method of LockEntity:"+pe.getMessage());
        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();
        }
        return list;
    }

    @Override
    public List<LockEntity> findAllByKeyType(String keyTypes) {
        System.out.println("Starting of LockEntity"+keyTypes);
        EntityManager entityManager=this.emf.createEntityManager();
        List<LockEntity> list=new ArrayList<>();
        try{

            Query query=entityManager.createNamedQuery("findAllByKeyType");
            query.setParameter("keys",keyTypes);
            list=query.getResultList();
            list.forEach(s-> System.out.println(s));
            System.out.println("List saved successfully"+keyTypes);
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll method of LockEntity:"+pe.getMessage());
        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();
        }
        return list;
    }
}
