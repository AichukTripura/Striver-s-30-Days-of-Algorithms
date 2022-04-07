// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects 
// of the same color are adjacent, with the colors in dthe order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

class Solution {
    public void sortColors(int[] nums) {
        /* 
        0 <= 0's < low
        low <= 1's < med
        med <= ??? < high
        high < 2's < length(num)
        */
        int l = 0;
        int m = 0;
        int h = nums.length-1;
        
        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, l, m); 
                l++; 
                m++;   
            }
            
            else if (nums[m] == 1) {
                m++;
            }
            
            else if (nums[m] == 2) {
                swap(nums, m, h);
                h--;
            }
        }
    }
    
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
