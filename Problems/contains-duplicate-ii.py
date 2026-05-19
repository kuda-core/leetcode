class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hm = {}
        count = 0
        if k == 0:
            return False
        for e in nums:
            print(len(hm),k)
            if len(hm) > k:
                hm.pop(next(iter(hm)))
            if e in hm:
                return True
            hm[e] = 1
            
        return False
