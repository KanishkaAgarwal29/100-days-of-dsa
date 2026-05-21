class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mpp = new HashSet<>();

        for(int a : nums){
            if(mpp.contains(a))return true;
            mpp.add(a);
        }

        return false;
    }
}
