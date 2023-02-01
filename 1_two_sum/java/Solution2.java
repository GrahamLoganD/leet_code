import java.util.Arrays;

class Solution {
    private int[] quickSort(int[] array) {
        int partition_index;
        int pivot_value = array[array.length - 1];
        int temporary_pivot_index = 
    }

    private class binarySearchOutput {
        private int middle_search_index;
        private boolean successful;

        private binarySearchOutput(int middle_search_index, boolean successful) {
            this.middle_search_index = middle_search_index;
            this.successful = successful;
        }

        private int getMiddleSearchIndex() {
            return middle_search_index;
        }

        private boolean isSuccessful() {
            return successful;
        }
    }

    private binarySearchOutput binarySearch(int[] array, int target_value) {
        int lower_search_index = 0;
        int upper_search_index = array.length - 1;
        int search_target_value = target_value;

        while (lower_search_index <= upper_search_index) {
            int middle_search_index = (lower_search_index + upper_search_index) / 2;
            int middle_value = array[middle_search_index];

            if (middle_value < search_target_value) {
                lower_search_index = middle_search_index + 1;
            }

            else if (middle_value > search_target_value) {
                lower_search_index = middle_search_index - 1;
            }

            else {
                return new binarySearchOutput(middle_search_index, true);
            }
        }
        return new binarySearchOutput(0, false);
    }

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        // sort i guess

        for (int first_number_index = 0; first_number_index < length - 1; first_number_index++) {
            binarySearchOutput binary_search_output = binarySearch(
                    Arrays.copyOfRange(nums, first_number_index + 1, length - 1), target - nums[first_number_index]);
            if (binary_search_output.isSuccessful()) {
                return new int[] { first_number_index, binary_search_output.getMiddleSearchIndex() };
            }
        }
        return null;
    }
}