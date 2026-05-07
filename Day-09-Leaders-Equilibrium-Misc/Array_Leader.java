class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length; 
        ans.add(arr[n-1]);
        for(int i = n-2; i >= 0; i--){
            if(arr[i]>=ans.get(ans.size() - 1)){
                ans.add(arr[i]);
            }
        }
        
        int start = 0;
        int end = ans.size() - 1;
         while(start <= end){
             int temp = ans.get(start);
             ans.set(start, ans.get(end));
             ans.set(end, temp);
             start++;
             end--;
         }
         
         return ans;
    }
}
