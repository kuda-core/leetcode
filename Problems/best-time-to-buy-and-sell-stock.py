class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        tmp = 0
        leftmost = 0
        for i in range(1,len(prices)):
            rightmost = i
            if prices[leftmost] >= prices[rightmost]:
                leftmost = rightmost
            else:
                tmp = max(tmp,prices[rightmost] - prices[leftmost])
                
        return tmp
