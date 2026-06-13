class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            switch (s) {
                case "+":
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a + b);
                    break;

                case "-":
                    a = st.pop();
                    b = st.pop();
                    st.push(b - a);
                    break;

                case "*":
                    a = st.pop();
                    b = st.pop();
                    st.push(b * a);
                    break;

                case "/":
                    a = st.pop();
                    b = st.pop();
                    st.push(b / a);
                    break;

                default:
                    int num = Integer.parseInt(s);
                    st.push(num);
            }
        }
        return st.pop();
    }
}
