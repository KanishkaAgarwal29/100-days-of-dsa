# Day 36 – String Mapping and Frequency

## Problems Solved

1. Buddy Strings
2. Word Subsets
3. Bulls and Cows
4. Print Anagrams Together

---

## Approach

### Buddy Strings
- Checked whether two strings can become equal after exactly one swap.
- Handled the special case where both strings are already equal using duplicate character detection.

### Word Subsets
- Computed the maximum frequency requirement for each character across all words in words2.
- Verified whether each word in words1 satisfied those requirements.

### Bulls and Cows
- Counted total matching digits using frequency tracking.
- Counted bulls separately and derived cows from total matches.

### Print Anagrams Together
- Created a frequency signature for each word.
- Grouped words having the same frequency signature using a HashMap.

---

## Time Complexity

| Problem | Complexity |
|----------|------------|
| Buddy Strings | O(n) |
| Word Subsets | O(total characters) |
| Bulls and Cows | O(n) |
| Print Anagrams Together | O(n × k) |

where:
- n = number of words / string length
- k = average word length

---

## Key Learning

Today's problems focused on representing strings through frequencies, mappings, and signatures rather than direct comparison.

Many seemingly different string problems become simpler once the correct representation of characters is identified.

---

## Patterns Practiced

- Frequency Arrays
- Character Mapping
- HashMap Grouping
- String Signatures
- Frequency Aggregation

---

## Takeaway

A recurring theme today was transforming strings into a more useful representation. Whether it was grouping anagrams, validating swaps, checking universal words, or counting matches, frequency-based thinking led to efficient solutions.
