class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int index = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if(prev == curr) {
                continue;
            } else {
                nums[index] = curr;
                prev = curr;
                index++;
                count++;
            }
        }
        return count;
    }
}
