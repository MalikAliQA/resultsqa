package javabeginner;

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
	
//numbers revisited requires array so wait for array presentation first
	
	/*
	 * can implement coins but will be a little messy
	 * pseudocode:
	 * cost, pay and change variables 
	 * change = pay - cost 
	 * then do a while loop that - a money amount till change reaches a negative number
	 * go 1 up from negative and go to next lower amount till negative 
	 * repeat till change is exactly 0 
	 * e.g. change = £40.50
	 * -50 change = 40.50
	 * -20 change = 20.50
	 * -20 change = 0.50
	 * -10 change = 0.50
	 * -5 change = 0.50
	 * -2 change = 0.50
	 * -1 change = 0.50
	 * -0.50 change = 0
	 * -0.2
	 * -0.1
	 * -0.05
	 * -0.02
	 * -0.01
	 * counter for each while change so 2 for 20 and 1 for 0.5 
	 * prints out counter and change amount 
	 * 2 £20
	 * 1 50p
	 * 
	 * might be an easier way with arrays where you have note value and coin value 
	 * arrays and go through the array biggest to smallest
	 * implement method1 first then look at arrays
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		task5();

	}

}
