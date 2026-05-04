class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int pref = 0;
        int len = 0;
        
        for(int i = 0; i < arr.length; i++){
            pref+=arr[i];
            
            if(pref == k){
                len = Math.max(len, i+1);
            }
            
            if(mpp.containsKey(pref - k)){
                len = Math.max(len, i - mpp.get(pref - k));
            }
            if(!mpp.containsKey(pref)){
                mpp.put(pref, i);
            }
            
        }
        
        return len;
    }
}
