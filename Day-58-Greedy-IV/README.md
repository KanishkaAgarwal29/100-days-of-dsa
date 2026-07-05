# 🚀 Day 58 – Greedy IV

## Problems Solved

1. Reduce Array Size to The Half
2. Maximum Bags With Full Capacity of Rocks
3. Merge Triplets to Form Target Triplet
4. Maximum Length of Pair Chain

---

## Approach

### 1. Reduce Array Size to The Half

- Counted the frequency of every distinct element.
- Prioritized removing the elements with the highest frequencies.
- Continued until at least half of the array was removed.

---

### 2. Maximum Bags With Full Capacity of Rocks

- Calculated the remaining capacity required for each bag.
- Sorted the remaining capacities in ascending order.
- Filled bags requiring the fewest additional rocks first to maximize the number of completely filled bags.

---

### 3. Merge Triplets to Form Target Triplet

- Ignored triplets containing values greater than the target.
- Used only valid triplets to progressively match each target component.
- Verified whether all three target values could be formed.

---

### 4. Maximum Length of Pair Chain

- Sorted pairs based on their ending values.
- Always selected the pair with the smallest possible ending point.
- Extended the chain whenever the next pair started after the previous pair ended.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Reduce Array Size to The Half | O(n log n) | O(n) |
| Maximum Bags With Full Capacity of Rocks | O(n log n) | O(1) |
| Merge Triplets to Form Target Triplet | O(n) | O(1) |
| Maximum Length of Pair Chain | O(n log n) | O(1) |

---

## Key Learning

Today's problems showed that Greedy is not tied to a single strategy. Depending on the problem, the optimal decision may involve prioritizing high-frequency elements, satisfying the easiest requirements first, filtering only useful candidates, or selecting intervals with the earliest finishing time. The common thread is proving that each local decision contributes to the global optimum.

---

## Patterns Practiced

- Frequency-based Greedy
- Sorting + Greedy
- Observation-based Greedy
- Interval Greedy

---

## Takeaway

A Greedy solution is correct only when every local choice can be justified mathematically. Building that intuition is far more valuable than memorizing individual implementations.
