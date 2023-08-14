package com.xwork.abstraction.runner;

import com.xwork.abstractions.Movie;
import com.xwork.abstractions.NewMovie;

public class MovieRunner {

	public static void main(String[] args) {
System.out.println("invoking main in MovieRunner");
Movie movie=new NewMovie();
movie.inspiration();
movie.music();
movie.name();
movie.photographer();
movie.producer();
movie.story();
movie.trailer();
movie.watch();
movie.theme();
movie.director();
	}

}
