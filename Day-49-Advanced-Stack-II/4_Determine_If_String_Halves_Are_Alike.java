class Solution {

    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        int c1=0;
        char c='a';
        while(i<j){
            c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                c1++;
            }
            c=s.charAt(j);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                c1--;
            }
            i++;
            j--;
        }
        if(c1==0){
            return true;
        }
        return false;
    }
}
