package com.xwork.dto.service.appp;

import com.xwork.dto.app.NewspaperDTO;
import com.xwork.dto.repository.app.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService {
	private NewspaperRepository newspaperRepository;

	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {
		this.newspaperRepository = newspaperRepository;
	}

	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
		System.out.println("invoking validdateAndSave in newspaperimpl..." + this.getClass().getSimpleName());
		if (dto != null) {
			String name=dto.getName();
			String lang=dto.getLang();
			int pages=dto.getPages();
			double cost=dto.getCost();
			if(name!=null&&!name.isEmpty()&&name.length()>=3&&name.length()<=20) {
				System.out.println("name is valid");
			}
			else {
				System.err.println("name  is invalid");
				return false;
			}
			if(lang!=null&&!lang.isEmpty()&&lang.length()>=3&&lang.length()<=20) {
				System.out.println("lang is valid");
			}
			else {
				System.err.println("lang is invalid");
				return false;
			}
			if(pages!=0 &&pages>=0) {
				System.out.println("pagesis valid");
			}
			else {
				System.err.println("pages is invalid");
				return false;
			}
			if(cost!=0&&cost>=1000) {
				System.out.println("cost is valid");
			}
			else {
				System.err.println("cost is invalid");
			}
			System.out.println("data is valid");
			this.newspaperRepository.save(dto);
			return true;
		}
		else {
			System.err.println("data is invalid");
		}
		return false;
	}
}
