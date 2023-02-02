class Solution {
    private class NumberWithIndex {
        private int number;
        private int index;

        NumberWithIndex(int number, int index) {
            this.number = number;
            this.index = index;
        }

        private int getNumber() {
            return this.number;
        }

        private int getIndex() {
            return this.index;
        }
    }

    private void quickSort(NumberWithIndex[] array, int lower_index, int upper_index) {
        if (lower_index >= upper_index || lower_index < 0) {
            return;
        }

        int partition_index = partition(array, lower_index, upper_index);

        quickSort(array, lower_index, partition_index - 1);
        quickSort(array, partition_index + 1, upper_index);
    }

    private int partition(NumberWithIndex[] array, int lower_index, int upper_index) {
        int pivot_value = array[upper_index].getNumber();
        int temporary_pivot_index = lower_index - 1;

        for (int i = lower_index; i < upper_index; i++) {
            if (array[i].getNumber() <= pivot_value) {
                temporary_pivot_index++;
                swap(array, temporary_pivot_index, i);
            }
        }

        temporary_pivot_index++;
        swap(array, temporary_pivot_index, upper_index);
        return temporary_pivot_index;
    }

    private void swap(NumberWithIndex[] array, int index_1, int index_2) {
        NumberWithIndex save_value = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = save_value;
    }

    private class BinarySearch {
        private int target_index;
        private boolean successful;

        private BinarySearch(NumberWithIndex[] array, int lower_index, int upper_index, int target_value) {
            while (lower_index <= upper_index) {
                int middle_index = (lower_index + upper_index) / 2;
                int middle_value = array[middle_index].getNumber();

                if (middle_value < target_value) {
                    lower_index = middle_index + 1;
                }

                else if (middle_value > target_value) {
                    upper_index = middle_index - 1;
                }

                else {
                    this.target_index = middle_index;
                    this.successful = true;
                    return;
                }
            }
        }

        private int getTargetIndex() {
            return this.target_index;
        }

        private boolean isSuccessful() {
            return this.successful;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        NumberWithIndex[] array = new NumberWithIndex[length];

        for (int index = 0; index < length; index++) {
            array[index] = new NumberWithIndex(nums[index], index);
        }

        quickSort(array, 0, length - 1);

        for (int first_number_index = 0; first_number_index < length - 1; first_number_index++) {
            BinarySearch binary_search = new BinarySearch(array, first_number_index + 1, length - 1,
                    target - array[first_number_index].getNumber());

            if (binary_search.isSuccessful()) {
                return new int[] { array[first_number_index].getIndex(),
                        array[binary_search.getTargetIndex()].getIndex() };
            }
        }
        return null;
    }
}