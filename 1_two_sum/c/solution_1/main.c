#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *twoSum(int *nums, int numsSize, int target, int *returnSize)
{
    int *sol;

    *returnSize = 2;

    sol = malloc(2 * sizeof(int));

    for (int i = 0; i < numsSize; i++)
    {
        for (int j = 0; j < numsSize; j++)
        {
            if (i == j)
                continue;
            
            if (nums[i] + nums[j] == target)
            {
                sol[0] = i;
                sol[1] = j;
                return sol;
            }
        }
    }

    return sol;
}

int main()
{
    twoSum()
}