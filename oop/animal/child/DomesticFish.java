package oop.animal.child;

import oop.animal.Fish;

public class DomesticFish extends Fish {
	
	//attributes
	protected boolean hasOwner = true;
	
	//constructors
	public DomesticFish(String name, int age, boolean hasFins, String colour) {
		super(name, age, hasFins, colour);
		// TODO Auto-generated constructor stub
		
		
	}

	public DomesticFish(String name, int age, String colour) {
		super(name, age, colour);
		// TODO Auto-generated constructor stub
	}


	//getter and setters
	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}
	
	
	
	

}
