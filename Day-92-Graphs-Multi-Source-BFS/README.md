# 🚀 Day 92 – Graphs (Multi-Source BFS)

Today I focused on Multi-Source BFS, an important graph traversal pattern where multiple starting points are added to the queue simultaneously.

## 📌 Problems Solved

1. 01 Matrix
2. As Far from Land as Possible

---

### 1. 01 Matrix
Used Multi-Source BFS by treating every `0` as a source node. The BFS then expands simultaneously from all zero cells to calculate the shortest distance to the nearest zero for every cell.

### 2. As Far from Land as Possible
Applied the same Multi-Source BFS pattern by treating all land cells as starting points. BFS expands outward through water cells, allowing the maximum distance from land to be determined.

---

## 🧠 Key Concepts

- Multi-Source BFS
- Shortest Distance
- Grid Traversal
- Queue
- Level-by-Level Traversal
- Four-Directional Movement
- Distance Tracking

---

## 💡 Key Learning

Today's problems showed how the same BFS structure can solve different shortest-distance problems.

Instead of starting BFS from a single cell, all relevant source cells are inserted into the queue initially. This allows the traversal to expand simultaneously and ensures that cells are reached using their shortest possible distance.

---

## 📊 Complexity

| Problem | Time | Space |
|----------|------|-------|
| 01 Matrix | O(m × n) | O(m × n) |
| As Far from Land as Possible | O(m × n) | O(m × n) |

---

## 🎯 Takeaway

Multi-Source BFS is a powerful extension of normal BFS and is especially useful for grid problems involving minimum distances, spreading processes, and multiple starting points.

**92 Days Completed! 🚀**
