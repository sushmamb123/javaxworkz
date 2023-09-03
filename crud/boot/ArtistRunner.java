package com.xwork.crud.boot;

import com.xwork.crud.app.repository.ArtistRepository;
import com.xwork.crud.app.repository.ArtistRepositorympl;

public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ArtistRunner");
		ArtistRepository repository = new ArtistRepositorympl();
		repository.makeup("sushma");
		repository.makeup("pooja");
		repository.makeup("chaya");
		repository.makeup("anusha");
		repository.makeup("aishwarya");
		repository.makeup("anupama");
		repository.makeup("jeevitha");
		repository.makeup("deepa");
		repository.makeup("madiha");
		repository.makeup("sinchana");
		repository.makeup("monika");

	}
}
