# 🚀 Day 54 – Advanced Monotonic Stack

## Problems Solved

1. Maximum Subarray Min-Product
2. 132 Pattern

---

## Approach

### 1. Maximum Subarray Min-Product

- Used Previous Smaller and Next Smaller boundaries to determine the largest range where an element remains the minimum.
- Applied Prefix Sum to calculate the sum of elements within that range in O(1).
- Computed the min-product as:

Minimum Element × Subarray Sum

- Tracked the maximum min-product across all possible subarrays.

---

### 2. 132 Pattern

- Traversed the array from right to left.
- Used a monotonic stack to maintain potential candidates for the '3' element.
- Maintained a separate variable representing the best possible '2'.
- Checked whether the current element could act as the '1' in a valid 132 pattern.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Maximum Subarray Min-Product | O(n) | O(n) |
| 132 Pattern | O(n) | O(n) |

---

## Key Learning

Today's problems demonstrated two very different applications of Monotonic Stack. One focused on contribution and range expansion using boundaries, while the other relied heavily on observation and maintaining valid candidates during traversal. This reinforced the idea that Monotonic Stack is a versatile pattern rather than a single fixed technique.

---

## Patterns Practiced

- Previous Smaller Element
- Next Smaller Element
- Prefix Sum
- Contribution Technique
- Monotonic Stack
- Observation-Based Stack Problems

---

## Takeaway

Many advanced stack problems become manageable once the correct invariant is identified. The challenge is rarely the implementation; it is recognizing what information the stack should maintain throughout the traversal.
