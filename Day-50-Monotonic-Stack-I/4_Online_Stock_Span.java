class StockSpanner {
    Deque<Integer> st;
    ArrayList<Integer> li;

    public StockSpanner() {
        st = new ArrayDeque<>();
        li = new ArrayList<>();
    }
    
    public int next(int price) {
        li.add(price);
        int n = li.size();

        while(!st.isEmpty() && price >= li.get(st.peek())){
            st.pop();
        }
        int ans = n;

        if(!st.isEmpty()){
            ans = ans - st.peek() - 1;
        }

        st.push(n-1);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
