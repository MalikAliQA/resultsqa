package javabeginner;

public class StringManipulation {
	
	public static void countstring() {
		//do it without whitespace too
		//counter 
		//whitespace = " ";
		//compare whole string to whitespace
		//counter++ when .equals whitespace 
		//totallength-counter = length without whitespace 
		String message = ("Hello World");
		System.out.println(message + " - " + message.length() + " characters including space ");				
	}
	
	public static void printstringvert() {
		String message = ("Hello World");		
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.substring(i, i+1));
		}	
	}
	
	public static void printstringreversevert() {
		String message = ("Hello World");
		//System.out.println(message.substring(-1));
		//int x = 0;
		//message.charAt(index)
		//work on a way to do without any array items
		int msize = message.length();
		for (int x = msize; x > 0; x--) {
			System.out.println(message.charAt(x-1));			
		}				
	}
	
	public static void findstring() {
		String message1 = ("Fundamentals");
		String message2 = ("Fun");
		String message3 = ("Mental");
		//
		if (message1.contains(message2)) {
			System.out.println(message1 + " contains " + message2);			
		}else {
			System.out.println("not found");
		}
		
		
	}
	
	public static void main(String[] args) {
		//countstring();
		//printstringvert();
		//printstringreversevert();
		findstring();

	}

}
