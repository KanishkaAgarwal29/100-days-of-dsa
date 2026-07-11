# 🚀 Day 64 – Heap IV

## Problems Solved

1. Find Median from Data Stream
2. Relative Ranks
3. Minimum Operations to Halve Array Sum
4. Seat Reservation Manager

---

## Approach

### 1. Find Median from Data Stream

- Maintained two heaps:
  - A max heap for the smaller half of the numbers.
  - A min heap for the larger half.
- Balanced both heaps after every insertion.
- Computed the median using the top elements of the heaps.

---

### 2. Relative Ranks

- Stored each athlete's score along with its original index.
- Processed scores in descending order.
- Assigned medals to the top three athletes and numerical ranks to the remaining participants.

---

### 3. Minimum Operations to Halve Array Sum

- Calculated the initial array sum.
- Used a max heap to repeatedly select the largest value.
- Halved the selected value, updated the remaining sum, and pushed it back into the heap.
- Continued until the array sum was reduced by at least half.

---

### 4. Seat Reservation Manager

- Maintained available seat numbers in a min heap.
- Reserved the smallest available seat whenever requested.
- Added seats back into the heap after unreservation to make them available again.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Find Median from Data Stream | O(log n) per insertion | O(n) |
| Relative Ranks | O(n log n) | O(n) |
| Minimum Operations to Halve Array Sum | O((n + k) log n) | O(n) |
| Seat Reservation Manager | O(log n) per operation | O(n) |

---

## Key Learning

Today's problems highlighted different applications of heaps beyond simple maximum and minimum queries. Two heaps efficiently maintained a running median, max heaps supported repeated optimization, and min heaps enabled dynamic resource allocation in design-based problems.

---

## Patterns Practiced

- Two Heaps
- Max Heap
- Min Heap
- Heap Design
- Heap Simulation

---

## Takeaway

Heap problems often revolve around maintaining an invariant efficiently. Whether balancing two halves of a dataset or always selecting the most important element, the heap keeps updates and queries fast without repeatedly sorting the data.
