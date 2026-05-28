// User function Template for Java

class Solution {
    public boolean check(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))return true;
        return false;
    }
    
    public String reverse(String str) {
        // complete the function here
        
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        
        while(i < j){
            if(check(ch[i]) && check(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            if(!check(ch[i])){
                i++;
            }
            if(!check(ch[j])){
                j--;
            }
        }
        
        return new String(ch);
    }
}
