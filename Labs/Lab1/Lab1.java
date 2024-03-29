//Yeng Her
//1.30.24
//Two sum

import java.util.HashMap;

public class Lab1 {

	public static void main(String[] args) {
		//initialize array and target
		int[] array = new int[10];
		int target = 17;

		//initialize array elements
		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}
		
		System.out.println(twoSum(array, target));

	}
	
	private static String twoSum(int[] array, int target) {
		//initialize hashmap
		HashMap<Integer, Integer> hashbrown = new HashMap<>();

		//loop through the table, store items in a hashmap, then search the hashmap for the difference
		//if difference not found, store it in the hashmap and continue adding and searching
		for (int i = 0; i < array.length; i++) {
			int difference = target - array[i];
			if(hashbrown.containsKey(difference)) {
				return "The two numbers from the list that equal " + target + "are in locations " + hashbrown.get(difference) + " and " + i;
			}
			hashbrown.put(array[i], i);
		}
		return "No two number in the list added to " + target;
	}
}
