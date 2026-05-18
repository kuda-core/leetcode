class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1
        for i,e in reversed(list(enumerate(digits))):
            tmp = e + carry
            carry = tmp//10
            digits[i] = tmp%10
        if carry > 0:
            digits.insert(0,carry)
        return digits
             
