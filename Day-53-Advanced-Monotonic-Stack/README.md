# 🚀 Day 53 – Advanced Monotonic Stack

## Problems Solved

1. Sum of Total Strength of Wizards

---

## Approach

### Sum of Total Strength of Wizards

- Extended the Contribution Technique learned from Sum of Subarray Minimums.
- Used a monotonic stack to determine Previous Smaller and Next Smaller boundaries for every element.
- Leveraged prefix sums and prefix-of-prefix sums to efficiently compute the contribution of every wizard as the minimum element across all valid subarrays.
- Combined contribution counting with range sum calculations to achieve an optimal solution.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Sum of Total Strength of Wizards | O(n) | O(n) |

---

## Key Learning

Today's problem demonstrated how multiple concepts can be combined to solve a difficult problem efficiently. The monotonic stack identifies contribution boundaries, while prefix sums eliminate repeated range sum calculations. This reinforced the importance of understanding patterns deeply rather than memorizing implementations.

---

## Patterns Practiced

- Monotonic Stack
- Contribution Technique
- Prefix Sum
- Prefix of Prefix Sum
- Boundary Computation

---

## Takeaway

Many hard problems are simply combinations of previously learned patterns. Once the underlying observations become clear, even seemingly complex problems can be broken down into manageable components and solved in linear time.
