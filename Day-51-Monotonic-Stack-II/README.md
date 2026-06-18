# 🚀 Day 51 – Monotonic Stack II

## Problems Solved

1. Largest Rectangle in Histogram
2. Sum of Subarray Minimums
3. Sum of Subarray Ranges
4. Maximum Width Ramp

---

## Approach

### 1. Largest Rectangle in Histogram

- Computed Previous Smaller and Next Smaller indices using a monotonic increasing stack.
- Calculated the maximum rectangle for every bar using:
  - Width = Next Smaller − Previous Smaller − 1
  - Area = Width × Height

---

### 2. Sum of Subarray Minimums

- Used the Contribution Technique instead of generating every subarray.
- Computed Previous Smaller and Next Smaller boundaries.
- Every element contributes:

Contribution = Value × Left Choices × Right Choices

---

### 3. Sum of Subarray Ranges

- Extended the contribution idea.
- Computed total contribution as maximum and minimum separately.
- Final Answer:

Sum of Maximum Contributions − Sum of Minimum Contributions

---

### 4. Maximum Width Ramp

- Built a monotonic decreasing stack of candidate starting indices.
- Traversed from right to left to find the farthest valid ending index.
- Maximized the width greedily.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Largest Rectangle in Histogram | O(n) | O(n) |
| Sum of Subarray Minimums | O(n) | O(n) |
| Sum of Subarray Ranges | O(n) | O(n) |
| Maximum Width Ramp | O(n) | O(n) |

---

## Key Learning

Today's biggest learning was the **Contribution Technique**.

Instead of asking:

> "What is the answer for every subarray?"

I learned to think:

> "How many subarrays consider this element as their minimum or maximum?"

Using Previous and Next Smaller/Greater boundaries, each element independently contributes to the final answer, transforming many O(n²) problems into elegant O(n) solutions.

---

## Patterns Practiced

- Previous Smaller Element
- Next Smaller Element
- Previous Greater Element
- Next Greater Element
- Contribution Technique
- Monotonic Increasing Stack
- Monotonic Decreasing Stack

---

## Takeaway

Monotonic stacks are much more than Next Greater Element problems. Their true strength lies in determining contribution boundaries, making complex interval-based problems significantly simpler and more efficient.
