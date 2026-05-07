class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>()); 
        ans.add(new ArrayList<>()); 

        for(int a : set1){
            if(!set2.contains(a))ans.get(0).add(a);
        }
        for(int a : set2){
            if(!set1.contains(a))ans.get(1).add(a);
        }
        return ans;
    }
}
