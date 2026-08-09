# 🚀 Day 93 – Graphs (BFS)

Today I continued practicing BFS by applying it to both grid-based and normal graph problems.

## 📌 Problems Solved

1. Shortest Path in Binary Matrix
2. Find if Path Exists in Graph

---

### 1. Shortest Path in Binary Matrix
Used BFS to find the shortest path from the top-left cell to the bottom-right cell. Since movement is allowed in 8 directions, all eight neighboring cells are explored at every step.

### 2. Find if Path Exists in Graph
Built an adjacency list for the undirected graph and used BFS to determine whether the destination node is reachable from the source node.

---

## 🧠 Key Concepts

- Breadth First Search (BFS)
- Shortest Path
- Grid Traversal
- 8-Directional Movement
- Adjacency List
- Graph Traversal
- Visited Array

---

## 💡 Key Learning

Today's problems helped strengthen the understanding of BFS in two different environments.

The first problem applied BFS to a grid for shortest-path calculation, while the second used BFS on an adjacency-list representation of a graph to check reachability.

The core BFS idea remains the same: maintain a queue, mark nodes/cells as visited, and process them level by level.

---

## 📊 Complexity

### Shortest Path in Binary Matrix
- Time: O(n²)
- Space: O(n²)

### Find if Path Exists in Graph
- Time: O(V + E)
- Space: O(V + E)

---

## 🎯 Takeaway

BFS can be adapted to both grid and graph problems by changing how neighboring states are generated.

**93 Days Completed! 🚀**
