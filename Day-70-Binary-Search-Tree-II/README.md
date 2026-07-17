# 🌳 Day 70 – Binary Search Trees II

## Problems Solved

1. Delete Node in a BST
2. Binary Search Tree Iterator
3. Two Sum IV – Input is a BST
4. Minimum Absolute Difference in BST

---

## Approach

### 1. Delete Node in a BST

- Located the target node while preserving BST properties.
- Handled all deletion scenarios including leaf nodes, nodes with one child, and nodes with two children.
- Used the inorder successor to maintain the BST structure after deletion.

---

### 2. Binary Search Tree Iterator

- Constructed the iterator using inorder traversal.
- Returned elements in ascending order through the iterator interface.
- Explored how inorder traversal naturally produces the sorted sequence of a BST.

---

### 3. Two Sum IV – Input is a BST

- Traversed the tree while storing visited values in a HashSet.
- Checked whether the complement required to reach the target already existed.
- Returned immediately when a valid pair was found.

---

### 4. Minimum Absolute Difference in BST

- Performed an inorder traversal to visit nodes in sorted order.
- Compared each node with the previously visited node.
- Updated the minimum absolute difference throughout the traversal.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Delete Node in a BST | O(h) | O(h) |
| Binary Search Tree Iterator | O(n) | O(n) |
| Two Sum IV – Input is a BST | O(n) | O(n) |
| Minimum Absolute Difference in BST | O(n) | O(h) |

> `h` = Height of the tree.

---

## Key Learning

Today's problems demonstrated how the Binary Search Tree property simplifies many operations. Whether deleting nodes, iterating through elements in sorted order, searching for value pairs, or comparing adjacent elements, leveraging inorder traversal and BST ordering leads to clean and efficient solutions.

---

## Patterns Practiced

- Binary Search Tree
- Inorder Traversal
- DFS
- HashSet
- Tree Modification
- Iterator Design

---

## Takeaway

Understanding the ordered nature of Binary Search Trees makes complex operations much easier. Many BST problems ultimately rely on inorder traversal and the guarantees provided by the BST property.
