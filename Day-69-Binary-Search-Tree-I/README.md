# 🌳 Day 69 – Binary Search Trees I

## Problems Solved

1. Validate Binary Search Tree
2. Kth Smallest Element in a BST
3. Search in a Binary Search Tree
4. Insert into a Binary Search Tree

---

## Approach

### 1. Validate Binary Search Tree

- Used recursion with lower and upper bounds.
- Ensured every node satisfied the BST property by remaining within the valid range.
- Updated the allowed range while traversing left and right subtrees.

---

### 2. Kth Smallest Element in a BST

- Performed an inorder traversal of the BST.
- Counted nodes as they were visited.
- Returned the value of the kth visited node.

---

### 3. Search in a Binary Search Tree

- Leveraged the BST property to decide whether to move left or right.
- Continued recursively until the target node was found or the search reached a null node.

---

### 4. Insert into a Binary Search Tree

- Traversed the BST according to the value being inserted.
- Located the appropriate null position.
- Inserted the new node while preserving the BST structure.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Validate Binary Search Tree | O(n) | O(h) |
| Kth Smallest Element in a BST | O(n) | O(h) |
| Search in a BST | O(h) | O(h) |
| Insert into a BST | O(h) | O(h) |

> `h` = Height of the tree.

---

## Key Learning

Today's problems reinforced the most important property of Binary Search Trees: the inorder traversal produces values in sorted order. Understanding this property simplifies many BST operations such as searching, insertion, validation, and finding ordered elements.

---

## Patterns Practiced

- Binary Search Tree
- Inorder Traversal
- DFS
- Recursive Search
- Range Validation

---

## Takeaway

BST problems become much easier once their ordering property is fully utilized. Rather than traversing every node blindly, the tree's structure helps eliminate unnecessary work and leads to efficient solutions.
