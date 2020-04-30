//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
class Solution {
    public int maxSubArray(int[] nums) {
    int size= nums.length;
    int max_so_far = nums[0];
    int curr_max = nums[0];
    for (int i = 1; i < size; i++)
    {
        curr_max = Math.max(nums[i], curr_max+nums[i]);
        max_so_far = Math.max(max_so_far, curr_max);
    }
    return max_so_far;
    }
    }
