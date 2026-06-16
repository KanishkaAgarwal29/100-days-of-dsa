class Solution {

    public int countStudents(int[] students, int[] sw) {
        Queue<Integer> q = new ArrayDeque<>();
        int c = 0;
        int i = 0;
        for (int j = 0; j < students.length; j++) {
            q.offer(students[j]);
        }
        while (!q.isEmpty() && c < q.size()) {
            if (sw[i] == q.peek()) {
                c = 0;
                q.poll();
                i++;
            } else {
                c++;
                q.offer(q.poll());
            }
        }
        return q.size();
    }
}
