package oop;
import oop.animal.child.Cat;
import oop.animal.child.Dog;


public class Runner {
	
	public static void main(String[] args) {
		
		Cat genericCat = new Cat();
		Dog genericDog = new Dog("Dog", 4, "Golden", true);
		Dog genericDog1 = new Dog();
		
		genericDog1.setName("Rex");
		System.out.println(genericDog1.getName());
		
		System.out.println(genericCat.getColour());
		System.out.println(genericDog.getName() + " Colour is: " + genericDog.getColour());
		
		
	}

}
