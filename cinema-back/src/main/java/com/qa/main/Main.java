package com.qa.main;

import com.qa.model.Movie;
import com.qa.service.Service;
import com.qa.util.JSONUtil;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		Movie rambo = new Movie("rambo", "action", "15");
		service.addMovie(rambo);
		JSONUtil util = new JSONUtil();
		String display =util.getJSONForObject(service.getMovieMap());
		System.out.println("This is the display " + display );
	}

}
