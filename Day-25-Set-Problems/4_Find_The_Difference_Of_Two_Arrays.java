class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for(int a : nums1) set1.add(a);
        for(int a : nums2) set2.add(a);
        
        for(int a : set1){
            if(!set2.contains(a)){
                ans.get(0).add(a);
            }
        }
        for(int a : set2){
            if(!set1.contains(a)){
                ans.get(1).add(a);
            }
        }
        return ans;
    }
}
