class Solution {
    public int leastInterval(char[] tasks, int n) {
        int totalTasks = tasks.length;
        int[] freq = new int[26];
        int max = 0;
        int count = 1;

        for(char c : tasks){
            freq[c - 'A']++;
            if(max == freq[c - 'A']){
                count++;
            }
            else if (max < freq[c - 'A']){
                max = freq[c - 'A'];
                count = 1;
            }
        }

        return Math.max(totalTasks, (max - 1) * (n + 1) + count);
    }
}
