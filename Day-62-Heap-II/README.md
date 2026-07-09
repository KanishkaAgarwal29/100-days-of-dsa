# 🚀 Day 62 – Heap II

## Problems Solved

1. Take Gifts From the Richest Pile
2. Top K Frequent Words
3. Remove Stones to Minimize the Total
4. Maximum Product After K Increments

---

## Approach

### 1. Take Gifts From the Richest Pile

- Used a max heap to always access the richest pile.
- Replaced the largest pile with the floor of its square root.
- Repeated the process `k` times before calculating the remaining total.

---

### 2. Top K Frequent Words

- Counted the frequency of each word using a hash map.
- Maintained a min heap of size `k` with a custom comparator based on frequency and lexicographical order.
- Removed the least preferred word whenever the heap exceeded size `k`.
- Reversed the extracted result to obtain the correct ordering.

---

### 3. Remove Stones to Minimize the Total

- Stored all piles in a max heap.
- Repeatedly selected the largest pile.
- Removed half of its stones and inserted the updated pile back into the heap.
- Maintained the running total throughout the process.

---

### 4. Maximum Product After K Increments

- Used a min heap to always access the smallest element.
- Incremented the minimum element `k` times.
- Calculated the final product using modular arithmetic.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Take Gifts From the Richest Pile | O((n + k) log n) | O(n) |
| Top K Frequent Words | O(n log k) | O(n) |
| Remove Stones to Minimize the Total | O((n + k) log n) | O(n) |
| Maximum Product After K Increments | O((n + k) log n) | O(n) |

---

## Key Learning

Today's problems strengthened my understanding of how heaps efficiently maintain the most important element at every step. Depending on the objective, a max heap helped repeatedly process the largest value, while a min heap ensured the smallest element was always updated first. Custom comparators further extended heap usage beyond simple integers.

---

## Patterns Practiced

- Max Heap
- Min Heap
- Fixed Size Heap
- Heap + HashMap
- Custom Comparator

---

## Takeaway

The biggest advantage of a heap is that it avoids repeatedly sorting the data. By maintaining only the required ordering, it allows efficient updates and retrievals, making many optimization problems significantly simpler.
