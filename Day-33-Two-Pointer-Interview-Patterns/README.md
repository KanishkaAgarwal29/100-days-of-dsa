# Day 33 – Two Pointer Interview Patterns

## Problems Solved
1. 3Sum
2. 3Sum Closest
3. Valid Triangle Number
4. Count Pairs Whose Sum is Less than Target

## Approach
- Applied the "fix one element + two pointers" pattern
- Practiced search-space reduction on sorted arrays
- Learned counting-based two pointer techniques
- Used pointer movement to efficiently find exact, closest, and valid combinations

## Time Complexity
- Most solutions run in O(n²)
- Sorting contributes O(n log n)

## Key Learning
Today's problems showed how the same two pointer pattern can be adapted for different goals: finding exact answers, finding the closest answer, and counting valid combinations.

A major insight was understanding bulk counting. In some sorted-array problems, when one pair satisfies the condition, multiple pairs become valid automatically, allowing us to count them together instead of checking each pair individually.

## Patterns Practiced
- Fix One Element + Two Pointers
- Closest Sum Search
- Counting with Two Pointers
- Sorted Array Optimization
- Search Space Reduction

## Takeaway
Two pointers is not just a traversal technique. Once the array is sorted, pointer movement can be used to eliminate large portions of the search space and even count multiple valid answers in a single step.
