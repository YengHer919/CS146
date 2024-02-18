//Yeng Her
//2.17.2024

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW6{

    public static List<List<Integer>> threeSum(int[] nums) {
    	
    	//initialize arraylists of list of intergers and the target
        List<List<Integer>> result = new ArrayList<>();
        int target = 0;
        List<List<Integer>> seen = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
        	//initialize a new hashmap and a difference for each each iteration 
            Map<Integer, Integer> hashMap = new HashMap<>();
            int difference = target - nums[i];

            for (int j = i; j < nums.length; j++) {
                int num = difference - nums[j];
                //check for duplicate numbers
                if (hashMap.containsKey(num) && nums[i] != nums[j] && nums[j] != num && nums[i] != num) {
                    List<Integer> triple = Arrays.asList(nums[i], nums[j], num);
                    triple.sort(null);
                    //check for duplicate lists
                    if (!seen.contains(triple)) {
                        result.add(triple);
                        seen.add(triple);
                    }
                }
                hashMap.put(nums[j], j);
            }
        }

        if (result.isEmpty()) {
            System.out.println(result);
            //System.out.println("There are no triplets in the set that equal zero");
            return result;
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 1};
        int[] nums2 = {-5, 0, 5, 10, -10, 0};
        // Output: []
        // Explanation: The only possible triplet does not sum up to 0.

        // Output: [[-10,0,10],[-5,0,5]]
        // Explanation: There are two possible combinations of triplets that satisfy: (-5,0,5) and (-10,0,10).
        threeSum(nums1);
        threeSum(nums2);
    }
}
