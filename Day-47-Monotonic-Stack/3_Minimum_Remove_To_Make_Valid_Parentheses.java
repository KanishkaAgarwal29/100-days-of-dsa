class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(i);
            }
            else if (ch == ')') {

                if (!st.isEmpty() && s.charAt(st.peek()) == '(') {
                    st.pop();
                } else {
                    st.push(i);
                }
            }
        }

        if (st.isEmpty())
            return s;
        int i = 0;
        for (int idx : st) {
            sb.append(s.substring(i, idx));
            i = idx + 1;
        }

        if (i < s.length()) {
            sb.append(s.substring(i, s.length()));
        }
        return sb.toString();
    }
}
