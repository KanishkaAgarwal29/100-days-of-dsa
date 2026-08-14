# 🚀 Day 98 – Graphs: Topological Sort Applications

Today I practiced applying directed graph and topological sort concepts to real problems.

## 📌 Problems Solved

1. Course Schedule
2. Find Eventual Safe States

---

### 1. Course Schedule
Used DFS-based cycle detection with a visited array and a recursion-path array. A valid course ordering is possible only when the prerequisite graph contains no cycle.

### 2. Find Eventual Safe States
Used a reverse graph with outdegree tracking and BFS. Terminal nodes are considered safe, and their predecessors become safe when all their outgoing paths eventually lead to safe nodes.

---

## 🧠 Key Concepts

- Directed Graph
- DFS
- BFS
- Cycle Detection
- Recursion Stack
- Topological Sort
- Reverse Graph
- Outdegree
- Kahn's Algorithm

---

## 💡 Key Learning

Today's problems showed how the same directed-graph concepts can be solved using different approaches.

Course Schedule uses DFS-based cycle detection, while Eventual Safe States can be efficiently solved using a reverse graph and BFS-based topological processing.

---

## 📊 Complexity

### Course Schedule
- Time: O(V + E)
- Space: O(V + E)

### Eventual Safe States
- Time: O(V + E)
- Space: O(V + E)

---

## 🎯 Takeaway

Today's practice strengthened my understanding of directed graphs, cycle detection, and topological sorting while seeing how these concepts are applied to different problems.

**98 Days Completed! 🚀**
