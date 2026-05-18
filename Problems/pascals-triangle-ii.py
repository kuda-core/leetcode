class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        #0
        if rowIndex == 0:
            return [1]
        #1
        if rowIndex == 1:
            return [1,1]
        
        #2++
        prev = [1,1]
        for i in range(2,rowIndex+1):
            #leftmost
            src = [1]
            for j in range(0,i-1):
                src.append(prev[j]+prev[j+1])
            #rightmost
            src.append(1)
            prev = src
        return src
