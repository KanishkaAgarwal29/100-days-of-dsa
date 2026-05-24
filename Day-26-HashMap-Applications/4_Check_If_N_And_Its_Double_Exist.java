class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> mpp = new HashSet<>();
        for (int a : arr) {
            if (mpp.contains(a * 2) || (a % 2 == 0 && mpp.contains(a / 2))) {
                return true;
            }
            mpp.add(a);
        }
        return false;
    }
}
