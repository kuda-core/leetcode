class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        #0
        dst = [[1]]
        #1
        if numRows > 1:
            dst.append([1,1])

        #2++
        for i in range(2,numRows):
            prev = dst[-1]
            #leftmost
            src = [1]
            #computation/adding
            for j in range(0,i-1):
                src.append(prev[j]+prev[j+1])
            #rightmost
            src.append(1)
            dst.append(src)
        return dst
