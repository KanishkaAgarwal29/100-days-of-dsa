# 🚀 Day 95 – Graphs

Today I practiced different graph patterns including connected components, graph structure observation, and degree-based problems.

## 📌 Problems Solved

1. Connected Components
2. Find Center of Star Graph
3. Find the Town Judge

---

### 1. Connected Components
Built an adjacency list for the undirected graph and used DFS to explore every connected component. Each unvisited vertex starts a new DFS traversal and represents a new component.

### 2. Find Center of Star Graph
Used the structure of a star graph to identify the center by comparing the first two edges. The common vertex between them must be the center.

### 3. Find the Town Judge
Used in-degree and out-degree information to identify the person trusted by everyone but who trusts nobody. The judge must have `n - 1` incoming trust relationships and zero outgoing relationships.

---

## 🧠 Key Concepts

- Graph Representation
- Adjacency List
- DFS
- Connected Components
- Graph Properties
- In-degree and Out-degree
- Graph Observation

---

## 💡 Key Learning

Today's problems showed that graph problems do not always require BFS or DFS.

Some problems can be solved efficiently by recognizing the structure of the graph or by tracking properties such as in-degree and out-degree.

---

## 📊 Complexity

### Connected Components
- Time: O(V + E)
- Space: O(V + E)

### Find Center of Star Graph
- Time: O(1)
- Space: O(1)

### Find the Town Judge
- Time: O(E + V)
- Space: O(V)

---

## 🎯 Takeaway

Today's practice helped me understand different ways of approaching graph problems — traversal when necessary, and direct observations or degree counting when possible.

**95 Days Completed! 🚀**
