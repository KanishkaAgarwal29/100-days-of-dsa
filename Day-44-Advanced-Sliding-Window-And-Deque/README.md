# Day 44 – Advanced Sliding Window and Deque

## Problems Solved

1. Longest Continuous Subarray With Absolute Difference Less Than or Equal to Limit
2. Frequency of the Most Frequent Element
3. Take K of Each Character From Left and Right
4. Minimum Window Substring

---

## Approach

### Longest Continuous Subarray With Absolute Difference Less Than or Equal to Limit

* Maintained the maximum and minimum elements of the current window using two Monotonic Deques.
* Expanded the window while preserving validity.
* Shrunk the window whenever the absolute difference exceeded the given limit.

### Frequency of the Most Frequent Element

* Sorted the array before applying Sliding Window.
* Maintained the sum of elements inside the window.
* Calculated the operations required to make every element equal to the largest element in the window.

### Take K of Each Character From Left and Right

* Solved using the Complement Sliding Window technique.
* Instead of selecting characters from both ends, found the longest valid middle substring that could be kept.
* Computed the final answer using the remaining characters.

### Minimum Window Substring

* Used two frequency arrays to track required and current character counts.
* Expanded the window until all required characters were included.
* Shrunk the window greedily to obtain the minimum valid substring.

---

## Time Complexity

| Problem                                                      | Complexity |
| ------------------------------------------------------------ | ---------- |
| Longest Continuous Subarray With Absolute Difference ≤ Limit | O(n)       |
| Frequency of the Most Frequent Element                       | O(n log n) |
| Take K of Each Character From Left and Right                 | O(n)       |
| Minimum Window Substring                                     | O(n)       |

---

## Key Learning

Today's problems highlighted that Sliding Window is not limited to maintaining a simple range. Depending on the problem, it can be combined with sorting, Monotonic Deques, frequency counting, or complement-based thinking to derive efficient linear or near-linear solutions.

---

## Patterns Practiced

* Monotonic Deque
* Complement Sliding Window
* Minimum Valid Window
* Sliding Window + Sorting
* Frequency Tracking
* Variable Sliding Window

---

## Takeaway

The biggest lesson from today's practice was that identifying what the window should represent is often more important than implementing the window itself. Once the correct interpretation is found, many hard problems reduce to a standard Sliding Window framework.
