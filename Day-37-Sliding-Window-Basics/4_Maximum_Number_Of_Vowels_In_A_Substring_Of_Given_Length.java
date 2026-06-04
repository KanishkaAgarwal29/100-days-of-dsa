class Solution {
    public boolean checkVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int i=0,j=0;
        int max=0;
        int count=0;
        while(j<s.length()){
            char c=s.charAt(j);
            if(checkVowel(c)){
                count++;
            }
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                max=Math.max(max,count);
                char ch=s.charAt(i);
                if(checkVowel(ch)){
                    count--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
}
