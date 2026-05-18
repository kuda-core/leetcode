class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hm = {}
        for e in nums:
            if e in hm:
                return True
            hm[e] = 1
        return False
