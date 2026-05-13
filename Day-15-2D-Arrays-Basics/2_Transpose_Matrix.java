class Solution {
	public ArrayList<ArrayList<Integer>> transpose(int[][] matrix) {
		// code here
		int n = matrix.length;
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
		    
			ArrayList<Integer> li = new ArrayList<>();
			
			for (int j = 0; j < n; j++) {
				li.add(matrix[j][i]);
			}
			
			ans.add(li);
		}
		
		return ans;
	}
}
