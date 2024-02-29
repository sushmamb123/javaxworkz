package com.xworkz.temple.boot;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepo;
import com.xworkz.temple.repository.TempleRepoImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TempleRunner {
    public static void main(String[] args) {
        TempleEntity templeEntity1 = new TempleEntity(1,"Hasanamba", "Hassan", 100.0, 1000.0, 10.0, LocalDate.of(2014, 10, 15), "Hasanambha devi", 13);
        TempleEntity templeEntity2 = new TempleEntity( 2,"Chamundeshwari temple", "Mysore", 200.0, 1500.0, 100.0, LocalDate.of(1659, 10, 15), "Chamundeswhari", 12);
        TempleEntity templeEntity3 = new TempleEntity(3,"Chennakeshava temple", "Belur", 50.0, 1200.0, 300.0, LocalDate.of(2023, 3, 20), "Chennakeshava", 11);
        TempleEntity templeEntity4 = new TempleEntity(4,"Kotilingeshwara temple", "Kolar", 20.0, 2000.0, 30.0, LocalDate.of(2000, 9, 27), "Shiva", 10);
        TempleEntity templeEntity5 = new TempleEntity(5,"Vitthala temple", "Hampi", 30.0, 3000.0, 50.0, LocalDate.of(2005, 6, 27), "Vitthala", 14);
        TempleEntity templeEntity6 = new TempleEntity(6,"Muruddeshwar", "Bhatkal", 60.0, 5000.0, 100.0, LocalDate.of(2006, 10, 15), "Sivaa", 15);

        TempleRepo templeRepo = new TempleRepoImpl();
        List<TempleEntity> templeEntityList=Arrays.asList(templeEntity1,templeEntity2,templeEntity3,templeEntity4,templeEntity5,templeEntity6);
       //templeRepo.saveAll(templeEntityList);
        List<TempleEntity> list=templeRepo.findAllByLocation("Kolar");
        list.forEach(t-> System.out.println(t));
        System.out.println("^^^^^^^findAllByEntryFeeGreaterThan^^^^^^^^^^^^^^^^^");
        List<TempleEntity> list1=templeRepo.findAllByEntryFeeGreaterThan(50);
        list1.forEach(e-> System.out.println(e));
        System.out.println("^^^^^^^^^^^^^^^findAllByEntryFeeBetween^^^^^^^^^^^^^^^^^^^^^^");
        List<TempleEntity> list2=templeRepo.findAllByEntryFeeBetween(10,100);
        list2.forEach(l-> System.out.println(l));
        System.out.println("****************findAllByInagrudatedDateGreaterThan**********************");
        List<TempleEntity> list3=templeRepo.findAllByInagrudatedDateGreaterThan(LocalDate.of(2014,10,15));
        list3.forEach(d-> System.out.println(d));
        System.out.println("****************findAllByMainGodAndLocation**********************");
        List<TempleEntity> list4=templeRepo.findAllByMainGodAndLocation("shiva","Belur");
        list4.forEach(l-> System.out.println(l));
        System.out.println("******************findById********************");
        List<TempleEntity> list5=templeRepo.findById(6);
        list5.forEach(d-> System.out.println(d));
        System.out.println("**********************findByIdAndMainGod************************");
        TempleEntity templeEntity=templeRepo.findByIdAndMainGod(1,"Hasanambha devi");
        System.out.println(templeEntity);
        System.out.println("****************find total*******************");
       /* Long templetotal=templeRepo.findTotal();
        System.out.println(templetotal);*/
        System.out.println("------------------findTempleByMaxEntryFee---------------------");
        TempleEntity temple=templeRepo.findTempleByMaxEntryFee();
        System.out.println(temple);
        System.out.println("________________________updateLocationByName_____________");
        templeRepo.updateLocationByName("Chikkmangalore","Chennakeshava temple");



    }
}

