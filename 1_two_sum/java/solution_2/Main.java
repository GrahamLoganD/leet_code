import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Case 1");
        int[] nums_1 = { 2, 7, 11, 15 };
        int target_1 = 9;
        Solution solution_1 = new Solution();
        int[] output_1 = solution_1.twoSum(nums_1, target_1);
        System.out.println("Output:   " + Arrays.toString(output_1));
        System.out.println("Expected: [0, 1]");
        System.out.println();

        System.out.println("Case 2");
        int[] nums_2 = { 3, 2, 4 };
        int target_2 = 6;
        Solution solution_2 = new Solution();
        int[] output_2 = solution_2.twoSums(nums_2, target_2);
        System.out.println("Output:   " + Arrays.toString(solution_2.twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println("Expected: [1, 2]");
        System.out.println();

        System.out.println("Case 3");
        Solution solution_3 = new Solution();
        System.out.println("Output:   " + Arrays.toString(solution_3.twoSum(new int[] { 3, 3 }, 6)));
        System.out.println("Expected: [0, 1]");
    }
}
