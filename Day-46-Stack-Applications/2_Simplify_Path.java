class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (s.equals("") || s.equals(".")) {
                continue;
            } else {
                st.push(s);
            }
        }

        if (st.isEmpty())
            return "/";
        int i = 0;

        for (String dir : st) {
            sb.append("/").append(dir);
        }

        return sb.toString();
    }
}
