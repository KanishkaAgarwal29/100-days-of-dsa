class ProductOfNumbers {
    ArrayList<Integer> pref;

    public ProductOfNumbers() {
        pref = new ArrayList<>();
        pref.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            pref = new ArrayList<>();
            pref.add(1);
        }
        else{
            pref.add(pref.get(pref.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        if(k > pref.size() - 1) return 0;
        return pref.get(pref.size() - 1) / pref.get(pref.size() - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
