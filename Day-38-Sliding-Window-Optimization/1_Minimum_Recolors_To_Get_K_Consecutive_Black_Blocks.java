class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whitecount = 0;
        int minWhite = k;
        int j = 0;

        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W')
                whitecount++;
            if (i - j + 1 == k) {
                minWhite = Math.min(minWhite, whitecount);
                if(minWhite == 0)return 0;
                if (blocks.charAt(j) == 'W')
                    whitecount--;
                j++;
            }
        }
        return minWhite;
    }
}
