class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int last_count = count;
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == ' ') {
                if(count != 0)
                    last_count = count;
                count = 0;
            } else {
                count++;
            }
        }
        if(count == 0)
            return last_count;
        return  count;
    }
}
