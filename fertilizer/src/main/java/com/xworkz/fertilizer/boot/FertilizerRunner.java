package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repo.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FertilizerRunner {
    public static void main(String[] args) {
        FertilizerEntity entity1=new FertilizerEntity("potassium",3,1000, LocalDate.of(2023,12,10),LocalDate.of(2024,1,10));
        FertilizerEntity entity2=new FertilizerEntity("sodium",4,2000, LocalDate.of(2024,10,11),LocalDate.of(2025,2,11));
        FertilizerEntity entity3=new FertilizerEntity("Urea",5,1200, LocalDate.of(2022,11,12),LocalDate.of(2023,3,27));
        FertilizerEntity entity4=new FertilizerEntity("Zinc",6,800, LocalDate.of(2021,8,13),LocalDate.of(2022,4,28));

        FertilizerRepo repo=new FertilizerRepoImpl();
        List<FertilizerEntity> entities= Arrays.asList(entity1,entity2,entity3,entity4);
       // repo.saveAll(entities);
        List<FertilizerEntity> list=repo.findAllByQuantity(4);
        list.forEach(b-> System.out.println(b));
        /*System.out.println("*******************************************");
        DiseaseEntity patient=new DiseaseEntity(3,"sushma","Hassan",573120,"Rajeev","Karnataka");
        DiseaseRepo patientRepo=new DiseaseRepoImpl();
        patientRepo.save(patient);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        EmailEntity email=new EmailEntity(4,"Rajajinagar","sushma","Chandhu","Requesting for Leave","Sachin","Shashank","Suffering from fever",LocalDate.of(2024,1,24),true);
        EmailRepo emailRepo=new EmailRepoImpl();
        emailRepo.save(email);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        TravelEntity travel=new TravelEntity(6,"Bangalore","Hassan",10000,182.5f,"course",6,"bus",LocalDate.of(2023,6,19),LocalDate.of(2023,7,24));
        TravelRepo travelRepo=new TravelRepoImpl();
        travelRepo.save(travel);*/
    }
}
