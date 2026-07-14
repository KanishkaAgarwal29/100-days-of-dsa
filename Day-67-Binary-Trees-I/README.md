# 🌳 Day 67 – Binary Trees I

## Problems Solved

1. Sum of Left Leaves
2. Subtree of Another Tree
3. Sum Root to Leaf Numbers
4. Count Good Nodes in Binary Tree

---

## Approach

### 1. Sum of Left Leaves

- Traversed the tree using DFS.
- Identified left leaf nodes by checking whether the left child existed and had no children.
- Accumulated their values while recursively visiting the remaining nodes.

---

### 2. Subtree of Another Tree

- Compared two trees recursively to check if they were identical.
- If the current subtree did not match, recursively searched the left and right subtrees.
- Combined tree traversal with tree comparison.

---

### 3. Sum Root to Leaf Numbers

- Performed DFS while maintaining the number formed along the current root-to-leaf path.
- Updated the number at each node by appending the current digit.
- Added the completed number when a leaf node was reached.

---

### 4. Count Good Nodes in Binary Tree

- Traversed the tree while carrying the maximum value seen from the root.
- Counted a node whenever its value was greater than or equal to the maximum encountered so far.
- Updated the maximum before exploring child nodes.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Sum of Left Leaves | O(n) | O(h) |
| Subtree of Another Tree | O(n × m) | O(h) |
| Sum Root to Leaf Numbers | O(n) | O(h) |
| Count Good Nodes in Binary Tree | O(n) | O(h) |

> `h` = Height of the tree.

---

## Key Learning

Today's problems strengthened recursive tree traversal by carrying information through recursive calls. Whether tracking the maximum value, building numbers along a path, or comparing entire subtrees, recursion became a powerful tool for solving different types of tree problems.

---

## Patterns Practiced

- Depth First Search (DFS)
- Tree Recursion
- Carrying State in Recursion
- Tree Comparison
- Root-to-Leaf Traversal

---

## Takeaway

Many binary tree problems follow the same recursive structure. Once the appropriate information is passed between recursive calls, diverse problems such as path calculations, subtree matching, and node counting become much easier to solve.
