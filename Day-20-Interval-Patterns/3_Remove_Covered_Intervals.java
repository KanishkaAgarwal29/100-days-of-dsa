class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        if (arr.length <= 1) {
            return arr.length;
        }
        int count = arr.length;
        int idx = 0;

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

        for(int i = 1; i < arr.length; i++){
            if(arr[idx][1] >= arr[i][1]){
                count--;
            }
            else{
                idx = i;
            }
        }
        return count;
    }
}
