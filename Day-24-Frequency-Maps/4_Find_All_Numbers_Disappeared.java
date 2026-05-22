class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq= new int[nums.length + 1];

        for(int a : nums){
            freq[a]++;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i < nums.length + 1; i++){
            if(freq[i] == 0){
                ans.add(i);
            }
        }

        return ans;
    }
}
