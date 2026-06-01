# Day 34 – Greedy, Sorting and Boundary Problems

## Problems Solved
1. 4Sum
2. Partition Labels
3. Bag of Tokens
4. Successful Pairs of Spells and Potions

## Approach

### 1. 4Sum
- Extended the 3Sum pattern by fixing two elements and using two pointers.
- Applied sorting and duplicate handling to avoid repeated quadruplets.

### 2. Partition Labels
- Tracked the last occurrence of each character.
- Expanded the current partition boundary until all characters in the partition were fully covered.

### 3. Bag of Tokens
- Used sorting and a greedy strategy.
- Played the smallest token face up to gain score and the largest token face down to regain power when needed.

### 4. Successful Pairs of Spells and Potions
- Sorted the potions array.
- Used binary search to find the first valid potion for each spell.
- Counted all successful pairs from that boundary onward.

## Time Complexity

| Problem | Complexity |
|----------|------------|
| 4Sum | O(n³) |
| Partition Labels | O(n) |
| Bag of Tokens | O(n log n) |
| Successful Pairs of Spells and Potions | O(m log m + n log m) |

## Key Learning

Today's problems highlighted the importance of identifying boundaries in sorted data and making optimal decisions using greedy techniques.

Instead of checking every possible combination, sorting and boundary-based reasoning helped reduce unnecessary computations and led to more efficient solutions.

## Patterns Practiced

- Sorting
- Two Pointers
- Greedy
- Binary Search
- Boundary Finding
- Interval Expansion

## Takeaway

Not every optimization problem uses the same pattern. Some require greedy decisions, some rely on binary search, while others benefit from sorting and boundary tracking. Learning when to apply each technique is becoming just as important as learning the techniques themselves.
