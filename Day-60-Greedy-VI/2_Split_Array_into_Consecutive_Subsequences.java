class Solution {
    public boolean isPossible(int[] nums) {

        HashMap<Integer, Integer> end = new HashMap<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        for (int x : nums) {

            if (!freq.containsKey(x))
                continue;

            decrease(freq, x);

            if (end.containsKey(x - 1)) {

                decrease(end, x - 1);
                end.put(x, end.getOrDefault(x, 0) + 1);

            } else {

                if (freq.containsKey(x + 1) && freq.containsKey(x + 2)) {

                    decrease(freq, x + 1);
                    decrease(freq, x + 2);

                    end.put(x + 2, end.getOrDefault(x + 2, 0) + 1);

                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private void decrease(HashMap<Integer, Integer> map, int x) {
        map.put(x, map.get(x) - 1);
        if (map.get(x) == 0)
            map.remove(x);
    }
}
