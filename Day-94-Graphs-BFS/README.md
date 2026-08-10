# 🚀 Day 94 – Graphs (BFS)

Today I continued practicing BFS with problems based on graph connectivity and shortest paths.

## 📌 Problems Solved

1. Keys and Rooms
2. Nearest Exit from Entrance in Maze

---

### 1. Keys and Rooms
Used BFS starting from room `0` and explored every room whose key was available. A visited array was used to avoid processing the same room multiple times. If all rooms were visited, the answer is true.

### 2. Nearest Exit from Entrance in Maze
Used BFS starting from the entrance of the maze. Each valid neighbouring cell increases the distance by one. Since BFS explores cells level by level, the first boundary cell reached is the nearest exit.

---

## 🧠 Key Concepts

- Breadth First Search (BFS)
- Graph Connectivity
- Shortest Path
- Queue
- Visited Array
- Grid Traversal
- Distance Tracking

---

## 💡 Key Learning

Today's problems showed two common applications of BFS.

The first problem used BFS to determine whether every node in a graph is reachable from the starting node.

The second problem used BFS to find the shortest path from an entrance to the nearest boundary cell in a maze.

The core pattern remains:

**Queue → Visit → Explore Neighbours → Continue Level by Level**

---

## 📊 Complexity

### Keys and Rooms
- Time: O(V + E)
- Space: O(V)

### Nearest Exit from Entrance in Maze
- Time: O(m × n)
- Space: O(m × n)

---

## 🎯 Takeaway

BFS is useful not only for shortest-path problems but also for checking connectivity and reachability in graphs.

**94 Days Completed! 🚀**
