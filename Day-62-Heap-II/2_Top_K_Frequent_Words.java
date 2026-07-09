class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> mpp = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int fa = mpp.get(a);
            int fb = mpp.get(b);

            if (fa == fb)
                return b.compareTo(a);

            return Integer.compare(fa, fb);
        });

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            mpp.put(word, mpp.getOrDefault(word, 0) + 1);
        }

        for (String word : mpp.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }
        Collections.reverse(ans);

        return ans;
    }
}
