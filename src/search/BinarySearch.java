package src.search;

public class BinarySearch {

    public static void main(String args[]) {
        int[] arr = {3, 8, 11, 20, 24, 39};
        int target = 8;
        int res = search(arr, target);
        System.out.print(res);
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 1) {
            if(nums[0] == target)
                return 0;
            else return -1;
        }
        return search(nums, 0, nums.length-1, target);
    }

    public static int search(int[] nums, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(target < nums[mid]) {
                return search(nums, start, mid-1, target);
            } else {
                return search(nums, mid+1, end, target);
            }
        }
        return -1;
    }
}
