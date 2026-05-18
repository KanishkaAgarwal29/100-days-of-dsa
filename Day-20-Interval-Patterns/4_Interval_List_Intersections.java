class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
        int i = 0;
        int j = 0;

        ArrayList<int[]> ans = new ArrayList<>();

        while(i < fl.length && j < sl.length){
            if(fl[i][1] < sl[j][0]){
                i++;
            }
            else if(fl[i][0] > sl[j][1]){
                j++;
            }
            else{
                int start = Math.max(fl[i][0],sl[j][0]);
                int end = Math.min(fl[i][1],sl[j][1]);
                ans.add(new int[]{start, end});

                if(fl[i][1] < sl[j][1]){
                    i++;
                }
                else if(sl[j][1] < fl[i][1]){
                    j++;
                }
                else{
                    i++;
                    j++;
                }
            }
        }


        return ans.toArray(new int[ans.size()][]);
    }
}
