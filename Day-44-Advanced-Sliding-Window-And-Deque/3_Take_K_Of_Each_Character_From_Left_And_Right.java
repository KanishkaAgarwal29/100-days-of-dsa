class Solution {
    public int takeCharacters(String s, int k) {
        int n  = s.length();
        int[] freq = new int[3];
        int[] freq2 = new int[3];
        int j = 0;
        int maxi = 0;

        for(char c : s.toCharArray()){
            if(c == 'a')freq[0]++;
            if(c == 'b')freq[1]++;
            if(c == 'c')freq[2]++;
        }

        if(freq[0] < k || freq[1] < k || freq[2] < k)return -1;
        freq[0]-=k;
        freq[1]-=k;
        freq[2]-=k;

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == 'a')freq2[0]++;
            else if(c == 'b')freq2[1]++;
            else if(c == 'c')freq2[2]++;

            while(freq2[0] > freq[0] || freq2[1] > freq[1] || freq2[2] > freq[2]){
                char ch = s.charAt(j);
                if(ch == 'a')freq2[0]--;
                else if(ch == 'b')freq2[1]--;
                else if(ch == 'c')freq2[2]--;
                j++;
            }

            maxi = Math.max(maxi, i - j +1);
        }

        return n - maxi;
    }
}
