class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>> mpp = new HashMap<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        
        for(String s : arr){
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }
            
            StringBuilder s1 = new StringBuilder();
            
            for(int i = 0; i < 26; i++){
                s1.append("#");
                s1.append(freq[i]+"");
                
            }
            
            String s2 = s1.toString();
            if(mpp.containsKey(s2)){
                mpp.get(s2).add(s);
            }
            else{
                mpp.put(s2, new ArrayList<>());
                mpp.get(s2).add(s);
            }
        }
        
        for(String s : mpp.keySet()){
            ans.add(mpp.get(s));
        }
        
        return ans;
    }
}
