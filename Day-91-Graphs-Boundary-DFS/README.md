# 🚀 Day 91 – Graphs (Boundary DFS)

Today I focused on boundary-based DFS problems. All four problems used the idea of exploring connected components from the boundary or validating regions based on their surrounding cells.

## 📌 Problems Solved

1. Surrounded Regions
2. Number of Enclaves
3. Number of Closed Islands
4. Count Sub Islands

---

### 1. Surrounded Regions
Used boundary DFS to identify all `O` cells that are connected to the boundary. These cells cannot be surrounded, so they are temporarily marked and restored after converting the remaining surrounded regions.

### 2. Number of Enclaves
Removed all land cells connected to the boundary using DFS. The remaining land cells represent enclaves that cannot reach the boundary.

### 3. Number of Closed Islands
Used boundary traversal to eliminate all land regions connected to the boundary. Every remaining unvisited land component is completely surrounded and therefore counted as a closed island.

### 4. Count Sub Islands
Traversed every island in the second grid while checking whether every corresponding cell also exists as land in the first grid. An island is counted only when the complete component is contained within the first grid's islands.

---

## 🧠 Key Concepts

- Depth First Search (DFS)
- Boundary Traversal
- Connected Components
- Grid Traversal
- Recursive Backtracking
- Temporary Marking
- Island Validation

---

## 💡 Key Learning

Today's problems demonstrated how the same DFS traversal pattern can solve several different grid problems by changing the condition being checked.

A particularly useful pattern was starting traversal from the boundary to eliminate or identify regions that are connected to the outside.

---

## 📊 Complexity

For all four problems:

- **Time:** O(m × n)
- **Space:** O(m × n) in the worst case due to recursion depth

---

## 🎯 Takeaway

Boundary-based DFS is a powerful pattern for grid problems involving enclosed regions, reachable cells, and connected components. Today's problems strengthened my ability to recognize and reuse this pattern across different problem statements.

**91 Days Completed! 🚀**
