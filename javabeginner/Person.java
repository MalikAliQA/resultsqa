package javabeginner;
import java.util.ArrayList;

public class Person {
	
	//attributes
		private String  name = "";
		private int age = 0;
		private String jobTitle = "";
		
		
		//constructor
		public Person() {

		}
		
		public Person(String name, int age, String jobTitle) {
			this.setName(name);
			this.setAge(age);	
			this.setJobTitle(jobTitle);
		}
		
		
		//methods
		
		public String getAll() {
			return String.format("Name: " + name + " Age: " + age + " Job Title: " + jobTitle);
			
		}
		
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

		public String getJobTitle() {
			return jobTitle;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

	
}
