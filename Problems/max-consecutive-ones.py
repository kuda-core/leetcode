class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        lo = 0
        hi = lo
        ret = 0
        count = 0
        for i in range(0, len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                count = 0
            ret = max(ret,count)
        return ret
