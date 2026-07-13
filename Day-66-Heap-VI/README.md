# 🚀 Day 66 – Heap VI

## Problems Solved

1. Find Subsequence of Length K With the Largest Sum
2. The K Weakest Rows in a Matrix
3. Minimum Number Game
4. Largest Number After Digit Swaps by Parity

---

## Approach

### 1. Find Subsequence of Length K With the Largest Sum

- Selected the `k` largest elements while preserving their original order.
- Used heap to identify the required elements.
- Constructed the final subsequence by maintaining the original indices.

---

### 2. The K Weakest Rows in a Matrix

- Counted the number of soldiers in each row.
- Stored `(soldierCount, rowIndex)` pairs.
- Retrieved the weakest rows based on soldier count and row index.

---

### 3. Minimum Number Game

- Sorted the array in ascending order.
- Picked numbers in pairs.
- Swapped each adjacent pair while constructing the answer.

---

### 4. Largest Number After Digit Swaps by Parity

- Separated even and odd digits.
- Sorted both groups independently.
- Rebuilt the number by placing the largest available digit of the same parity at each position.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Find Subsequence of Length K With the Largest Sum | O(n log n) | O(n) |
| The K Weakest Rows in a Matrix | O(m × n + m log m) | O(m) |
| Minimum Number Game | O(n log n) | O(n) |
| Largest Number After Digit Swaps by Parity | O(d log d) | O(d) |

---

## Key Learning

Today's problems focused on identifying the right candidates using sorting and heaps rather than complex algorithms. Many interview questions become much simpler once the elements are prioritized correctly before reconstruction.

---

## Patterns Practiced

- Heap
- Sorting
- Greedy
- Index Mapping
- Priority-Based Selection

---

## Takeaway

Not every interview problem requires an advanced data structure. Often, combining sorting or a heap with careful reconstruction leads to a clean and efficient solution.
