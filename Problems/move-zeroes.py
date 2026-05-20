class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        j = 0
        for e in nums:
            if e != 0:
                nums[i] = e
                i += 1
        for j in range(i,len(nums)):
            nums[j] = 0
