class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
                row.add(1);
                ans.add(row);
                continue;
            }

            row.add(1);
            for (int j = 1; j < ans.get(i - 1).size(); j++) {
                row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }
            row.add(1);
            ans.add(row);
        }

        return ans;
    }
}
