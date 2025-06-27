// Last updated: 6/27/2025, 11:45:01 AM
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int n, int target, int* returnSize) {
    for(int i=0 ; i<n ; i++){    
        for(int j = i+1 ; j<n ; j++){
            if(nums[i] + nums[j] == target) {
                int* res = (int*)malloc(2* sizeof(int));
                res[0] = i;
                res[1] = j;
                *returnSize = 2;
                return res;
            }
        }
    }
    *returnSize = 0;
    return NULL;
}