class Solution {
    public int balancedStringSplit(String s) {
        int i = 0;
        int j = s.length() - 1;
        int[] freq = new int[2];
        int count = 0;
        
        for(char c : s.toCharArray()){
            if(c == 'L'){
                freq[0]++;
            }
            else{
                freq[1]++;
            }
            if(freq[0] == freq[1]){
                count++;
                freq[0]=0;
                freq[1]=0;
            }
        }
        return count; 
    }
}
