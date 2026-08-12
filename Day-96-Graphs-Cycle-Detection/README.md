# 🚀 Day 96 – Graphs: Cycle Detection

Today I practiced cycle detection in an undirected graph using both BFS and DFS.

## 📌 Problems Solved

1. Detect Cycle in an Undirected Graph using BFS
2. Detect Cycle in an Undirected Graph using DFS

---

### 1. Cycle Detection using BFS
Built an adjacency list and used BFS with a queue storing each node along with its parent. If a visited neighbour is found that is not the current node's parent, a cycle exists.

### 2. Cycle Detection using DFS
Applied the same parent-tracking idea using recursive DFS. Each node keeps track of the vertex from which it was reached. Encountering an already visited neighbour other than the parent indicates a cycle.

---

## 🧠 Key Concepts

- Undirected Graph
- Cycle Detection
- BFS
- DFS
- Parent Tracking
- Adjacency List
- Visited Array
- Disconnected Graphs

---

## 💡 Key Learning

For an undirected graph, a visited neighbour does not always mean a cycle because one neighbour can simply be the parent of the current node.

A cycle is detected when a visited neighbour is found that is different from the current node's parent.

The same logic can be implemented using both BFS and DFS.

---

## 📊 Complexity

For both approaches:

- Time: O(V + E)
- Space: O(V + E)

---

## 🎯 Takeaway

Today I learned how to detect cycles in an undirected graph using both BFS and DFS and understood the importance of parent tracking.

**96 Days Completed! 🚀**
