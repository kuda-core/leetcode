class Solution {
    public String addBinary(String a, String b) {
        int sum = 0;
        int carry = 0;
        String ret = "";
        int x = 0;
        int y = 0;
        char c = '_';
        for(int i = 0;; i++) {
            if(i < a.length() && i < b.length()) {
                x = a.charAt(a.length() - i - 1) - '0';
                y = b.charAt(b.length() - i - 1) - '0';
                sum = (x + y + carry) % 2;
                carry = (x + y + carry) / 2;
                ret = sum + ret;
            } else if(i < a.length()) {
                x = a.charAt(a.length() - i - 1) - '0';
                sum = (x +  carry) % 2;
                carry = (x  + carry) / 2;
                ret = sum + ret;
            } else if(i < b.length()) {
                y = b.charAt(b.length() - i - 1) - '0';
                sum = (y + carry) % 2;
                carry = (y + carry) / 2;
                ret = sum + ret;
            } else {
                break;
            }
        }
        if(carry > 0) {
            ret = "1" + ret;
        }
        return ret;
    }
    public void print(String s) {
        System.out.println(s);
    }
}
