class Solution {
    public boolean checkChar(char c){
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if(s.length() == 1)return true;

        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if(checkChar(c1) && checkChar(c2)){
                if(c1 == c2){
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
            else if(checkChar(c1) && !checkChar(c2)){
                j--;
            }
            else if(!checkChar(c1) && checkChar(c2)){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
