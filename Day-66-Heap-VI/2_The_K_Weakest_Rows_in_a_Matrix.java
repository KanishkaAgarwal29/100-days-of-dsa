class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }

            return Integer.compare(b[0], a[0]);
        });

        int[] ans = new int[k];

        for (int i = 0; i < n; i++) {
            int count = countSoldiers(mat[i]);
            pq.offer(new int[] { count, i });
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.poll()[1];
        }
        return ans;
    }

    public int countSoldiers(int[] row) {
        int low = 0;
        int high = row.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == 1) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
