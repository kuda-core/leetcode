class Solution {
    public int[] plusOne(int[] digits) {
        int sum =  0;
        int carry = 1;
        int x = 0;
        for(int i = digits.length - 1; i >= 0; i--)  {
                x = digits[i];
                sum = (x + carry)%10;// 18 mod 10 = 8
                carry = (x + carry)/10;// 11 divided by 10 = 1
                digits[i] = sum;
        }
        if(carry > 0)
            return increaseSize(digits);
        return digits;
    }
    public int[] increaseSize(int digits[]) { 
        int[] ret = new int[digits.length + 1];
        ret[0] = 1;
        for(int i = 1; i < digits.length; i++) {
            ret[i] = digits[i-1];
        }

        return ret;
    }
}
