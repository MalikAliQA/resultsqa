package javabeginner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask {
	
	public static void stringArrayList() {
		
		ArrayList<String> Games = new ArrayList<>();
		Games.add("Overwatch");
		Games.add("COD");
		Games.add("CSGO");
		System.out.println(Games);
		//prints out arraylist normal for loop
		System.out.println("Normal for loop:");
		for (int x = 0; x<Games.size(); x++) {
			System.out.println(Games.get(x));
		}
		//prints out arraylist enhancedfor loop
		System.out.println("Enhanced For Loop:");
		for (String i: Games) {
			System.out.println(i);			
		}
		
		Games.get(1);
		System.out.println(Games);
		Games.set(2, "FIFA");
		System.out.println(Games);
		Games.remove(2);
		System.out.println(Games);
		Games.add("Valorant");
		System.out.println(Games);
		Games.add("Minecraft");
		Games.add("FIFA");
		Games.add("Batman");
		Games.add("LoL");
		Games.add("DnD");
		Games.add("Dota2");
		Games.add("CIV");	
		Collections.sort(Games);
		System.out.println(Games);
		Collections.reverse(Games);
		System.out.println(Games);
		Collections.swap(Games, 0, 9);
		System.out.println(Games);
		
	}
	
	public static void numberArrayList() {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		//prints out arraylist normal for loop
		for (int x = 0; x<nums.size(); x++) {
			System.out.println(nums.get(x));
		}
		//prints out arraylist enhancedfor loop
		for (Integer i: nums) {
			System.out.println(i);			
		}
		
		nums.get(1);
		System.out.println(nums);
		nums.set(2, 9);
		System.out.println(nums);
		nums.remove(2);
		System.out.println(nums);
		nums.add(3);
		System.out.println(nums);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);	
		Collections.sort(nums);
		System.out.println(nums);
		Collections.reverse(nums);
		System.out.println(nums);
		Collections.swap(nums, 0, 9);
		System.out.println(nums);
		
		
		
	}
	
	public static void main(String[] args) {
		stringArrayList();
		//numberArrayList();
		
	}

}
