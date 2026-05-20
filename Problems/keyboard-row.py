class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        hx = {}
        hy = {}
        hz = {}
        for e in "qwertyuiop":
            hx[e] = True
        for e in "asdfghjkl":
            hy[e] = True
        for e in "zxcvbnm":
            hz[e] = True
        
        
        ret = []
        for word in words:
            x = True
            y = True
            z = True
            for char in word.lower():
                if x and char not in hx:
                    x = False
                if y and char not in hy:
                    y = False
                if z and char not in hz:
                    z = False
            if x or y or z:
                ret.append(word)
        return ret
