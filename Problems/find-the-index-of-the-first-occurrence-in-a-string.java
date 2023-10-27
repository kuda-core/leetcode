class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                if(check(haystack, needle, i) == true)
                    return i;
            }
        }
        return -1;
    }
    public boolean check(String haystack, String needle, int index) {
        int count = 0;
        for(int i = 0; i + index < haystack.length() && i < needle.length(); i++) {
            if(haystack.charAt(i + index) == needle.charAt(i)) {
                count++;
                if(count == needle.length())
                    return true;
            }
        }
        return false;
    }
}
