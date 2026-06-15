class Solution {
    public void reverse(char[] ch , int i,  int j){
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseParentheses(String s) {
        char[] ch = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == '('){
                st.push(i);
            }
            else if(ch[i] == ')'){
                reverse(ch, st.pop() + 1,i - 1);
            }
        }
        
        for(char c : ch){
            if(c != '(' && c!= ')'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
