class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        x = m-1
        y = n-1
        for i in reversed(range(0,m+n)):
            if x<0 or y<0:
                break
            if nums1[x] < nums2[y]:
                nums1[i] = nums2[y]
                y -= 1
            else:
                nums1[i] = nums1[x]
                x -= 1
        
        if x >=0:
            for i in reversed(range(0,x+1)):
                nums1[i] = nums1[i]
        if y >=0:
            for i in reversed(range(0,y+1)):
                nums1[i] = nums2[i]
