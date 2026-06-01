class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];
        List<Integer> ans = new ArrayList<>();
        
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < s.length(); i++){
            end = Math.max(end, freq[s.charAt(i) - 'a']);
            if(end == i){
                ans.add(i - start + 1);
                start = i + 1;
            }
        }
        return ans;
    }
}
