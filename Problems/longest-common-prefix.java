class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = strs[0];
        for(String s: strs) {
            if(s.length() < 1)
                return "";
            
            for(int i = 0; i < s.length() && i < ret.length(); i ++) {
                char c = s.charAt(i);
                if(c != ret.charAt(i)) {
                    ret = s.substring(0,i);
                } else if(i + 1 == s.length()) {
                    if(i + 1 < ret.length())
                        ret = s.substring(0,s.length());
                } else if (i + 1 == ret.length()) {
                    if(i + 1 < s.length())
                        ret = ret.substring(0, ret.length());
                } else {
                    continue;
                }
            }
        }
        return ret;
    }
}
