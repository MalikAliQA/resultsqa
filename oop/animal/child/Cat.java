package oop.animal.child;

import oop.animal.ParentAnimal;

public class Cat extends ParentAnimal {
	
	
	//Attributes
	public boolean canPurr = true;
	
	
	//constructors
	public Cat() {
		super();
		this.name = "Cat";
		this.legs = 4;
		this.colour = "";
		this.canPurr = true;
	}
	
	public Cat(String name, int legs, String colour, boolean canPurr) {
		super(name, colour, legs);
		this.name = "Cat";
		this.legs = 4;
		this.colour = ("");
		this.canPurr = canPurr;

	}
	
	//methods
	public boolean canPurr() {
		return canPurr;
	}
	public void setcanPurr(boolean canPurr) {
		this.canPurr = canPurr;
		
	}
	
	

}
