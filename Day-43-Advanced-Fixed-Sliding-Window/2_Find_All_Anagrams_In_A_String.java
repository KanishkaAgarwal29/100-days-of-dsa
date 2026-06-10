class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        int[] pfreq = new int[26];
        int[] sfreq = new int[26];

        for(char c : p.toCharArray()){
            pfreq[c - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            sfreq[c - 'a']++;
            while(sfreq[c - 'a'] > pfreq[c - 'a']){
                char ch = s.charAt(j);
                sfreq[ch - 'a']--;
                j++;
            }

            if(i - j + 1 == k){
                ans.add(j);
                sfreq[s.charAt(j) - 'a']--;
                j++;
            }
        }
        return ans;
    }
}
