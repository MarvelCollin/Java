package models;

public class Fruit {
	private Integer id;
	private String name;
	private Pet pet;
	
	public Fruit(Integer id, String name, Pet pet) {
		this.id = id;
		this.name = name;
		this.pet = pet;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
