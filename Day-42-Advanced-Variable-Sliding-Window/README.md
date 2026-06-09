# Day 42 – Advanced Variable Sliding Window

## Problems Solved

1. Binary Subarrays With Sum
2. Subarrays With K Distinct Integers
3. Maximum Points You Can Obtain from Cards
4. Longest Substring With K Unique Characters

---

## Approach

### Binary Subarrays With Sum

* Solved using the **AtMost(K) − AtMost(K−1)** technique.
* Counted subarrays having at most `goal` ones and derived the exact count.
* Reinforced the counting-based Sliding Window pattern.

### Subarrays With K Distinct Integers

* Maintained frequencies using a HashMap.
* Counted subarrays with at most `k` distinct integers.
* Applied the **Exactly(K) = AtMost(K) − AtMost(K−1)** formula.

### Maximum Points You Can Obtain from Cards

* Considered the problem from the opposite perspective.
* Found the minimum sum subarray of length `n-k`.
* Calculated the answer as:

  **Total Sum − Minimum Window Sum**

### Longest Substring With K Unique Characters

* Maintained character frequencies using a HashMap.
* Expanded and shrank the window to keep exactly `k` unique characters.
* Updated the maximum valid window length whenever the condition was satisfied.

---

## Time Complexity

| Problem                                    | Complexity |
| ------------------------------------------ | ---------- |
| Binary Subarrays With Sum                  | O(n)       |
| Subarrays With K Distinct Integers         | O(n)       |
| Maximum Points You Can Obtain from Cards   | O(n)       |
| Longest Substring With K Unique Characters | O(n)       |

---

## Key Learning

Today's practice focused on advanced applications of Variable Sliding Window.

The most important takeaway was that many "Exactly K" problems can be simplified using the **AtMost(K) − AtMost(K−1)** approach. Another interesting observation was solving an endpoint selection problem by finding the minimum middle window, showing that changing the perspective often leads to a simpler solution.

---

## Patterns Practiced

* Exactly K Technique
* At Most K Technique
* HashMap Frequency Tracking
* Complement Window Technique
* Counting Subarrays
* Variable Sliding Window

---

## Takeaway

Variable Sliding Window is much more than maintaining a valid window. It can be combined with frequency maps and counting techniques to solve complex substring and subarray problems efficiently in linear time, making it one of the most versatile interview patterns.
