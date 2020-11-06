package main;

public class EnhancedForLoops {
	
	public static Integer[] numArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void task1() {
		String[] stringArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		for(String str : stringArray) {
	        System.out.println(str);
	    }
	}
	
	public static void task2() {
		Integer[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(Integer num : numArray) {
			int sqrnum = num*num ;
	        System.out.println(sqrnum);
	    }
	}
	
	public static boolean task3(int x) {
		boolean y = true;
		if (x%2 == 0) {
		return y;
		}else {
			y = false;
			return y;
		}
		
	} 
	
	public static int task4(int x) {
		//boolean y = true;
		if (x%2 == 0) {
			return x*x*x;
			}else {
				//y = false;
				return x*x;
			}
	} 
		
	public static void main(String[] args) {
		//task1();
		//task2();
		//int a = 3;
		//int b = 4;
		//System.out.println(task3(b));
		//task2();
		for(Integer num : numArray2) {
	        System.out.println(task4(num));
	    }		
	}

}
