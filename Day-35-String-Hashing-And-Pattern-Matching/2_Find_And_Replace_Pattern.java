class Solution {
    public boolean check(String s1, String s2){
        if(s1.length() != s2.length())return false;
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for(int i = 0 ; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1[c1 - 'a'] != map2[c2 - 'a']) return false;
            map1[c1 - 'a'] = i + 1;
            map2[c2 - 'a'] = i + 1;
        }

        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for(String s : words){
            if(check(s , pattern)){
                ans.add(s);
            }
        }
        return ans;
    }
}
