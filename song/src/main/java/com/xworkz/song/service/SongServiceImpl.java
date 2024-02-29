package com.xworkz.song.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.song.dto.SongDTO;
import com.xworkz.song.repo.SongRepo;

@Service
public class SongServiceImpl implements SongService {
	@Autowired
	private SongRepo repo;

	public SongServiceImpl() {
		System.out.println("SongServiceImpl");
	}

	@Override
	public boolean validateAndSave(SongDTO dto) {
		this.repo.saveAndValidateSong(dto);
		return true;
	}
}
