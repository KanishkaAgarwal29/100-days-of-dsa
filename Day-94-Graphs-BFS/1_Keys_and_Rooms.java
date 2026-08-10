class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);
        vis[0] = true;
        int count = 1;

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int room : rooms.get(curr)) {
                if (!vis[room]) {
                    q.offer(room);
                    vis[room] = true;
                    count++;
                }
            }
        }

        return count == n;
    }
}
