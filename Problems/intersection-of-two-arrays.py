class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        hm = {}
        for e in nums1:
            if e in hm:
                continue
            else:
                hm[e] = 1
        for e in nums2:
            if e in hm:
                hm[e] = 2
            else:
                continue
        dst = {}
        for k,v in hm.items():
            if v == 2:
                dst[k] = 2
        
        return list(dst)
