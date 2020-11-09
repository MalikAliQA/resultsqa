package javabeginner;

public class Runner2 {
	
	public static void main(String[] args) {
		
		Square variable = new Square();
		
		variable.name = "Jim";
		variable.sideLength = 5;
		variable.sideWidth = 10;
		System.out.println(variable.perimeter());
	}

}
