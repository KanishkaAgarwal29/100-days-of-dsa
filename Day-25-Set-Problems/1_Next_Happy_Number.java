// User function Template for Java

class Solution {

    static int nextHappy(int N) {
        // code here
        int i = N + 1;
        while(true){
            int n = i;
            HashSet<Integer> set = new HashSet<>();
            while (n > 1) {
                if (set.contains(n))
                    break;
                set.add(n);
                int sum = 0;
                while (n > 0) {
                    sum += (n % 10) * (n % 10);
                    n = n / 10;
                }
                n = sum;
            }
    
            if (n == 1)
                break;
            i++;
            
        }
        return i;
        
    }
}
