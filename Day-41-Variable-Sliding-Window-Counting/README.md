# Day 41 – Variable Sliding Window Counting

## Problems Solved

1. Minimum Size Subarray Sum
2. Subarray Product Less Than K
3. Longest Subarray of 1's After Deleting One Element
4. Count Number of Nice Subarrays

---

## Approach

### Minimum Size Subarray Sum

* Maintained a running sum inside the current window.
* Expanded the window until the sum became greater than or equal to the target.
* Continuously shrank the window to obtain the minimum valid length.

### Subarray Product Less Than K

* Maintained the product of elements inside the window.
* Shrank the window whenever the product became greater than or equal to `k`.
* Counted all valid subarrays ending at the current index.

### Longest Subarray of 1's After Deleting One Element

* Allowed at most one zero inside the window.
* Shrank the window whenever more than one zero appeared.
* Calculated the answer after accounting for the mandatory deletion.

### Count Number of Nice Subarrays

* Counted subarrays containing exactly `k` odd numbers.

* Used the transformation:

  Exactly(k) = AtMost(k) − AtMost(k − 1)

* Applied Sliding Window to efficiently count subarrays with at most `k` odd numbers.

---

## Time Complexity

| Problem                                            | Complexity |
| -------------------------------------------------- | ---------- |
| Minimum Size Subarray Sum                          | O(n)       |
| Subarray Product Less Than K                       | O(n)       |
| Longest Subarray of 1's After Deleting One Element | O(n)       |
| Count Number of Nice Subarrays                     | O(n)       |

---

## Key Learning

Today's focus shifted from finding valid windows to counting valid subarrays.

The most important observation was that many "Exactly K" problems can be converted into two simpler "At Most K" problems. This technique helps solve counting-based Sliding Window questions efficiently in linear time.

---

## Patterns Practiced

* Minimum Length Sliding Window
* Product-Based Sliding Window
* Counting Valid Subarrays
* At Most K Technique
* Exactly K Technique

---

## Takeaway

Variable Sliding Window is not limited to finding the longest or shortest window. By combining window maintenance with counting techniques such as AtMost(K), it can also solve a large class of subarray counting problems that frequently appear in coding interviews.
