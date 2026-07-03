class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int count = 0;
        int len = fb.length;
        int i = 0;

        while(i <  len){
            if(fb[i]!= 1 && (i == 0 || fb[i-1] != 1) && (i == len - 1 || fb[i+1] != 1)){
                count++;
                i+=2;
            }
            else{
                i++;
            }
        }

        return count >= n;
    }
}
