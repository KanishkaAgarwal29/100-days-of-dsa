# 🚀 Day 97 – Graphs: Directed Graphs

Today I moved from undirected graphs to directed graphs and practiced cycle detection and topological sorting.

## 📌 Problems Solved

1. Detect Cycle in a Directed Graph
2. Topological Sort using DFS

---

### 1. Detect Cycle in a Directed Graph
Used DFS with both a visited array and a recursion-path array. A cycle exists when DFS reaches a node that is already present in the current recursion path.

### 2. Topological Sort using DFS
Used DFS to explore the directed graph and stored each node after processing all its neighbours. Reversing the resulting order gives the topological ordering.

---

## 🧠 Key Concepts

- Directed Graph
- DFS
- Cycle Detection
- Recursion Stack
- Topological Sort
- DAG
- Adjacency List

---

## 💡 Key Learning

Cycle detection in directed graphs is different from undirected graphs.

Instead of tracking only the parent, we need to know whether a visited node is still present in the current DFS path.

Topological sorting is possible only for a Directed Acyclic Graph (DAG).

---

## 📊 Complexity

For both problems:

- Time: O(V + E)
- Space: O(V + E)

---

## 🎯 Takeaway

Today I learned two important directed-graph concepts: detecting cycles using recursion-path tracking and generating a topological ordering using DFS.

**97 Days Completed! 🚀**
