# 🚀 Day 76 – Advanced Binary Tree Problems

Today I solved 2 problems focused on recursion, DFS, backtracking, and depth-based tree analysis.

## 📌 Problems Solved

### 1️⃣ Pseudo-Palindromic Paths in a Binary Tree
- Used DFS with frequency tracking.
- Maintained the count of numbers with odd frequencies along the current root-to-leaf path.
- Used backtracking to restore the frequency state after exploring each path.

### 2️⃣ Lowest Common Ancestor of Deepest Leaves
- Used a postorder DFS approach.
- For every subtree, returned both the deepest height and the LCA of the deepest leaves.
- Compared the heights of the left and right subtrees to determine the answer.

---

## 🧠 Key Learnings

- Backtracking with frequency tracking
- Root-to-leaf path processing
- Postorder DFS
- Returning multiple pieces of information from recursion
- Combining depth calculation with LCA logic

---

## 📊 Complexity

| Problem | Time Complexity | Space Complexity |
|---|---|---|
| Pseudo-Palindromic Paths | O(n) | O(h) |
| Lowest Common Ancestor of Deepest Leaves | O(n) | O(h) |

> `h` = height of the tree.

---

## 💡 Takeaway

Today's problems reinforced how recursion can carry additional state through a tree. Whether tracking path frequencies or returning subtree depth along with an answer, the right recursive state can simplify complex Binary Tree problems.

**76 days completed! 🚀**
