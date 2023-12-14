class Solution {
    public String convertToTitle(int columnNumber) {
        //A + 1 (-1) = A
        char c = '_';
        String ret = "";
        while(columnNumber>0) {
            int remainder = (columnNumber - 1) % 26;
            ret += (char)('A' + remainder);
            columnNumber = (columnNumber - 1) / 26;
        }
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(ret);
 
        // reverse StringBuilder input1
        input1.reverse();

        return input1.toString();
    }
}
