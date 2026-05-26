class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        int j = 0;

        for(int i = 0; i < str.length; i++){
            for(j = 0; j < str.length; j++){
                int n = str[j].length() - 1;
                if(str[j].charAt(n) - '1' == i)break;
            }
            String temp = str[j];
            str[j] = str[i];
            str[i] = temp.substring(0,temp.length() - 1);
        }

        return String.join(" ",str);
    }
}
