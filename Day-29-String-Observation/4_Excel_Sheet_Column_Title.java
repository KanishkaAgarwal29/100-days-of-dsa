class Solution {
    public String convertToTitle(int columnNumber) {
        int col = columnNumber;
        int rem = 0;
        StringBuilder sb = new StringBuilder();

        while(col > 0){
            col--;
            rem = col % 26;
            
            char c = (char)('A' + (rem));
            sb.append(c);
            
            col = col/26;
        }

        return sb.reverse().toString();

    }
}
