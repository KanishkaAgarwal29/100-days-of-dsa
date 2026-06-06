# Day 39 – Fixed Window and Sorted Window

## Problems Solved

1. Contains Duplicate II
2. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
3. Minimum Difference Between Highest and Lowest of K Scores
4. Find K Closest Elements

---

## Approach

### Contains Duplicate II

* Used a HashSet to maintain a sliding window of valid indices.
* Removed elements that moved out of the allowed distance.

### Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

* Maintained a fixed-size sliding window.
* Updated the running sum while moving the window.

### Minimum Difference Between Highest and Lowest of K Scores

* Sorted the array first.
* Compared every window of size `k` to find the minimum difference.

### Find K Closest Elements

* Used binary search/two pointers to identify the best contiguous window of size `k`.
* Returned the closest elements in sorted order.

---

## Time Complexity

| Problem                        | Complexity   |
| ------------------------------ | ------------ |
| Contains Duplicate II          | O(n)         |
| Number of Sub-arrays of Size K | O(n)         |
| Minimum Difference of K Scores | O(n log n)   |
| Find K Closest Elements        | O(log n + k) |

---

## Key Learning

Today's problems reinforced the idea that many array problems become much simpler after identifying whether they require a fixed-size window, a sorted window, or a combination of searching and window expansion.

Recognizing the underlying pattern is often more important than memorizing the solution.
