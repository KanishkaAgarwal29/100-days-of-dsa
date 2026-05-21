class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int min = -1;

        for(int i = 0; i < arr.length; i++){
            if(mpp.containsKey(arr[i])){
                if(min == -1){
                    min = mpp.get(arr[i]) + 1;
                }
                else{
                    min = Math.min(min, mpp.get(arr[i]) + 1);
                }
                
            }
            else{
                mpp.put(arr[i],i);
            }
            
        }
        return min;
    }
}
