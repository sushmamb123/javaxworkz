package com.xworkz.song.service;

import com.xworkz.song.dto.SongDTO;

public interface SongService {
	

	boolean validateAndSave(SongDTO dto);
	

}
