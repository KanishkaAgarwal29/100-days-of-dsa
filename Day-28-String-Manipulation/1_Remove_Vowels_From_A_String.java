// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        String vowel = "aeiou";
        for(char c : s.toCharArray()){
            if(!vowel.contains("" + c)){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
