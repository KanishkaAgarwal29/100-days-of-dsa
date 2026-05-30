class Solution {
    public int numSubseq(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int MOD = 1000000007;

        int[] pow = new int[n];
        pow[0] = 1;

        for (int k = 1; k < n; k++) {
            pow[k] = (pow[k - 1] * 2) % MOD;
        }

        while(i<=j){
            while( i <= j && nums[i]+nums[j] > target) j--;
            if(i > j)break;
            count = (count + pow[j - i]) % MOD;
            i++;
        }

        return count;
    }
}
