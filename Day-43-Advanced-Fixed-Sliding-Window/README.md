# Day 43 – Advanced Fixed Sliding Window

## Problems Solved

1. Sliding Window Maximum
2. Find All Anagrams in a String
3. Maximum Number of Robots Within Budget
4. Maximum Number of Vowels in a Substring of Given Length

---

## Approach

### Sliding Window Maximum

* Used a Monotonic Deque to maintain elements in decreasing order.
* Removed indices that went out of the current window.
* The front of the deque always represented the maximum element.

### Find All Anagrams in a String

* Maintained a fixed-size window equal to the length of the pattern.
* Updated character frequencies while sliding the window.
* Compared frequencies to identify valid anagrams.

### Maximum Number of Robots Within Budget

* Maintained the maximum charge time using a Monotonic Deque.
* Tracked the running cost using a running sum.
* Shrunk the window whenever the total cost exceeded the budget.

### Maximum Number of Vowels in a Substring of Given Length

* Used a fixed-size sliding window.
* Counted vowels entering and leaving the window.
* Maintained the maximum vowel count among all windows.

---

## Time Complexity

| Problem                                                 | Complexity |
| ------------------------------------------------------- | ---------- |
| Sliding Window Maximum                                  | O(n)       |
| Find All Anagrams in a String                           | O(n)       |
| Maximum Number of Robots Within Budget                  | O(n)       |
| Maximum Number of Vowels in a Substring of Given Length | O(n)       |

---

## Key Learning

Today's practice strengthened advanced Fixed Sliding Window concepts by combining frequency tracking, Monotonic Deque, and running sum techniques. Understanding how to maintain useful information inside a fixed window without recomputing it each time significantly improves efficiency.

---

## Patterns Practiced

* Fixed Size Sliding Window
* Monotonic Deque
* Frequency Array
* Running Sum
* Queue-Based Optimization

---

## Takeaway

Advanced Fixed Sliding Window problems often require maintaining additional data structures such as deques or frequency arrays alongside the window. Choosing the right supporting data structure transforms otherwise expensive solutions into linear-time algorithms.
