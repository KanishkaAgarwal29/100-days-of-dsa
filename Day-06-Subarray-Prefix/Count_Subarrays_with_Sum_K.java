class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int count=0;
        int prefix=0;
        HashMap<Integer,Integer> mpp=new HashMap<>();

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
