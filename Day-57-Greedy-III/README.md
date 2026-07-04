# Day 57 - Greedy III

## Problems Solved

1. Minimum Number of Arrows to Burst Balloons
2. Maximum Units on a Truck
3. Candy
4. Queue Reconstruction by Height

---

## Approach

### 1. Minimum Number of Arrows to Burst Balloons

- Sort the balloons by their ending coordinates.
- Shoot an arrow at the end of the first balloon.
- Continue bursting all overlapping balloons with the same arrow.
- Fire a new arrow only when the next balloon starts beyond the current arrow position.

### 2. Maximum Units on a Truck

- Sort box types in descending order of units per box.
- Always pick boxes with the highest units first.
- Load as many boxes as possible until the truck reaches its capacity.

### 3. Candy

- Traverse from left to right to satisfy the left neighbor condition.
- Traverse from right to left to satisfy the right neighbor condition.
- Assign each child the maximum candies required from both traversals.

### 4. Queue Reconstruction by Height

- Sort people by decreasing height.
- If two people have the same height, sort them by increasing k value.
- Insert each person at index k.
- Since taller people are placed first, every insertion maintains the required order.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Minimum Number of Arrows to Burst Balloons | O(n log n) | O(1) |
| Maximum Units on a Truck | O(n log n) | O(1) |
| Candy | O(n) | O(n) |
| Queue Reconstruction by Height | O(n²) | O(n) |

---

## Key Learning

- Interval problems often become simple after sorting by the ending coordinate.
- Greedy algorithms rely on making the best local decision at every step.
- Some problems require satisfying constraints from multiple directions, as seen in Candy.
- Sorting combined with controlled insertion can efficiently reconstruct complex arrangements.

---

## Patterns Practiced

- Interval Greedy
- Sorting + Greedy
- Two-Pass Greedy
- Greedy with List Insertion

---

## Takeaway

Today's problems reinforced that identifying the correct greedy observation is far more important than memorizing an algorithm. Once the right ordering or decision rule is found, the implementation naturally becomes simpler and more intuitive.
