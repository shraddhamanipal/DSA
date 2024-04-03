package src.arrays;

class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate(nums, 4);
        for (int i: nums) {
            System.out.print(i + " ");
        }
    }
    public static void rotate(int[] nums, int k) {
        // Brute force solution:
        /*
        int last = 0;
        while(k>0) {
            last = nums[nums.length-1];
            for(int i = nums.length-1; i>=0; i--) {
                if(i==0) {
                    nums[i] = last;
                } else {
                    nums[i] = nums[i-1];
                }
            }
            k--;
        }
        */
        // Optimal solution with O(1) space & O(n) time complexity
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }
    private static void reverse(int[] nums, int start, int end) {
        while(start<end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}