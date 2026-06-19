# 🚀 Day 52 – Monotonic Stack Applications

## Problems Solved

1. Maximal Rectangle
2. Remove Duplicate Letters
3. Smallest Subsequence of Distinct Characters
4. Trapping Rain Water

---

## Approach

### 1. Maximal Rectangle

- Treated every row of the binary matrix as a histogram.
- Updated histogram heights row by row.
- Applied the Largest Rectangle in Histogram algorithm on each row.
- Tracked the maximum area across all rows.

---

### 2. Remove Duplicate Letters

- Used a monotonic stack along with frequency counting and visited array.
- Removed larger characters only if they appeared later in the string.
- Constructed the lexicographically smallest string containing every character exactly once.

---

### 3. Smallest Subsequence of Distinct Characters

- Followed the same greedy monotonic stack approach.
- Maintained only useful characters while ensuring uniqueness.
- Built the smallest possible subsequence preserving relative order.

---

### 4. Trapping Rain Water

- Used a monotonic decreasing stack to identify valleys.
- Whenever a higher bar appeared, calculated trapped water using:
  - Left Boundary
  - Right Boundary
  - Bottom Height
- Accumulated trapped water for every valid valley.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Maximal Rectangle | O(m × n) | O(n) |
| Remove Duplicate Letters | O(n) | O(n) |
| Smallest Subsequence of Distinct Characters | O(n) | O(n) |
| Trapping Rain Water | O(n) | O(n) |

---

## Key Learning

Today's focus was understanding how the Monotonic Stack pattern extends beyond Next Greater/Smaller Element problems. By maintaining the correct invariant, the same pattern can solve histogram problems, greedy lexicographical optimization, and even interval-based water trapping efficiently.

---

## Patterns Practiced

- Monotonic Increasing Stack
- Monotonic Decreasing Stack
- Greedy + Stack
- Histogram Transformation
- Boundary Detection
- Interval Computation

---

## Takeaway

Monotonic Stack is not a single algorithm but a family of observations. Once the stack invariant is identified, many seemingly unrelated problems can be solved in linear time using the same underlying pattern.
