package com.xworkz.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mails.Bottle;
import com.xworkz.mails.Bulb;
import com.xworkz.mails.Elevator;
import com.xworkz.mails.Generator;
import com.xworkz.mails.Perfume;
import com.xworkz.mails.Scissor;
@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	public SpringConfig() {
		System.out.println("invoking in SpringConfig...");
	}
	
	@Bean
	public Bottle bottle() {
		Bottle bottle=new Bottle();
		return bottle;
	}
	@Bean
	public Bulb bulb() {
		Bulb bulb=new Bulb();
		return bulb;
	}
	@Bean
	public Perfume perfume() {
		Perfume perfume=new Perfume();
		return perfume;
	}
	@Bean
	public Generator generator() {
		Generator generator=new Generator();
		return generator;
	}
	@Bean
	public Elevator elevator() {
		Elevator elevator=new Elevator(null);
		return elevator;
	}
	@Bean
	public Scissor metal() {
		System.out.println("Register a metal...");
		return new Scissor();
	}
	@Bean
	public Scissor blade() {
		System.out.println("Register a Blade...");
		return new Scissor();
	}
	
	
	

}
