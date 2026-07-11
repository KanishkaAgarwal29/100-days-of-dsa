class SeatManager {
    PriorityQueue<Integer> unreserved;
    int seat;

    public SeatManager(int n) {
        unreserved = new PriorityQueue<>();
        seat = 1;
    }

    public int reserve() {
        if (!unreserved.isEmpty()) {
            return unreserved.poll();
        }
        return seat++;
    }

    public void unreserve(int seatNumber) {
        unreserved.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
