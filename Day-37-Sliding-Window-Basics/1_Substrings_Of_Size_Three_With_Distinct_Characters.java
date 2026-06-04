class Solution {
    public int countGoodSubstrings(String s) {
        int i=0,j=0;
        int[] freq=new int[26];
        int count=0;
        while(j<s.length()){
            char c=s.charAt(j);
            freq[c-'a']++;
            if(freq[c-'a']==2){
                while(freq[c-'a']==2){
                    char ch=s.charAt(i);
                    freq[ch-'a']--;
                    i++;
                }
                j++;
            }
            else if(j-i+1<3){j++;}
            else if(j-i+1==3){
                count++;
                char ch=s.charAt(i);
                freq[ch-'a']--;
                i++;
                j++;
            }
        }
        return count;
    }
}
