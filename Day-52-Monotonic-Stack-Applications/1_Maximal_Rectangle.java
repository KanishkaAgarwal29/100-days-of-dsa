class Solution {
	static int maxArea(int mat[][]) {
		// code here
		int n = mat.length;
		int m = mat[0].length;
		int[] rect = new int[m];
		int maxArea = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
			    if(mat[i][j] == 0){
			        rect[j] = 0;
			    }
			    else{
			        rect[j] += 1;
			    }
				
			}
			maxArea = Math.max(maxArea, area(rect));
		}
		
		return maxArea;
	}
	
	static int area(int[] rect) {
		int n = rect.length;
		
		Deque<Integer> st = new ArrayDeque<>();
		int[] ps = new int[n];
		int[] ns = new int[n];
		int maxArea = 0;
		
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && rect[st.peek()] >= rect[i]) {
				st.pop();
			}
			
			if (st.isEmpty()) {
				ps[i] = -1;
			}
			else {
				ps[i] = st.peek();
			}
			st.push(i);
		}
		
		st.clear();
		
		for (int i = n - 1; i >= 0; i--) {
			while (!st.isEmpty() && rect[st.peek()] >= rect[i]) {
				st.pop();
			}
			
			if (st.isEmpty()) {
				ns[i] = n;
			}
			else {
				ns[i] = st.peek();
			}
			st.push(i);
		}
		
		for (int i = 0; i < n; i++) {
			int width = ns[i] - ps[i] - 1;
			maxArea = Math.max(maxArea, width * rect[i]);
		}
		
		return maxArea;
	}
}
