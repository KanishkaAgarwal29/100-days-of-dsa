class Solution {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int two = Integer.MIN_VALUE;

        for(int i = nums.length - 1; i >=0; i--){
            if(nums[i] < two)return true;
            while(!st.isEmpty() && st.peek() < nums[i]){
                two = st.pop();
            }
            
            st.push(nums[i]);
        }

        return false;
    }
}
