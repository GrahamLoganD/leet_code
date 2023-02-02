import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array = new HashMap<Integer, Integer>();

        for (int number_2_index = 0; number_2_index < nums.length; number_2_index++) {
            Integer number_1_index = array.get(target - nums[number_2_index]);

            if (number_1_index != null) {
                return new int[] { number_1_index.intValue(), number_2_index };
            }

            array.put(nums[number_2_index], number_2_index);
        }

        return null;
    }
}