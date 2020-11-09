package javabeginner;

public class calculator {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		int x = 5;
		int y = 10;
		System.out.println(add(x, y));
		System.out.println(minus(x, y));
		System.out.println(multi(x, y));
		if (x < y) {
			System.out.println("Division cannot be performed");
		} else {
			System.out.println(div(x, y));
		}
	}
	
	public static int add(int x, int y) {
		return  x + y;
		
	}
	
	public static int minus(int x, int y) {
		return  x - y;
		
	}
	
	public static int multi(int x, int y) {
		return  x * y;
		
	}
	
	public static double div(double x, double y) {
		return  x / y;
		
	}
	
	
	
	

}
