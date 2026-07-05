class Solution {
    public int minSetSize(int[] arr) {
        int[] ans = new int[100001];
        for(int a : arr){
            ans[a]++;
        } 

        Arrays.sort(ans);

        int i = ans.length - 1;
        int size = 0;
        while(size < arr.length/2){
            size+=ans[i];
            i--;
        }

        return ans.length - 1 - i;
    }
}
