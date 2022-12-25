package co.simplon.events.dtos;

import java.time.LocalDate;

import co.simplon.events.entities.Location;
import co.simplon.events.entities.Theme;

public class EventView {

			private String name;
		    private LocalDate date;
		    private Location location;
		    private Theme theme;
		    private Double rate;
		    private String description;
		    private Long id;

		    public EventView() {

		    }

		    public String getName() {
			return name;
		    }

		    public LocalDate getDate() {
			return date;
		    }

		    public Location getLocation() {
			return location;
		    }

		    public Theme getTheme() {
			return theme;
		    }

		    public Double getRate() {
			return rate;
		    }

		    public String getDescription() {
			return description;
		    }

		    public void setName(String name) {
			this.name = name;
		    }

		    public void setDate(LocalDate date) {
			this.date = date;
		    }

		    public void setLocation(Location location) {
			this.location = location;
		    }

		    public void setTheme(Theme theme) {
			this.theme = theme;
		    }

		    public void setRate(Double rate) {
			this.rate = rate;
		    }

		    public void setDescription(String description) {
			this.description = description;
		    }

		    public Long getId() {
			return id;
		    }

		    public void setId(Long id) {
			this.id = id;
		    }

}
