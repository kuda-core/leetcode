class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        prev = nums[i]

        for e in nums[1:]:
            if prev == e:
                continue
            else:
                i+=1
                nums[i] = e
                prev = e
        
        return i+1
