class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        if(n == 0)return new int[][]{newInterval};

        int[]ans = new int[2];
        int i = 0;
        ArrayList<int[]> li = new ArrayList<>();
        boolean inserted = false;

        while(i < n){
            if(inserted == false && newInterval[1]<intervals[i][0]){
                li.add(new int[]{newInterval[0], newInterval[1]});
                inserted  = true;
            }

            if(inserted == true || (intervals[i][1] < newInterval[0] || intervals[i][0] > newInterval[1])){
                li.add(new int[]{intervals[i][0], intervals[i][1]});
                i++;
            }
            else{
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                
                while(i < n && intervals[i][0] <= newInterval[1]){
                    newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
                    i++;
                    
                }
                li.add(new int[]{newInterval[0], newInterval[1]});
                inserted  = true;
            }
        }
        if(intervals[n-1][1] < newInterval[0]){
            li.add(new int[]{newInterval[0], newInterval[1]});
        }

        int[][] res = new int[li.size()][2];
        i = 0;
        
        for(int[] a : li){
            res[i] = a;
            i++;
        }

        return res;
    }
}
