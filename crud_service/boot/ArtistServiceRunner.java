package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.ArtistRepository;
import com.xwork.crud.app.repository.ArtistRepositorympl;
import com.xwork.crud.app.service.ArtistService;
import com.xwork.crud.app.service.ArtistServiceImpl;

public class ArtistServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ArtistServiceRunner");
		ArtistRepository artistRepository = new ArtistRepositorympl();
		ArtistService artistService = new ArtistServiceImpl(artistRepository);
		artistService.validateAndMovie("KAN");
	
	}

}
