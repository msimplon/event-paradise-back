package co.simplon.events.entities;

public class Theme {
	
    private String name;
    private Long id;

    public Theme() {

    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Theme [name=" + name + ", id=" + id + "]";
	}
    
    
    
    

}
