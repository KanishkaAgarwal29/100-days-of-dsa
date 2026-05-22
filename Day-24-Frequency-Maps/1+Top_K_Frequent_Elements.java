class Solution {
    @SuppressWarnings("unchecked")
	public ArrayList<Integer> topKFreq(int[] arr, int k) {
		// Code here
		
		HashMap<Integer, Integer> mpp = new HashMap<>();
		List<Integer>[] li = new List[arr.length + 1];
		ArrayList<Integer> ans = new ArrayList<>();
		int c = 0;
		
		for (int a : arr) {
			mpp.put(a, mpp.getOrDefault(a, 0) + 1);
		}
		
		for (int a : mpp.keySet()) {
			if (li[mpp.get(a)] == null) {
				li[mpp.get(a)] = new ArrayList<>();
			}
			li[mpp.get(a)].add(a);
		}
		
		for (int i = li.length - 1; i >= 0 && c < k; i--) {
			if (li[i] != null) {
			    Collections.sort(li[i], Collections.reverseOrder());
				for (int a : li[i]) {
					ans.add(a);
					c++;
					if (c == k)break;
				}
			}
		}
		
		return ans;
	}
}
