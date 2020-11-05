package main;

public class conditionals {
	static int num1 = 5;
	static int num2 = 2;
	static boolean num3 = false;
	
	
	public static int multisum() {
		if (num3 == true){
			int ans = num1 + num2;
			//System.out.println(ans);
			return ans;	
			
		}else {
			int ans = num1 * num2;
			//System.out.println(ans);
			return ans;	
			
		}
					
	}
	
	public static void main(String[] args) {

		System.out.println("Result: " + multisum());
		
	}
	
}