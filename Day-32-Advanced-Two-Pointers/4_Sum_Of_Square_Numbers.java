class Solution {
    public boolean judgeSquareSum(int ch) {
        long a = 0;
        long b = (long)Math.sqrt(ch);
        long c = ch;

        while(a <= b){
            if(a*a + b*b == ch)return true;
            else if(a*a + b*b < ch)a++;
            else b--;
        }

        return false;
    }
}
