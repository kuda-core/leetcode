class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x, y, i = m - 1, j = n - 1, k  = m + n - 1;
        for(;i >= 0 && j >= 0;) {
            x = nums1[i];
            y = nums2[j];
            if(x > y) {
                nums1[k] = x;
                k--;
                i--;
            } else {
                nums1[k] = y;
                k--;
                j--;
            }
        }
        for(;j >= 0;)  {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        for(;i >= 0;) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
    }
}
