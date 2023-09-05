package com.xwork.crud.app.service;

import com.xwork.crud.app.repository.JacketRepository;

public class JacketServiceImpl implements JacketService{
	private JacketRepository jacketRepository;

	public JacketServiceImpl(JacketRepository jacketRepository) {
		this.jacketRepository = jacketRepository;
	}

	@Override
	public void validateBrand(String brand) {
		System.out.println("invoking validateBrand from " + this.getClass().getSimpleName());
		if (brand != null && !brand.isEmpty() && brand.length() >= 3 && brand.length() <= 20) {
			System.out.println("Jacket data is valid");
			this.jacketRepository.colour(brand);
		} else {
			System.out.println("Jacket data invalid");
		}

	}

}
