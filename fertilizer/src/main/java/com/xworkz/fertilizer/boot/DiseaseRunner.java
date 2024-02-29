package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.DiseaseEntity;
import com.xworkz.fertilizer.repo.DiseaseRepo;
import com.xworkz.fertilizer.repo.DiseaseRepoImpl;

public class DiseaseRunner {
    public static void main(String[] args) {


        DiseaseEntity patient = new DiseaseEntity(0, "sushma", "Hassan", 573120, "Rajeev", "Karnataka");
        DiseaseRepo patientRepo = new DiseaseRepoImpl();
        patientRepo.save(patient);


    }
}
