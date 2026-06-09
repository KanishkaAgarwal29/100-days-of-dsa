class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int[] freq = new int[26];
        int len = -1;
        int j = 0;
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            freq[c - 'a']++;
            if(freq[c - 'a'] == 1){
                count++;
            }
            
            while(count > k){
                char ch = s.charAt(j);
                freq[ch - 'a']--;
                if(freq[ch - 'a'] == 0){
                    count--;
                }
                j++;
            }
            
            if(count == k){
                len = Math.max(len, i-j+1);
            }
        }
        return len;
    }
}
