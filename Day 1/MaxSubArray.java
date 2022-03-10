//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int currentArr = nums[0];
        int maxArr = nums[0];
        for (int i = 1; i < nums.length; i++) {
              
            currentArr = Math.max(nums[i], currentArr+nums[i]);
            maxArr = Math.max(maxArr, currentArr);
        }
     
    } 
}
