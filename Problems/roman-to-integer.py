class Solution:
    def romanToInt(self, s: str) -> int:
        characters = ['I', 'V', 'X', 'L', 'C', 'D', 'M']
        vals = [1,5,10,50,100,500,1000]
        t = 0
        print(len(s))
        for i in range(0,len(s)):
            a = s[i]
            x = characters.index(a)
            if i+1 == len(s):
                t += vals[x]
                break
            b = s[i+1]
            y = characters.index(b)
            if x < y:
                t -= vals[x]
            else:
                t += vals[x]
                
        return t
