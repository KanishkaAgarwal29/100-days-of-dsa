import java.util.* ;
import java.io.*; 
/*
    You can access the dimension function and the get function by calling Runner.dimension()
     and Runner.get(int x, int y) respectively.

 */
public class Solution {
        public static int leftmostColumn() {
        // Write your code here
        ArrayList<Integer> size = Runner.dimensions();
        int i = 0;
        int j = size.get(1) - 1;
        
        int ans = -1;

        while (i < size.get(0) && j >= 0) {

            if (Runner.get(i,j) == 1) {
                ans = j;
                j--;
            } else {
                i++;
            }
        }

        return ans;
    }
}
