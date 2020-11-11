package javabeginner;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonRunner {
	
	static ArrayList<Person> personsList = new ArrayList<>();
	
public static void main(String[] args) {
	
	
	//System.out.println("Result: " + conditionals.multisum());
	
		
		Person bob = new Person();
		bob.setName("Bob");
		bob.setAge(25);
		bob.setJobTitle("Teacher");
				
		Person barbara = new Person();
		barbara.setName("Barbara");
		barbara.setAge(35);
		barbara.setJobTitle("Engineer");
		
		Person alice = new Person();
		alice.setName("Alice");
		alice.setAge(24);
		alice.setJobTitle("Chef");
		
		Person eve = new Person();
		eve.setName("Eve");
		eve.setAge(23);
		eve.setJobTitle("Firefighter");
		
		Person malik = new Person();
		malik.setName("Malik");
		malik.setAge(22);
		malik.setJobTitle("Programmer");
		
		//ArrayList<Person> personsList = new ArrayList<>();
		personsList.add(bob);
		personsList.add(barbara);
		personsList.add(alice);
		personsList.add(eve);
		personsList.add(malik);
		
		menu();
		
		//for (int x = 0; x<personsList.size(); x++) {
			//System.out.println(personsList.get(x).getName());
			//System.out.println(personsList.get(x).getAge());
			//System.out.println(personsList.get(x).getJobTitle());			
		//}
		
		//enhanced for loop
		//for (Person handle : personsList) {
			// System.out.println(handle.getAll());
			
		//}		
		
	}

public static void outputAll(ArrayList<Person> personsList) {
	
	for (Person handle : personsList) {
		 System.out.println(handle.getAll());
		
	}		
	
	
}

public static void menu() {
	//ArrayList<Person> personsList = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	boolean flag = true;
	
	while (flag) {
	System.out.println("\nSelect Option: \n"
			+ "1.) Add Person\n"
			+ "2.) Output All Details\n"
			+ "3.) Search By name\n");
	String option = scan.next();
	
	switch (option) {
		case "1":
			System.out.println("Enter name: ");
			String name = scan.next();
			System.out.println("Enter age: ");
			int age = scan.nextInt();
			System.out.println("Enter Job Title: ");
			String jobTitle = scan.next();
			Person x = new Person();
			//ArrayList<Person> personsList = new ArrayList<>();
			x.setName(name);
			x.setAge(age);
			x.setJobTitle(jobTitle);
			personsList.add(x);
			break;
			
			
		case "2":
			outputAll(personsList);
			break;
			
		case "3":
		}
	}

}





}
