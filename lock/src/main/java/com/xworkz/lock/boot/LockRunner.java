package com.xworkz.lock.boot;

import com.xworkz.lock.entity.LockEntity;
import com.xworkz.lock.repo.LockRepo;
import com.xworkz.lock.repo.LockRepoImpl;

import java.util.Arrays;
import java.util.List;

public class LockRunner {
    public static void main(String[] args) {


        LockEntity lockEntity1 = new LockEntity("Tumber", true, "Manual operation", "DeadboltLock", "Brass");
        LockEntity lockEntity2 = new LockEntity("Tubular", false, "Cam Lock", "Mortise", "Steel");
        LockEntity lockEntity3 = new LockEntity("Skeleton", true, "PadLock", "Knob Lock", "Zinc Alloy");
        LockEntity lockEntity4 = new LockEntity("Magnetic", false, "Combination Lock", "Deadlatch", "Aluminum");
        LockEntity lockEntity5 = new LockEntity("Laser-cut", true, "Smart Lock", "RimLock", "Bronze");
        LockRepo lockRepo=new LockRepoImpl();
        List<LockEntity> lockEntities= Arrays.asList(lockEntity1,lockEntity2,lockEntity3,lockEntity4,lockEntity5);
       // lockRepo.saveAll(lockEntities);
        lockRepo.deleteByMaterial("Steel");
        System.out.println("---------------------------------------");
        lockRepo.updateKeyTypeByFuntionallity("card access","PadLock");
        System.out.println("*************************************");
        List<LockEntity> material=lockRepo.findByMaterial("Bronze");
        material.forEach(m-> System.out.println(m));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        List<LockEntity> find=lockRepo.findAll();
        material.forEach(m-> System.out.println(m));
        System.out.println("-------------------------");
        List<LockEntity> keytype=lockRepo.findAllByKeyType("Skeleton");
        material.forEach(m-> System.out.println(m));







    }
}