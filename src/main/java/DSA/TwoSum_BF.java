package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_BF {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numIndexMap.containsKey(target - nums[i])) {
                return new int[]{numIndexMap.get(target - nums[i]), i};
            }
            numIndexMap.put(nums[i], i);
        }
        System.out.println("No valid pair found!"); // Debugging statement
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 1, 9, 5};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target))); // Expected Output: [2, 4]
    }
}