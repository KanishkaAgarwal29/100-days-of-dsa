class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        int[] mpp1 = new int[256];
        int[] mpp2 = new int[256];

        for(int i = 0; i < s1.length(); i++){
            char cs = s1.charAt(i);
            char ct = s2.charAt(i);

            if(mpp1[cs] != mpp2[ct])return false;
            mpp1[cs] = i + 1;
            mpp2[ct] = i + 1;
        }
        return true;
    }
}
