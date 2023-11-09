class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        String temp = "";
        while(i <= j) {
            if(Character.isLetterOrDigit(s.charAt(i)))
                temp += s.charAt(i);
            else
                ;//do not add
                //
            i++;
        }
        temp = temp.toLowerCase();
        System.out.println(temp);
        i = 0;
        j = temp.length() - 1;
        while(i <= j) {
            if(temp.charAt(i) == temp.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        

        return true;
    }
}
