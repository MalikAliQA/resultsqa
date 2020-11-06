package main;

import java.util.ArrayList;

public class PersonRunner {
	
public static void main(String[] args) {
		
		Person bob = new Person();
		bob.setName("Bob");
		bob.setAge(25);
		
		Person a = new Person();
				
		Person barbara = new Person();
		barbara.setName("Barbara");
		barbara.setAge(35);
		
		Person alice = new Person();
		alice.setName("Alice");
		alice.setAge(24);
		
		Person eve = new Person();
		eve.setName("Eve");
		eve.setAge(23);
		
		Person malik = new Person();
		malik.setName("Malik");
		malik.setAge(22);
		
		ArrayList<Person> personsList = new ArrayList<>();
		personsList.add(bob);
		personsList.add(barbara);
		personsList.add(alice);
		personsList.add(eve);
		personsList.add(malik);
		
		for (int x = 0; x<personsList.size(); x++) {
			System.out.println(personsList.get(x).getName());
			System.out.println(personsList.get(x).getAge());
		}
		//enhanced for loop
		//for (Person handle : personsList) {
			//System.out.println(handle.getName());
			//System.out.println(handle.getAge());
			
		//}		
		
	}

}
