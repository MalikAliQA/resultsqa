package oop.animal;

public class Fish {
	
	//attributes
	protected String name = "missing";
	protected int age = 0;
	protected boolean hasFins = true;
	protected String colour = "???";
	
	
	//constructor
	public Fish() {
		super();
	}
	
	
	public Fish(String name, int age, String colour) {
		super();
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	
	//alt +shift + s constructor
	public Fish(String name, int age, boolean hasFins, String colour) {
		super();
		this.name = name;
		this.age = age;
		this.hasFins = hasFins;
		this.colour = colour;
	}
	
	//methods
	
	public void speak() {
		System.out.println(this.name + " goes blub blub");
	}
	
	public void hunt() {
		System.out.println();
	}
	
	public void nemo() {
		
	}

//getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isHasFins() {
		return hasFins;
	}


	public void setHasFins(boolean hasFins) {
		this.hasFins = hasFins;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	

}
