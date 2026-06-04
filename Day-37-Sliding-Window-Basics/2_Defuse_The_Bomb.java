class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int num=Math.abs(k);
        int n=code.length;
        int[] ans=new int[n];
        int start=0;
        if(k==0)return ans;
        else if(k<0){
            start=num;
        }
        else{
            start=n-1;
        }

        int i=0;
        int j=0;
        int sum=0;

        while(i<n){
            sum+=code[j%n];
            if(j-i+1<num)j++;
            else if(j-i+1==num){
                ans[start%n]=sum;
                sum-=code[i];
                i++;
                j++;
                start++;
            }
        }
        return ans;
        
        
    }
}
