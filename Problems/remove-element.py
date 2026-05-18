class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i = 0
        for e in nums:
            if e == val:
                continue
            else:
                nums[i] = e
                i+=1
        return i
