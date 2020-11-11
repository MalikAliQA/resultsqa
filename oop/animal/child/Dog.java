package oop.animal.child;

import oop.animal.ParentAnimal;

public class Dog extends ParentAnimal {
	
	//Attributes
		public boolean canBark = true;
		
		
		//constructors
		public Dog() {
			super();
		}
		//overloaded constructor
		public Dog(String name, int legs, String colour, boolean canBark) {
			super(name, colour, legs);
			this.canBark = canBark;
		}
		
		//methods
		public boolean canBark() {
			return canBark;
		}
		public void setcanBark(boolean canBark) {
			this.canBark = canBark;
			
		}

}
