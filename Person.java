package main;
import java.util.ArrayList;

public class Person {
	
	//attributes
		private String  name = "";
		private int age = 0;
		
		//constructor
		public Person() {
			setName("");
			setAge(0);	
		}
		
		//public Person(String name, int age) {
			//this.setName(name);
			//this.setAge(age);			
		//}
		
		
		//methods
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	
}
