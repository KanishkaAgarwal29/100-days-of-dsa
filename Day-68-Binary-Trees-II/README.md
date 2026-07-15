# 🌳 Day 68 – Binary Trees II

## Problems Solved

1. Average of Levels in Binary Tree
2. Binary Tree Right Side View
3. Find Largest Value in Each Tree Row
4. Binary Tree Zigzag Level Order Traversal

---

## Approach

### 1. Average of Levels in Binary Tree

- Performed a level-order traversal using a queue.
- Calculated the sum of node values at each level.
- Computed the average by dividing the level sum by the number of nodes.

---

### 2. Binary Tree Right Side View

- Traversed the tree level by level.
- Recorded the last node visited at every level.
- Constructed the right-side view from these nodes.

---

### 3. Find Largest Value in Each Tree Row

- Used BFS to process one level at a time.
- Tracked the maximum value while visiting all nodes of the current level.
- Stored the maximum for every level.

---

### 4. Binary Tree Zigzag Level Order Traversal

- Performed standard level-order traversal.
- Alternated the insertion order for each level.
- Used index manipulation to avoid reversing the list after every level.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Average of Levels in Binary Tree | O(n) | O(n) |
| Binary Tree Right Side View | O(n) | O(n) |
| Find Largest Value in Each Tree Row | O(n) | O(n) |
| Binary Tree Zigzag Level Order Traversal | O(n) | O(n) |

---

## Key Learning

Today's problems demonstrated how a single Breadth First Search template can solve multiple variations of level-order traversal. By changing only the processing performed at each level, the same traversal can produce averages, maximum values, right-side views, and zigzag ordering.

---

## Patterns Practiced

- Breadth First Search (BFS)
- Queue
- Level Order Traversal
- Level-wise Processing

---

## Takeaway

Many binary tree interview problems are built upon the same level-order traversal pattern. Once the BFS framework is understood, different problems can often be solved by modifying only the logic applied to each level.
