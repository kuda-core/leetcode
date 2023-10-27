class Solution {
    /*
    check the middle as pivot,
    if it is less than, check left half
    else, check right half
    if not found, if less than last, last index
    if more than last index+1
    */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = right/2;// 4/2 == 2      0 1 2 3 4
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(target == nums[mid]) {
                return mid;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if(target < nums[mid])
            return mid;
        return mid+1;
    }

}
