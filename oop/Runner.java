package oop;
import oop.animal.child.Cat;
import oop.animal.child.Dog;
import oop.animal.child.DomesticFish;
import oop.animal.child.Shark;


public class Runner {
	
	public static void main(String[] args) {
		
		//Cat genericCat = new Cat();
		//Dog genericDog = new Dog("Dog", 4, "Golden", true);
		//Dog genericDog1 = new Dog();
		
		//genericDog1.setName("Rex");
		//System.out.println(genericDog1.getName());
		
		//System.out.println(genericCat.getColour());
		//System.out.println(genericDog.getName() + " Colour is: " + genericDog.getColour());
		
		DomesticFish nemo = new DomesticFish ("nemo", 2, "Orange");
		nemo.speak();
		
		Shark bruce = new Shark ("Bruce", 12, "White");
		bruce.speak();
		
		
		
		
	}

}
