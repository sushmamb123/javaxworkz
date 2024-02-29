package com.xworkz.song.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SongDTO {
	@NotNull(message = "Song name is not empty")
	@Size(min = 3, max = 15, message = "Song name should be min 3 max 15")
	private String songName;
	@NotNull(message = "singerName is not empty")
	@Size(min = 3, max = 15, message = "Singer name should be min 3 max 15")
	private String singerName;
	@NotNull(message = "Composer is not null")
	@Size(min = 3, max = 15, message = "Composer name should be min 3 max 15")
	private String composer;
	@NotNull(message = "Duration is not a null")
	@Max(value = 10, message = "Duration is max 10")
	@Min(value = 1, message = "Duration is min 1")
	private Integer duration;
	@NotNull(message = "Album name is not a null")
	@Size(min = 3, max = 15, message = "Album name should be min 3 max 15")
	private String album;
	@NotNull(message = "lang name is not a null")
	@Size(min = 3, max = 15, message = "Lang name should be min 3 max 15")
	private String lang;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate releaseYear;
	@NotNull(message = "Lyrisist name is not null")
	@Size(min = 3, max = 15, message = "Lyrist name should be min 3 max 15")
	private String lyrisistName;
	@NotNull(message = "Producer name is not null")
	@Size(min = 3, max = 15, message = "Producer name should be min 3 max 15")
	private String producerName;
	@NotNull(message = "Director name is not null")
	@Size(min = 3, max = 15, message = "Director name should be min 3 max 15")
	private String directorName;

}
