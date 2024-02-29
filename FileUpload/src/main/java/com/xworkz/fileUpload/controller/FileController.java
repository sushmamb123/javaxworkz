package com.xworkz.fileUpload.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class FileController {
	public FileController() {
		System.out.println("Created a FileController..");
	}
	 private static String UPLOADED_FOLDER = "C:\\Users\\Acer\\Desktop\\uploadFile\\InsideNewUpload\\";

	  
	    @PostMapping("/upload") // //new annotation since 4.3
	    public String singleFileUpload(@RequestParam("file") MultipartFile file,
	                                   RedirectAttributes redirectAttributes,Model model) {

	        if (file.isEmpty()) {
	            model.addAttribute("message", "Please select a file to upload");
	            return "UploadStatus";
	        }

	        try {

	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);

	            model.addAttribute("message", 
	                        "You successfully uploaded '" + file.getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return "UploadStatus";
	    }


	}


