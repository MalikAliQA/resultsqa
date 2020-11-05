package main.resultsqa;

public class results {
	static int biomarks = 100;
	static int chemmarks = 100;
	static int physmark = 100;
	static int total = biomarks + chemmarks + physmark;
	static double perc = ((biomarks + chemmarks + physmark)/3);
	
	public static void main(String[] args) {
		display();
		//percentage();
		System.out.println("Overall Percentage: " + percentage() +"%");
		
	}
	
	public static void display() {
		System.out.println("Biology Mark: " + biomarks);
		System.out.println("Chemistry Mark: " + chemmarks);
		System.out.println("Phyics Mark: " + physmark);
		System.out.println("Total Mark: " + total);
		
	}
	
	public static double percentage() {
		double ans = (perc / 150)*100;
		return ans;
		
	}

}
