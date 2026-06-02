# Day 35 – String Hashing and Pattern Matching

## Problems Solved
1. Determine if Two Strings Are Close
2. Find and Replace Pattern
3. Longest Palindrome
4. Find Common Characters

## Approach

### 1. Determine if Two Strings Are Close
- Count character frequencies in both strings.
- Verify that both strings contain the same set of characters.
- Compare the frequency distributions after sorting.

### 2. Find and Replace Pattern
- Used character mapping to maintain a one-to-one relationship between the word and the pattern.
- Verified consistency of mappings throughout the string.

### 3. Longest Palindrome
- Counted character frequencies.
- Used all even frequency characters completely.
- Allowed one odd frequency character to act as the center of the palindrome.

### 4. Find Common Characters
- Stored frequencies of the first word.
- Intersected frequencies with every other word using minimum counts.
- Constructed the answer using the remaining common frequencies.

## Time Complexity

| Problem | Complexity |
|----------|------------|
| Determine if Two Strings Are Close | O(n + 26 log 26) |
| Find and Replace Pattern | O(n × m) |
| Longest Palindrome | O(n) |
| Find Common Characters | O(n × k) |

## Key Learning

Today's focus was on understanding how character frequencies and mappings can reveal hidden relationships between strings.

Instead of comparing strings directly, frequency distributions and character mappings often provide a more efficient and intuitive solution.

## Patterns Practiced

- Frequency Arrays
- Character Mapping
- String Hashing
- Pattern Matching
- Frequency Intersection

## Takeaway

Many string problems become significantly easier once the right information is tracked. Character frequencies and mappings often capture the essence of the problem better than direct string comparisons.
