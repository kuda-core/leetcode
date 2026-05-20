class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        hm = {}
        for e in nums1:
            if e in hm:
                hm[e][0] += 1
            else:
                hm[e] = [1,0]
        for e in nums2:
            if e in hm:
                hm[e][1] += 1
            else:
                continue
        dst = []
        for k,v in hm.items():
            for i in range(0,min(v)):
                dst.append(k)
        return dst
