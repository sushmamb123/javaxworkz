package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.EmailEntity;
import com.xworkz.fertilizer.repo.EmailRepo;
import com.xworkz.fertilizer.repo.EmailRepoImpl;

import java.time.LocalDate;

public class EmailRunner {
    public static void main(String[] args) {
        EmailEntity emails=new EmailEntity(0,"Rajajinagar","sushma","Chandhu","Requesting for Leave","Sachin","Shashank","Suffering from fever", LocalDate.of(2024,1,24),true);
        EmailRepo emailRepo=new EmailRepoImpl();
        emailRepo.save(emails);
    }
}
