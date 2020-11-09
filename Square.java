package javabeginner;

public class Square {
	
	//attributes
	private String password = "changeme";
	public String  name = "";
	public int sideLength = 0;
	public int sideWidth = 0;
	


	
	//constructor
	public Square() {
		System.out.println("Square: test");
	}
	
	
	//methods
	public int perimeter() {
		return sideLength*sideWidth;	
	}
	
	//getters and setters
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
