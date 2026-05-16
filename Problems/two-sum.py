class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = []
        for i in range(0,len(nums)):
            if nums[i] in m:
                return i,nums.index(target-nums[i])
            else:
                m.append(target - nums[i])
