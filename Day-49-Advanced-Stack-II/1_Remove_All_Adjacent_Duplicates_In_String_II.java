class Pair {
    char c;
    int freq;

    Pair(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        if (n < k)
            return s;

        Stack<Pair> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (st.empty() || c != st.peek().c) {
                st.push(new Pair(c, 1));
                continue;
            }

            st.peek().freq++;
            if (st.peek().freq == k) {
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Pair p : st) {
            int i = p.freq;
            while (i-- != 0) {
                sb.append(p.c);
            }

        }

        return sb.toString();
    }
}
