class SmallestInfiniteSet {
    PriorityQueue<Integer> set;
    int smallest;
    HashSet<Integer> hs;

    public SmallestInfiniteSet() {
        set = new PriorityQueue<>();
        smallest = 1;
        hs = new HashSet<>();
    }
    
    public int popSmallest() {
        if (!set.isEmpty()) {
            int num = set.poll();
            hs.remove(num);
            return num;
        }
        return smallest++;
    }
    
    public void addBack(int num) {
        if (num < smallest && !hs.contains(num)) {
            hs.add(num);
            set.offer(num);
        } 
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
