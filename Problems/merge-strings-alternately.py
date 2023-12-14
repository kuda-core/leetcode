class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i = 0
        j = 0
        one = True
        ret = ""
        while i < len(word1) and j < len(word2):
            if one == True:
                one = False
                ret += word1[i]
                i+=1
            else:
                one = True
                ret += word2[j]
                j+=1
        
        if j < len(word2):
            while j < len(word2):
                ret += word2[j]
                j+=1
        if i < len(word1):
            while i < len(word1):
                ret += word1[i]
                i+=1
        return ret
