package com.services;

import static org.junit.Assert.assertTrue;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.vava.app.model.Event;
import com.vava.app.model.Location;
import com.vava.app.model.SportCategory;
import com.vava.app.services.EventManagerService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = com.vava.app.JoinMeApplication.class)
@SpringBootTest
public class EventsManagerTests {
	@Autowired
	private EventManagerService service;
	
	@Test
	public void createEventTest() {
		Event event = new Event(0, 45, "beh", "bude sa behat", new Date(2018, 9, 14), 15, 5, new SportCategory(1, "behanie"), "Beniakova 5a", new Location(10.0, 10.0));
		assertTrue("pridavam event", service.createEvent(event));
	}
}
