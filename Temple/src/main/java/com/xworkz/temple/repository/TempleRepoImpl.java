package com.xworkz.temple.repository;

import com.xworkz.temple.entity.TempleEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class TempleRepoImpl implements TempleRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(TempleEntity entity) {
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
            System.err.println("PersistenceException in save method of TempleRepo:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing the resources");
            em.close();
        }
        return null;
    }

    @Override
    public void saveAll(List<TempleEntity> entities) {
        System.out.println("Starting of TempleEntity:"+entities);
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
            System.out.println("PersistenceException in saveAll method of TempleEntity:"+pe.getMessage());
            entityTransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            entityManager.close();
        }

    }

    @Override
    public List<TempleEntity> findAllByLocation(String location) {
        System.out.println("Starting the TempleEntity:"+location);
        EntityManager manager=this.emf.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        try{
            System.out.println("Starting og ET");
            transaction.begin();
            System.out.println("Starting persist");
            Query query=manager.createNamedQuery("findAllByLocation");
            query.setParameter("tl",location);
            List<TempleEntity> list=query.getResultList();
            transaction.commit();
            System.out.println("List saved successfully");
            return list;
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByLocation of TempleEntity:"+pe.getMessage());
            transaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            manager.close();
        }
        return TempleRepo.super.findAllByLocation(location);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(double entryFee) {
        System.out.println("Starting the TempleEntity:"+entryFee);
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("te",entryFee);
            List<TempleEntity> list=query.getResultList();
            ttransaction.commit();
            System.out.println("List saved successfully");
            return list;
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByEntryFeeGreaterThan of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }

        return TempleRepo.super.findAllByEntryFeeGreaterThan(entryFee);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee) {
        System.out.println("Starting the TempleEntity:"+startFee+" "+endFee);
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("startFee",startFee);
            query.setParameter("endFee",endFee);

            List<TempleEntity> list=query.getResultList();
            ttransaction.commit();
            System.out.println("List saved successfully");
            return list;
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByEntryFeeBetween of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
        return TempleRepo.super.findAllByEntryFeeBetween(startFee, endFee);
    }

    @Override
    public List<TempleEntity> findAllByInagrudatedDateGreaterThan(LocalDate inaguratedDate) {
        System.out.println("Starting the TempleEntity:"+inaguratedDate);
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findAllByInagrudatedDateGreaterThan");
            query.setParameter("idate",inaguratedDate);
            List<TempleEntity> list=query.getResultList();
            ttransaction.commit();
            System.out.println("List saved successfully");
            return list;
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByEntryFeeGreaterThan of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
        return TempleRepo.super.findAllByInagrudatedDateGreaterThan(inaguratedDate);
    }

    @Override
    public List<TempleEntity> findAllByMainGodAndLocation(String mainGod, String location) {
        System.out.println("Starting the TempleEntity:"+mainGod+" "+location);
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findAllByMainGodAndLocation");
            query.setParameter("mGod",mainGod);
            query.setParameter("loc",location);

            List<TempleEntity> list=query.getResultList();
            ttransaction.commit();
            System.out.println("List saved successfully");
            return list;
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByMainGodAndLocation of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
        return TempleRepo.super.findAllByMainGodAndLocation(mainGod, location);
    }

    @Override
    public List<TempleEntity> findById(int id) {
        System.out.println("Starting the TempleEntity:"+id);
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findById");
            query.setParameter("tid",id);
            List<TempleEntity> list=query.getResultList();
            ttransaction.commit();
            System.out.println("List saved successfully");
            return list;
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findById of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
        return TempleRepo.super.findById(id);
    }

    @Override
    public TempleEntity findByIdAndMainGod(int id, String mainGod) {
        System.out.println("Starting the TempleEntity:"+id+" "+mainGod);
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findByIdAndMainGod");
            query.setParameter("tid",id);
            query.setParameter("god",mainGod);
           Object object=query.getSingleResult();
           TempleEntity templeEntity=(TempleEntity)object;
            ttransaction.commit();
            System.out.println("saved successfully");
           return templeEntity;

        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByMainGodAndLocation of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
        return TempleRepo.super.findByIdAndMainGod(id, mainGod);
    }

   /* @Override
    public Long findTotal() {
        System.out.println("Starting the TempleEntity");
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findTotal");

            Object object=query.getSingleResult();
            TempleEntity temple=(TempleEntity)object;
            System.out.println(temple);
            ttransaction.commit();
            System.out.println("saved successfully");
            return findTotal();

        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findTotal of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
        return TempleRepo.super.findTotal();
    }*/

    @Override
    public TempleEntity findTempleByMaxEntryFee() {
        System.out.println("Starting the TempleEntity:");
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findTempleByMaxEntryFee");

            Object object=query.getSingleResult();
            TempleEntity templeEntity=(TempleEntity)object;
            ttransaction.commit();
            System.out.println("saved successfully");
            return templeEntity;

        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findTempleByMaxEntryFee of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
        return TempleRepo.super.findTempleByMaxEntryFee();
    }

    @Override
    public void updateLocationByName(String location, String name) {
        System.out.println("Starting the TempleEntity:"+location+" "+name);
        EntityManager eManager=this.emf.createEntityManager();
        EntityTransaction ttransaction=eManager.getTransaction();
        try{
            System.out.println("Starting og ET");
            ttransaction.begin();
            System.out.println("Starting persist");
            Query query=eManager.createNamedQuery("findByIdAndMainGod");
            query.setParameter("temp",location);
            query.setParameter("temp",name);
            Object object=query.getSingleResult();
            TempleEntity templeEntity=(TempleEntity)object;
            ttransaction.commit();
            System.out.println("saved successfully");


        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByMainGodAndLocation of TempleEntity:"+pe.getMessage());
            ttransaction.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            eManager.close();
        }
    }
}

