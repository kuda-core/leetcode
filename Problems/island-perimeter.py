class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        rows = len(grid)
        cols = len(grid[0])

        count = 0
        for i in range(0,rows):
            for j in range(0,cols):
                #land
                if grid[i][j] == 1:
                    #uppermost
                    if i == 0:
                        count += 1
                    else:
                        if grid[i-1][j] == 0:
                            count += 1

                    #leftmost
                    if j == 0:
                        count += 1
                    else:
                        if grid[i][j-1] == 0:
                            count += 1
                    #rightmost
                    if j == cols-1:
                        count += 1
                    else:
                        if grid[i][j+1] == 0:
                            count += 1
                    #lowermost
                    if i == rows-1:
                        count += 1
                    else:
                        if grid[i+1][j] == 0:
                            count += 1
                    
        return count
