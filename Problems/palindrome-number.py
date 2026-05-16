class Solution:
    def isPalindrome(self, x: int) -> bool:
        t = []
        if x < 0:
            return False
        while x!= 0:
            t.append(x % 10)
            x = x//10
        while t:
            a = t.pop(0)
            if t:
                b = t.pop()
                if a != b:
                    return False
        
        return True
