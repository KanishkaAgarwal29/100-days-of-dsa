class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int start = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                start++;
            }
            else{
                if(start>0){
                    start--;
                }
                else{
                    count++;
                }
            }
        }

        count+=start;
        return count;
    }
}
