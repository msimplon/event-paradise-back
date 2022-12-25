package co.simplon.events.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;




public class EventCreate {
	
	 @Size(max = 255)	
	    @NotEmpty
	    private String name;
	 
	    @FutureOrPresent
	    @NotNull
	    private LocalDate date;
	    
	    
	    @NotNull
	    private Long locationId;
	    
	    
	    @NotNull
	    private Long themeId;
	    
	    @DecimalMin(value = "0.01")
	    @NotNull
	    private Double rate;
	    
	    @Size(max = 1000)
	    @NotEmpty
	    private String description;
	    private Long id;

	    public EventCreate() {
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

		public Long getLocationId() {
			return locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public Long getThemeId() {
			return themeId;
		}

		public void setThemeId(Long themeId) {
			this.themeId = themeId;
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
	    
	    

}
