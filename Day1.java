//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//Input: [2,2,1]
//Output: 1

class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int ans=0;
        int count[] = new int[len];
        for (int i=0;i<len;i++) {
            count[i]=0;
        }

        for (int i=0;i<len;i++) {
            for(int j=len-1;j>=0;j--){
            if(nums[i]==nums[j]) {
                count[i]++;
            }
        }
    }
        for(int i=0;i<len;i++) {
            if(count[i]==1){
                ans = nums[i];
              //  System.out.println("the number is" + ans + "the count is" + count[i]);
        }
        }
        return ans;
    }
}
