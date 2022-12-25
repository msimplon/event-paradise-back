package co.simplon.events.entities;

import java.time.LocalDate;

public class Event {
	private String name;
    private LocalDate date;
    private Location location;
    private Theme theme;
    private Double rate;
    private String description;
    private Long id;

    public Event() {

    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return description;
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

	@Override
	public String toString() {
		return "Event [name=" + name + ", date=" + date + ", location=" + location + ", theme=" + theme + ", rate="
				+ rate + ", description=" + description + ", id=" + id + "]";
	}
	
	
	
	
	
}