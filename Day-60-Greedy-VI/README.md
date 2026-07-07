# 🚀 Day 60 – Greedy VI

## Problems Solved

1. Longest Happy String
2. Split Array into Consecutive Subsequences
3. Longest Palindrome
4. Bag of Tokens

---

## Approach

### 1. Longest Happy String

- Used a max heap to always select the character with the highest remaining frequency.
- Prevented three consecutive identical characters by temporarily choosing the next best character whenever necessary.
- Reinserted characters with remaining frequency back into the heap.

---

### 2. Split Array into Consecutive Subsequences

- Maintained two hash maps:
  - Frequency map to track unused numbers.
  - End map to track subsequences ending at a particular value.
- Always preferred extending an existing subsequence.
- Started a new subsequence only when extending was impossible and the next two consecutive numbers were available.

---

### 3. Longest Palindrome

- Counted the frequency of every character.
- Used all possible character pairs.
- Added one extra character in the center if any odd frequency existed.

---

### 4. Bag of Tokens

- Sorted the token values.
- Used two pointers.
- Spent power on the smallest token to gain score.
- Whenever power became insufficient, traded one score for the largest remaining token to regain power.

---

## Time Complexity

| Problem | Time | Space |
|----------|------|-------|
| Longest Happy String | O(n log 3) ≈ O(n) | O(1) |
| Split Array into Consecutive Subsequences | O(n) | O(n) |
| Longest Palindrome | O(n) | O(1) |
| Bag of Tokens | O(n log n) | O(1) |

---

## Key Learning

Today's problems highlighted how Greedy often works together with supporting data structures such as heaps, hash maps, sorting, and two pointers. The implementation differed across problems, but the core idea remained the same—make the locally optimal decision while ensuring it doesn't prevent the global optimum.

---

## Patterns Practiced

- Greedy + Max Heap
- Greedy + HashMap
- Frequency-based Greedy
- Two Pointer Greedy

---

## Takeaway

A strong Greedy solution comes from identifying the invariant that always remains optimal. Once that observation is established, the implementation usually becomes straightforward.
