package co.simplon.events.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.events.database.Database;
import co.simplon.events.dtos.EventCreate;
import co.simplon.events.dtos.EventView;
import co.simplon.events.entities.Event;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class EventController {
	
	
	@PostMapping
    public void create(
	    @Valid
	    @RequestBody EventCreate inputs) {
	Event event = new Event();
	event.setName(inputs.getName());
	event.setDate(inputs.getDate());
	event.setLocation(Database
		.findOneLocation(inputs.getLocationId()));
	event.setTheme(
		Database.findOneTheme(inputs.getThemeId()));
	event.setRate(inputs.getRate());
	event.setDescription(inputs.getDescription());
	Database.save(event);
    }

    @GetMapping
    public Collection<EventView> getAll() {
	Collection<EventView> views = new ArrayList<>();
	Collection<Event> events = Database.findAllEvent();
	for (Event event : events) {
	    EventView view = new EventView();
	    view.setName(event.getName());
	    view.setDate(event.getDate());
	    view.setLocation(event.getLocation());
	    view.setTheme(event.getTheme());
	    view.setRate(event.getRate());
	    view.setDescription(event.getDescription());
	    view.setId(event.getId());
	    views.add(view);
	}
	return views;
    }
    
    

}
