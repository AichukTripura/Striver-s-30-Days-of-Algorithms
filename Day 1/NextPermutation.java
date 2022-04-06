class Solution {
    public void nextPermutation(int[] nums) {
        int i = findIndex(nums);
        if (i == -1) { //nums is in descending order
            reverse(nums, 0, nums.length-1);
        }
        else {
            int nextHighest = findNextHighest(nums, i);
            swap(nums, i, nextHighest);
            reverse(nums, i+1, nums.length-1);
        }
    }
    
    //to find the first index where array[index] < array[index+1] when scanning integer array from right to left
    public static int findIndex(int[] nums) {
        int i;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                return i;
            }
        }
        
        //no such index exists
        return -1;
    }
    
    //find the right most index next_index such that array[next_index] is the smallest number that is greater than array[index] 
    //where index < next_index < nums.length
    public static int findNextHighest(int[] nums, int index) {
        int first = nums[index];
        int next = index+1;
        for (int i = next; i < nums.length; i++) {
            if (nums[i] > first && nums[i] <= nums[next]) {
                next = i;
            }
        }
        return next;
    }
    
    public static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    
    public static void reverse(int[] nums, int low, int high) {
        while (low < high) {
            swap(nums, low, high);
            low++; high--;
        }
    }
}
