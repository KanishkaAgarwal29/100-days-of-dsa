class Solution {
	int maxLength(int arr[]) {
		// code here
		HashMap<Integer, Integer> mpp = new HashMap<>();
		int sum = 0;
		int len = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if (sum == 0) {
				len = Math.max(len, i + 1);
			}
			
			if (mpp.containsKey(sum)) {
				len = Math.max(len, i - mpp.get(sum));
			}
			else {
				mpp.put(sum, i);
			}
		}
		
		return len;
	}
}
