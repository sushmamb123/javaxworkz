package com.xworkz.song.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.song.dto.SongDTO;
import com.xworkz.song.service.SongService;


@Controller
@RequestMapping("/")
public class SongController {

	@Autowired
	private SongService service;

	public SongController() {
		System.out.println("SongController");
	}

	@PostMapping("/dance")
	public String saveSongDetails(Model model, @Valid SongDTO dto, BindingResult result) {
		System.out.println("Details of the Song: " + dto);
		System.out.println("Song DTO has errors: " + result.hasErrors());

		model.addAttribute("dto", dto);

		if (result.hasErrors()) {
			List<ObjectError> objectErrors = result.getAllErrors();
			objectErrors.forEach(a -> System.err.println(a.getObjectName() + " " + a.getDefaultMessage()));
			model.addAttribute("error", objectErrors);
			model.addAttribute("errorMsg", "Details can't save");
			return "Song";
		} else {
			boolean save = this.service.validateAndSave(dto);
			if (save) {
				System.out.println("DTO saved: " + save);
				model.addAttribute("noError", "Details saved");
			}

			return "SongSucess";
		}

	}

}