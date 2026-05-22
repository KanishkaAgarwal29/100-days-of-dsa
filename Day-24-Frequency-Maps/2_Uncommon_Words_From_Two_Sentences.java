class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        HashMap<String, Integer> hset1 = new HashMap<>();
        HashMap<String, Integer> hset2 = new HashMap<>();
        for (String s : str1) {
            hset1.put(s, hset1.getOrDefault(s, 0) + 1);
            
        }
        for (String s : str2) {
            hset2.put(s, hset2.getOrDefault(s, 0) + 1);
        }

        
        ArrayList<String> str = new ArrayList<>();

        int i = 0;
        for (String a : hset2.keySet()) {
            if((!hset1.containsKey(a)) && hset2.get(a) == 1)str.add(a);
        }
        for (String a : hset1.keySet()) {
            if((!hset2.containsKey(a)) && hset1.get(a) == 1)str.add(a);
        }

        String[] ans = new String[str.size()];

        for(String a : str){
            ans[i] = a;
            i++;
        }

        return ans;
    }
}
