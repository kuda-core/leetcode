class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        hm = {}
        ret = []
        for e in nums:
            if e in hm:
                continue
            else:
                hm[e] = 1
        for i in range(0,len(nums)):
            if i+1 in hm:
                continue
            else:
                ret.append(i+1)
        
        return ret
