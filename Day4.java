//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int count =0;//count number of zeroes in array
        for (int i=0;i<len;i++) {
        if(nums[i]!=0){
            nums[count++]=nums[i];
        }
        }
        while(count<len) {
            nums[count++] =0;
        }
    }
}
