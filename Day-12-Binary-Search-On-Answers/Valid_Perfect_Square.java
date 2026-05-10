class Solution {
    static int checkPerfectSquare(int N) {
        // code here
        if(N <= 1)return 1;
        int low  = 1;
        int high = N/2;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if( mid * mid == N)return 1;
            else if(mid > N / mid) high = mid - 1;
            else low = mid + 1;
        }
        
        return 0;
    }
}
