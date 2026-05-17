class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr , (row1, row2) -> Integer.compare(row1[0], row2[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int[] ans = new int[2];
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || ans[1] < arr[i][0]){
                if(i!=0){
                    res.add(new int[]{ans[0], ans[1]});
                }
                ans[0] = arr[i][0];
                ans[1] = arr[i][1];
            }
            else{
                ans[1] = Math.max(ans[1], arr[i][1]);
            }
        }
        res.add(new int[]{ans[0], ans[1]});
        return res;
    }
}
