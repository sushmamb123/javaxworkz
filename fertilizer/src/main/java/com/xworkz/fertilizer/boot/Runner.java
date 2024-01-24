package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.EmailEntity;
import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.entity.DiseaseEntity;
import com.xworkz.fertilizer.entity.TravelEntity;
import com.xworkz.fertilizer.repo.*;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        FertilizerEntity entity=new FertilizerEntity(1,"potassium",3,1000, LocalDate.of(2023,12,10),LocalDate.of(2024,1,10));
        FertilizerRepo repo=new FertilizerRepoImpl();
        repo.save(entity);
        System.out.println("*******************************************");
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
        travelRepo.save(travel);
    }
}
