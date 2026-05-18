class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        dst = 0
        for e in nums:
            dst ^= e
        return dst
