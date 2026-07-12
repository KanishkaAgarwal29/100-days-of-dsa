# 🚀 Day 65 – Heap V

## Problems Solved

1. Maximum Number of Events That Can Be Attended
2. Minimum Operations to Exceed Threshold Value II
3. Hand of Straights
4. Smallest Number in Infinite Set

---

## Approach

### 1. Maximum Number of Events That Can Be Attended

- Sorted events by their starting day.
- Used a min heap to store ending days of currently available events.
- Removed expired events and always attended the event finishing earliest to maximize the total count.

---

### 2. Minimum Operations to Exceed Threshold Value II

- Stored all numbers in a min heap.
- Repeatedly combined the two smallest values using the given operation.
- Inserted the newly formed value back into the heap until every element satisfied the threshold.

---

### 3. Hand of Straights

- Counted the frequency of each card using a hash map.
- Processed cards in sorted order.
- Started a new consecutive group whenever an unused card was encountered and verified that all required consecutive values existed.

---

### 4. Smallest Number in Infinite Set

- Maintained the next smallest unused integer using a counter.
- Used a min heap to store numbers added back into the set.
- Prevented duplicate insertions with a hash set.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Maximum Number of Events That Can Be Attended | O(n log n) | O(n) |
| Minimum Operations to Exceed Threshold Value II | O(n log n) | O(n) |
| Hand of Straights | O(n log n) | O(n) |
| Smallest Number in Infinite Set | O(log n) per operation | O(n) |

---

## Key Learning

Today's problems highlighted how heaps can efficiently support scheduling, repeated optimization, and dynamic data structure design. Combining heaps with sorting, hash maps, and simple state tracking made each solution both efficient and intuitive.

---

## Patterns Practiced

- Sorting + Min Heap
- Heap Simulation
- Greedy + HashMap
- Heap Design

---

## Takeaway

Heaps are not limited to finding minimum or maximum values—they are powerful tools for maintaining dynamic priorities. Identifying what should stay at the top of the heap is often the key to designing an optimal solution.
