class Solution {
    public boolean checkOnesSegment(String s) {
        char last = '1';
        for(char c : s.toCharArray()){
            if(last == '0' && c == '1'){
                return false;
            }
            last = c;
        }
        return true;
    }
}
