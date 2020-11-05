package main;

public class iterators {
		
	public static void task1() {
		for(int a = 100; a <= 200; a++) {
			System.out.println(a);
		}
		System.out.println("End");			
	}
	
	public static void task2() {
		
		for(int a = 100; a <= 200; a++) {
			if (a%2 == 0){
				System.out.println("-");
			}else {
				System.out.println("*");				
			}
		}
		System.out.println("End");		
	}
		
	public static void task3() {
		for (int y = 1; y <=10; y++) {
			for(int x = 1; x <= 10; x++) {
				System.out.println(x);
			}						
		}
	}
	
	public static void task5() {
	       for(int y=1; y<=10; y++) {
	           for(int x=1; x<=y; x++) {
	               System.out.println(y);
	           }
	       }
	}
	
	
	public static void main(String[] args) {
		task5();

	}

}
