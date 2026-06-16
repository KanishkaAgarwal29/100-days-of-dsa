class Solution {
    public boolean evaluate(char c) {
        return c == 't';
    }

    public boolean parseBoolExpr(String exp) {
        Deque<Character> st = new ArrayDeque<>();
        int n = exp.length();

        for (int i = n - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (c == ',')
                continue;
            else if (st.isEmpty() || st.peek() != '(') {
                st.push(c);
            } else {
                st.pop();
                boolean ans = evaluate(st.pop());

                while (st.peek() != ')') {
                    char val = st.pop();

                    switch (c) {
                        case '&':
                            ans = ans && evaluate(val);
                            break;

                        case '|':
                            ans = ans || evaluate(val);
                            break;
                    }
                }
                if (c == '!') {
                    ans = !ans;
                }

                st.pop();
                st.push(ans ? 't' : 'f');
            }
        }

        return evaluate(st.pop());
    }
}
