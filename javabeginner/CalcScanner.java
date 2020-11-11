package javabeginner;

import java.util.Scanner;

public class CalcScanner {
	
	public static void main(String[] args) {
		
		switch (readInput()) {
			case "1":
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter First Number: ");
				int x = scan.nextInt();
				System.out.println("Enter Second Number: ");
				int y = scan.nextInt();
				System.out.println("Total: " + add(x, y));
				break;
			case "2":
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter First Number: ");
				int x2 = scan2.nextInt();
				System.out.println("Enter Second Number: ");
				int y2 = scan2.nextInt();
				System.out.println("Total: " + minus(x2, y2));
				break;
			case "3":
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter First Number: ");
				int x3 = scan3.nextInt();
				System.out.println("Enter Second Number: ");
				int y3 = scan3.nextInt();
				System.out.println("Total: " + div(x3, y3));
				break;
			case "4":
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter First Number: ");
				int x4 = scan4.nextInt();
				System.out.println("Enter Second Number: ");
				int y4 = scan4.nextInt();
				System.out.println("Total: " + multi(x4, y4));
				break;
			default:
				System.out.println("Enter a valid Number");
				break;
		
		
		}

	}
	
	public static String readInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Option: \n"
				+ "1.) Add \n"
				+ "2.) Subtract\n"
				+ "3.) Divide\n"
				+ "4.) Multiply");
		String op = scan.next();
		return op;
		
		
		
		
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
