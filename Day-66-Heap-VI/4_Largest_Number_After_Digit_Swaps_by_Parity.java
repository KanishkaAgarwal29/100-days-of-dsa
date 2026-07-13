class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());

        char[] arr = String.valueOf(num).toCharArray();

        for (char ch : arr) {
            int digit = ch - '0';

            if (digit % 2 == 0) {
                even.offer(digit);
            } else {
                odd.offer(digit);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : arr) {
            int digit = ch - '0';

            if (digit % 2 == 0) {
                sb.append(even.poll());
            } else {
                sb.append(odd.poll());
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
