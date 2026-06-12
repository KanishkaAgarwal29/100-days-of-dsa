class Solution {
    public int minSwaps(String s) {
        int mini = Integer.MAX_VALUE;
        int sum = 0;

        for(char c : s.toCharArray()){
            if(c == '[')sum++;
            else sum--;

            mini = Math.min(mini, sum);
        }

        return (-mini + 1) / 2;
    }
}
