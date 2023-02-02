import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Case 1");
        Solution solution_1 = new Solution();
        System.out.println("Output:   " + Arrays.toString(solution_1.twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println("Expected: [0, 1]");
        System.out.println();

        System.out.println("Case 2");
        Solution solution_2 = new Solution();
        System.out.println("Output:   " + Arrays.toString(solution_2.twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println("Expected: [1, 2]");
        System.out.println();

        System.out.println("Case 3");
        Solution solution_3 = new Solution();
        System.out.println("Output:   " + Arrays.toString(solution_3.twoSum(new int[] { 3, 3 }, 6)));
        System.out.println("Expected: [0, 1]");
    }
}
