# 🚀 Day 63 – Heap III

## Problems Solved

1. Reorganize String
2. Kth Smallest Element in a Sorted Matrix
3. Total Cost to Hire K Workers
4. Maximal Score After Applying K Operations

---

## Approach

### 1. Reorganize String

- Counted character frequencies.
- Used a max heap to always select the most frequent available character.
- Ensured adjacent characters were never the same by temporarily holding the previously used character.

---

### 2. Kth Smallest Element in a Sorted Matrix

- Inserted the first element of each row into a min heap.
- Repeatedly removed the smallest element.
- Added the next element from the same row until the kth smallest element was reached.

---

### 3. Total Cost to Hire K Workers

- Maintained candidates from both ends of the array using priority queues.
- At every step, selected the worker with the minimum hiring cost.
- Refilled the corresponding side after each selection.

---

### 4. Maximal Score After Applying K Operations

- Used a max heap to repeatedly choose the largest value.
- Added it to the answer.
- Reinserted the updated value after replacing it with `ceil(value / 3)`.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Reorganize String | O(n log k) | O(k) |
| Kth Smallest Element in a Sorted Matrix | O(k log n) | O(n) |
| Total Cost to Hire K Workers | O((n + k) log c) | O(c) |
| Maximal Score After Applying K Operations | O((n + k) log n) | O(n) |

---

## Key Learning

Today's problems demonstrated how heaps can manage priorities across different domains, including character frequencies, sorted matrices, hiring decisions, and repeated optimization. The core idea remained the same: always process the most relevant element while efficiently updating the remaining candidates.

---

## Patterns Practiced

- Max Heap
- Min Heap
- Heap + Greedy
- K-way Merge
- Two-Pointer + Heap

---

## Takeaway

Heap problems become much easier once the priority is identified. The challenge is rarely the implementation—it's recognizing which element should always be processed next.
