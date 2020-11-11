package oop.animal.child;

import oop.animal.Fish;

public class Shark extends Fish {

	//attributes
	protected boolean isWild = true;
	//protected boolean 
	
	
	//constructors
	public Shark() {
		super();
	}
	
	
	public Shark(String name, int age, boolean hasFins, String colour) {
		super(name, age, hasFins, colour);
		// TODO Auto-generated constructor stub
	}

	public Shark(String name, int age, String colour) {
		super(name, age, colour);
		// TODO Auto-generated constructor stub
	}
	
	
	//method
	@Override
	public void speak() {
		
		System.out.println(this.name + " goes nom nom");
		
	}

	
	//getters and setters
	
	public boolean isWild() {
		return isWild;
	}


	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}
	
	
	
	
	
	

}
