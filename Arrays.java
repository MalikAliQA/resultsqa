package javabeginner;



public class Arrays {
	
	public static void task1() {
		int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int x = 0; x < firstArray.length; x++) {
			System.out.println(firstArray[x]);
		}
	}
	
	public static void task2() {
		int[] secondArray = new int[5];
		//System.out.println(secondArray[2]);
		for (int x = 0; x < secondArray.length; x++) {
			secondArray[x] = (x+5);
			System.out.println(secondArray[x]);
		}
		for (int x = 0; x < secondArray.length; x++) {
			System.out.println((secondArray[x])*10);
		}
		
		
	}
	
	public static void main(String[] args) {
		//task1();
		task2();
		
	}

}
