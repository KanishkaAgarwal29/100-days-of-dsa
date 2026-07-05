class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean ele1 = false;
        boolean ele2 = false;
        boolean ele3 = false;

        for(int[] triplet : triplets){
            if(triplet[0] > target[0] || triplet[1] > target[1] || triplet[2] > target[2]) continue;

            ele1 |= triplet[0] == target[0];
            ele2 |= triplet[1] == target[1];
            ele3 |= triplet[2] == target[2];

            if (ele1 && ele2 && ele3)
                return true;  
        }

        return ele1 && ele2 && ele3;
    }
}
