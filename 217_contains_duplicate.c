#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool contains_duplicate(int *nums, int nums_size)
{
    // APPROACH 1: BRUTE FORCE - time complexity of this approach is O(n^2)
    for (int i = 0; i < nums_size; i++)
        for (int j = i + 1; j < nums_size; j++)
            if (nums[i] == nums[j])
                // printf("%d duplicate\n", nums[i]);
                return true;

    return false;
}

int main()
{
    int output1[] = {1, 2, 3, 1};
    int output2[] = {1, 2, 3, 4};
    int output3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    int output4[] = {100, 122, 123, 124, 126, 124};

    unsigned int size1 = sizeof(output1) / sizeof(output1[0]);
    unsigned int size2 = sizeof(output2) / sizeof(output2[0]);
    unsigned int size3 = sizeof(output3) / sizeof(output3[0]);
    unsigned int size4 = sizeof(output4) / sizeof(output4[0]);

    if (contains_duplicate(output4, size4))
    {
        printf("test case contains duplicate!\n");
    }
    else
    {
        printf("test case contains no duplicate\n");
    }

    return 0;
}