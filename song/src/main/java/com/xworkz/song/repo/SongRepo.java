package com.xworkz.song.repo;

import com.xworkz.song.dto.SongDTO;

public interface SongRepo {
	boolean saveAndValidateSong(SongDTO dto);

}
