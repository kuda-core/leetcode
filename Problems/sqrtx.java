class Solution {
    public int mySqrt(int x) {
        int odd = 1;
        int count = 0;
        //https://www.cuemath.com/algebra/squares-and-square-roots/
        while(x - odd >= 0) {
            x -= odd;
            odd += 2;
            count++;
        }
        return count;
    }
}
