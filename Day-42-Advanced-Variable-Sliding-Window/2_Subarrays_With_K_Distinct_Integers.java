// User function Template for Java

class Solution {
	static int atMost(int[] arr, int k) {
		HashMap<Integer, Integer> mpp = new HashMap<>();
		int j = 0;
		int count = 0;
		
		for (int i = 0 ; i < arr.length; i++) {
			mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
			while (mpp.size() > k) {
				mpp.put(arr[j], mpp.get(arr[j]) - 1);
				if(mpp.get(arr[j]) == 0) {
					mpp.remove(arr[j]);
					
				}
				j++;
			}
			
			count += i - j + 1;
		}
		
		return count;
	}
	static int exactlyK(int arr[], int k) {
		// code here
		return atMost(arr, k) - atMost(arr, k - 1);
	}
}
