package com.qa.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.qa.model.Movie;

public class ServiceTest {

	@Test
	public void test() {
		Service service = new Service();
		Movie rambo = new Movie("rambo", "action", "15");
		Movie harryPotter = new Movie("harrypotter", "fantasy", "12");
		Movie it = new Movie("it", "horror", "18");
		Movie carrie = new Movie("carrie", "horror", "18");
		service.addMovie(rambo);
		service.addMovie(harryPotter);
		service.addMovie(it);
		service.addMovie(carrie);
		int count = service.findMovieByGenre("horror");
		Assert.assertEquals(2, count);
	}

}
