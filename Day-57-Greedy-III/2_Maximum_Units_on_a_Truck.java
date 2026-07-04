class Solution {
    public int maximumUnits(int[][] box, int truckSize) {
        Arrays.sort(box, (a, b) -> Integer.compare(b[1], a[1]));
        int units = 0;

        for (int i = 0; i < box.length; i++) {
            int take = Math.min(box[i][0], truckSize);
            
            units += (take * box[i][1]);
            truckSize -= take;

            if (truckSize == 0)
                break;
        }

        return units;
    }
}
