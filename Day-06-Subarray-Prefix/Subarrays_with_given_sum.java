class Solution {
    public static int subArraySum(int[] arr, int k) {
        HashMap<Integer,Integer> mpp= new HashMap<>();
        int count=0;
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==k){
                count++;
            }
            int rem=prefix-k;
            if(mpp.containsKey(rem)){
                count+=mpp.get(rem);
            }
            mpp.put(prefix,mpp.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
