class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        count = duration
        prev = timeSeries[0]
        for e in timeSeries[1:]:
            if prev + duration >= e:
                count -= ((prev+duration)-e)
            #simple case
            count += duration
            prev = e
        return count
