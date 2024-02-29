package com.xworkz.song.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.song.dto.SongDTO;


@Repository
public class SongRepoImpl implements SongRepo {
	public SongRepoImpl() {
		System.out.println("SongRepositoryImpl");
	}

	

	@Override
	public boolean saveAndValidateSong(SongDTO dto) {
		System.out.println("invoking saveAndValidateSong in SongRepoImpl..");
		return true;
	}
}