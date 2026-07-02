# 🚀 Day 55 – Greedy I

## Problems Solved

1. Jump Game
2. Jump Game II

---

## Approach

### 1. Jump Game

- Maintained the farthest index that can be reached while traversing the array.
- If the current index ever exceeded the farthest reachable position, reaching the end became impossible.
- Otherwise, continuously updated the farthest reachable index.

---

### 2. Jump Game II

- Treated each jump as expanding the current reachable range.
- Maintained the farthest position reachable from the current range.
- Whenever the current range ended, increased the jump count and extended the range to the farthest reachable position.
- This greedy approach guarantees the minimum number of jumps.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Jump Game | O(n) | O(1) |
| Jump Game II | O(n) | O(1) |

---

## Key Learning

Today's introduction to Greedy Algorithms emphasized making the best local decision while maintaining a global objective. Rather than exploring every possible path, the focus was on tracking the farthest reachable position and expanding the reachable range only when necessary. This simple observation leads to optimal linear-time solutions.

---

## Patterns Practiced

- Greedy
- Range Expansion
- Farthest Reach
- BFS-Level Greedy
- Linear Scan

---

## Takeaway

Greedy algorithms often rely on identifying the right invariant instead of evaluating every possible choice. Once the correct observation is made, many seemingly complex problems can be solved with a simple linear traversal.
