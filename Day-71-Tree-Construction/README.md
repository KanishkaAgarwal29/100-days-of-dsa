# 🌳 Day 71 – Tree Construction & Recursive Tree Building

## Problems Solved

1. Construct Binary Tree from Preorder and Inorder Traversal
2. Construct Binary Tree from Inorder and Postorder Traversal
3. Construct Binary Search Tree from Preorder Traversal
4. Flip Equivalent Binary Trees

---

## Key Concepts

- Recursion
- Divide and Conquer
- Binary Tree Construction
- Binary Search Tree Properties
- HashMap for O(1) Index Lookup
- Recursive Tree Comparison

---

## Approaches

### 1. Construct Binary Tree from Preorder and Inorder Traversal

- The first element of preorder is the root.
- The root's position in inorder separates the left and right subtrees.
- Used a HashMap to find the root index efficiently.
- Recursively constructed both subtrees.

### 2. Construct Binary Tree from Inorder and Postorder Traversal

- The last element of postorder is the root.
- The root's position in inorder divides the tree into left and right subtrees.
- Recursively constructed the subtrees using their respective ranges.

### 3. Construct BST from Preorder Traversal

- Used the BST property to determine valid ranges for each node.
- Maintained a shared preorder index.
- Used upper bounds to decide whether a value belongs to the current subtree.

### 4. Flip Equivalent Binary Trees

- Compared the values of corresponding nodes.
- Recursively checked both:
  - Normal child arrangement
  - Flipped child arrangement
- The trees are flip equivalent if either arrangement matches.

---

## Time and Space Complexity

| Problem | Time | Space |
|---|---|---|
| Preorder + Inorder Construction | O(n) | O(n) |
| Inorder + Postorder Construction | O(n) | O(n) |
| BST from Preorder | O(n) | O(h) |
| Flip Equivalent Trees | O(n) | O(h) |

> `h` = height of the tree.

---

## Key Learning

Tree construction problems rely heavily on understanding how different traversal orders reveal the root and divide the tree into subtrees. Combining traversal properties with recursion makes it possible to reconstruct entire trees efficiently.

---

## Takeaway

Today's problems strengthened recursive thinking and showed how preorder, inorder, and postorder traversals can be used not only to traverse trees but also to reconstruct them. The BST problem further demonstrated how structural properties can eliminate the need for additional traversal arrays.
