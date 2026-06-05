# Day 38 – Sliding Window Optimization

## Problems Solved

1. Minimum Recolors to Get K Consecutive Black Blocks
2. K Radius Subarray Averages
3. Maximum Sum of Distinct Subarrays With Length K
4. Grumpy Bookstore Owner

---

## Approach

### 1. Minimum Recolors to Get K Consecutive Black Blocks
- Used a fixed-size sliding window of length k.
- Counted white blocks inside the window.
- Tracked the minimum number of recolors required.

### 2. K Radius Subarray Averages
- Maintained a fixed-size window of length 2k + 1.
- Used a running sum to calculate averages efficiently.
- Stored averages at the center index of each valid window.

### 3. Maximum Sum of Distinct Subarrays With Length K
- Combined Sliding Window with HashSet.
- Maintained a window containing only distinct elements.
- Tracked the maximum sum among all valid windows.

### 4. Grumpy Bookstore Owner
- Calculated customers already satisfied.
- Used a fixed-size window to find the maximum additional customers that could be satisfied.
- Combined base satisfaction with the best possible gain.

---

## Time Complexity

| Problem | Complexity |
|----------|------------|
| Minimum Recolors | O(n) |
| K Radius Subarray Averages | O(n) |
| Maximum Sum of Distinct Subarrays With Length K | O(n) |
| Grumpy Bookstore Owner | O(n) |

---

## Key Learning

Today's focus was on strengthening the Sliding Window pattern. Instead of recalculating values for every subarray, maintaining information inside a moving window helped achieve optimal linear-time solutions.

The session also introduced the idea of combining Sliding Window with additional data structures such as HashSet to handle distinct-element constraints.

---

## Patterns Practiced

- Fixed Size Sliding Window
- Running Sum
- Window Gain/Loss Calculation
- Sliding Window + HashSet
- Window Optimization

---

## Takeaway

Sliding Window becomes powerful when combined with the right observation. Whether tracking counts, sums, averages, or distinct elements, maintaining information while the window moves often reduces quadratic solutions to linear time.
