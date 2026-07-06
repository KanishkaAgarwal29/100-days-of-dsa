# 🚀 Day 59 – Greedy V

## Problems Solved

1. Furthest Building You Can Reach
2. Task Scheduler
3. Maximize Sum of Array After K Negations
4. Minimum Subsequence in Non-Increasing Order

---

## Approach

### 1. Furthest Building You Can Reach

- Used bricks for every climb initially.
- Tracked all brick usages using a priority queue.
- Whenever bricks became insufficient, replaced the largest brick usage with a ladder to maximize the reachable distance.

---

### 2. Task Scheduler

- Counted the frequency of each task.
- Used the highest frequency task to determine the minimum schedule length.
- Filled idle slots with the remaining tasks whenever possible.

---

### 3. Maximize Sum of Array After K Negations

- Sorted the array.
- Flipped negative values first since they provide the maximum increase in the overall sum.
- If an odd number of operations remained, flipped the smallest absolute value.

---

### 4. Minimum Subsequence in Non-Increasing Order

- Sorted the array in descending order.
- Kept selecting the largest elements until their sum became strictly greater than the sum of the remaining elements.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Furthest Building You Can Reach | O(n log n) | O(n) |
| Task Scheduler | O(n) | O(1) |
| Maximize Sum of Array After K Negations | O(n log n) | O(1) |
| Minimum Subsequence in Non-Increasing Order | O(n log n) | O(1) |

---

## Key Learning

Today's problems demonstrated how Greedy can work alongside different techniques such as heaps, frequency analysis, and sorting. The common idea was to make the most beneficial decision at each step while preserving future opportunities. Choosing the right local action often transformed complex-looking problems into efficient solutions.

---

## Patterns Practiced

- Greedy + Heap
- Frequency-based Greedy
- Sorting + Greedy
- Observation-based Greedy

---

## Takeaway

The strength of Greedy lies in proving that a locally optimal choice remains globally optimal. Understanding that proof is more valuable than memorizing the implementation.
