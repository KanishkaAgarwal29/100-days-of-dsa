# 🚀 Day 90 – Graphs (Multi-Source BFS & Graph Coloring)

Today I explored two important Graph patterns. The first problem introduced Multi-Source BFS on a grid, while the second focused on graph coloring using DFS to determine whether a graph is bipartite.

## 📌 Problems Solved

1. Rotting Oranges
2. Is Graph Bipartite?

---

### 1. Rotting Oranges
Used Multi-Source BFS by starting the traversal from all initially rotten oranges simultaneously. The solution simulated the spread of rot level by level while tracking the minimum time required to infect all reachable fresh oranges.

### 2. Is Graph Bipartite?
Applied Depth First Search (DFS) with two-coloring to verify whether adjacent vertices can be assigned different colors. This problem introduced graph coloring, an important concept used in many graph algorithms.

---

## 🧠 Key Concepts

- Multi-Source BFS
- Graph Coloring
- Depth First Search (DFS)
- Breadth First Search (BFS)
- Queue
- Adjacency List Representation

---

## 💡 Key Learning

Today's problems introduced two completely different graph patterns. Multi-Source BFS demonstrated how multiple starting points can be processed simultaneously, while graph coloring showed how DFS can be used to validate graph properties instead of simply traversing nodes.

---

## 📊 Complexity

| Problem | Time | Space |
|----------|------|-------|
| Rotting Oranges | O(m × n) | O(m × n) |
| Is Graph Bipartite? | O(V + E) | O(V) |

---

## 🎯 Takeaway

Graph problems are built on a few fundamental traversal patterns. Learning when to use BFS, Multi-Source BFS, or DFS with graph coloring makes solving more advanced graph questions much more intuitive.

**90 Days Completed! 🚀**
