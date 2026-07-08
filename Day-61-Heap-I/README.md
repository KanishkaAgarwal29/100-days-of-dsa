# 🚀 Day 61 – Heap I

## Problems Solved

1. Kth Largest Element in an Array
2. Kth Largest Element in a Stream
3. Last Stone Weight
4. K Closest Points to Origin

---

## Approach

### 1. Kth Largest Element in an Array

- Maintained a min heap of size `k`.
- Added every element into the heap.
- Removed the smallest element whenever the heap size exceeded `k`.
- The heap's top represented the kth largest element.

---

### 2. Kth Largest Element in a Stream

- Used a min heap that always stored the `k` largest elements seen so far.
- For every new element, inserted it into the heap.
- Removed the smallest element if the heap size became greater than `k`.
- The root of the heap always represented the current kth largest element.

---

### 3. Last Stone Weight

- Used a max heap to repeatedly extract the two heaviest stones.
- If their weights were different, inserted the remaining difference back into the heap.
- Continued until at most one stone remained.

---

### 4. K Closest Points to Origin

- Calculated the squared distance of every point from the origin.
- Maintained a max heap of size `k`.
- Removed the farthest point whenever the heap exceeded size `k`.
- The remaining points in the heap formed the answer.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Kth Largest Element in an Array | O(n log k) | O(k) |
| Kth Largest Element in a Stream | O(log k) per operation | O(k) |
| Last Stone Weight | O(n log n) | O(n) |
| K Closest Points to Origin | O(n log k) | O(k) |

---

## Key Learning

Today's session introduced the core idea behind heaps: maintaining only the most relevant elements instead of processing the entire dataset repeatedly. Whether tracking the kth largest element, simulating stone collisions, or finding the closest points, the heap efficiently preserved the required candidates at every step.

---

## Patterns Practiced

- Min Heap
- Max Heap
- Heap of Fixed Size
- Custom Comparator
- Stream Processing

---

## Takeaway

A heap is most useful when the problem asks for repeatedly accessing the smallest or largest element while the data keeps changing. Instead of sorting everything again, the heap maintains the required order efficiently.
