package oop.animal;

public class ParentAnimal {
	
	//Attributes
	protected String name = " ";
	protected String colour = " ";
	protected int legs = 0;
	
	
	//Constructor
	
	public ParentAnimal(){
		super();
		this.name = "";
		this.colour = "";
		this.legs = 0;
	}
	
	public ParentAnimal(String name, String colour, int legs){
		super();
		this.name = name;
		this.colour = colour;
		this.legs = legs;
	}
	
	
	//Methods
	public void speak() {
		System.out.println(this.name + "makes a ");
	}

	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	
	

}
