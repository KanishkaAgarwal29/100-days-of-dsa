# Day 40 – Variable Sliding Window

## Problems Solved

1. Fruit Into Baskets
2. Longest Substring Without Repeating Characters
3. Max Consecutive Ones III
4. Longest Repeating Character Replacement

---

## Approach

### Fruit Into Baskets

* Maintained a window containing at most two fruit types.
* Used a HashMap to track frequencies.
* Shrunk the window whenever more than two types appeared.

### Longest Substring Without Repeating Characters

* Maintained character frequencies inside the current window.
* Shrunk the window whenever a duplicate character appeared.
* Tracked the maximum valid window length.

### Max Consecutive Ones III

* Maintained a window containing at most `k` zeroes.
* Expanded and shrunk the window while preserving validity.
* Updated the maximum length of a valid window.

### Longest Repeating Character Replacement

* Tracked the frequency of characters inside the window.
* Maintained the maximum frequency seen so far.
* Shrunk the window whenever the number of required replacements exceeded `k`.

---

## Time Complexity

| Problem                                        | Complexity |
| ---------------------------------------------- | ---------- |
| Fruit Into Baskets                             | O(n)       |
| Longest Substring Without Repeating Characters | O(n)       |
| Max Consecutive Ones III                       | O(n)       |
| Longest Repeating Character Replacement        | O(n)       |

---

## Key Learning

Today marked the transition from Fixed Sliding Window to Variable Sliding Window.

The most important observation was understanding when a window becomes invalid and how to restore validity by moving the left pointer.

Although the problems looked different, they followed the same core pattern:

* Expand the window
* Check validity
* Shrink when required
* Update the answer

---

## Patterns Practiced

* Variable Size Sliding Window
* HashMap Frequency Tracking
* Character Frequency Counting
* Window Validation
* Dynamic Expansion and Shrinking

---

## Takeaway

The hardest part of variable sliding window problems is identifying the condition that makes the window invalid. Once that condition is clear, the implementation becomes much easier and a large family of interview questions can be solved using the same pattern.
