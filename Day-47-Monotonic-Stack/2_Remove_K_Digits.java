class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k)
            return "0";
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c : num.toCharArray()) {
            while (sb.length() > 0 && count < k && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                count++;
            }

            sb.append(c);
        }
        
        while (count < k) {
            sb.deleteCharAt(sb.length() - 1);
            count++;
        }
        while (sb.length() != 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if (sb.length() == 0)
            return "0";
        return sb.toString();
    }
}
