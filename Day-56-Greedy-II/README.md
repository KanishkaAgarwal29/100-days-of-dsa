# 🚀 Day 56 – Greedy II

## Problems Solved

1. Gas Station
2. Lemonade Change
3. Can Place Flowers
4. Two City Scheduling

---

## Approach

### 1. Gas Station

- Maintained the current fuel tank while traversing all stations.
- Whenever the tank became negative, reset the starting station to the next index since none of the previous stations could be valid starting points.
- Verified feasibility using the total remaining fuel.

---

### 2. Lemonade Change

- Kept track of available \$5 and \$10 bills.
- Always prioritized giving one \$10 and one \$5 as change for a \$20 bill whenever possible.
- Preserving \$5 bills ensures greater flexibility for future customers.

---

### 3. Can Place Flowers

- Traversed the flowerbed while checking only the immediate neighboring plots.
- Planted a flower whenever both adjacent positions were empty.
- Skipped the next position after planting since adjacent flowers are not allowed.

---

### 4. Two City Scheduling

- Sorted people based on the cost difference between sending them to City A and City B.
- Assigned the first half to one city and the remaining half to the other.
- This greedy ordering minimizes the total travel cost.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Gas Station | O(n) | O(1) |
| Lemonade Change | O(n) | O(1) |
| Can Place Flowers | O(n) | O(1) |
| Two City Scheduling | O(n log n) | O(1) |

---

## Key Learning

Today's session highlighted that Greedy algorithms are driven by observations rather than fixed templates. Some problems required resetting the solution when a condition failed, others focused on preserving resources for the future, while sorting based on the impact of each decision led to the optimal solution. Understanding *why* a greedy choice is safe is the most important part of solving these problems.

---

## Patterns Practiced

- Greedy Observation
- Resource Management
- Local Optimal Choice
- Sorting-based Greedy
- Simulation

---

## Takeaway

A Greedy algorithm succeeds only when every local decision can be proven to contribute toward the global optimum. Building this intuition is far more valuable than memorizing individual implementations.
