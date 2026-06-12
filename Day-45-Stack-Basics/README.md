# Day 45 – Stack Basics

## Problems Solved

1. Remove Outermost Parentheses
2. Crawler Log Folder
3. Check If Word Is Valid After Substitutions
4. Minimum Number of Swaps to Make the String Balanced

---

## Approach

### Remove Outermost Parentheses

* Used the nesting depth instead of an explicit stack.
* Ignored the outermost opening and closing parentheses of each primitive.
* Constructed the final answer while traversing the string once.

### Crawler Log Folder

* Simulated folder navigation using a simple depth counter.
* Increased depth when entering a folder.
* Decreased depth when moving to the parent directory while ensuring it never became negative.

### Check If Word Is Valid After Substitutions

* Used a StringBuilder as a stack.
* Whenever a 'c' was encountered, verified that the previous two characters formed "ab".
* Removed valid patterns immediately to validate the entire string.

### Minimum Number of Swaps to Make the String Balanced

* Tracked the running balance of brackets while traversing the string.
* Recorded the maximum imbalance using the minimum prefix balance.
* Derived the minimum swaps required from the imbalance observation.

---

## Time Complexity

| Problem                                             | Complexity |
| --------------------------------------------------- | ---------- |
| Remove Outermost Parentheses                        | O(n)       |
| Crawler Log Folder                                  | O(n)       |
| Check If Word Is Valid After Substitutions          | O(n)       |
| Minimum Number of Swaps to Make the String Balanced | O(n)       |

---

## Key Learning

Today's practice showed that many Stack problems do not always require an explicit stack. In several cases, the same logic can be implemented using counters or StringBuilder while preserving the Last-In-First-Out behaviour, resulting in simpler and more efficient solutions.

---

## Patterns Practiced

* Stack Simulation
* Parentheses Processing
* StringBuilder as Stack
* Balance Tracking
* Prefix Observation

---

## Takeaway

The most valuable lesson today was learning to identify when a Stack is actually required and when the same behaviour can be simulated using a simpler data structure. Developing these observations leads to cleaner and more optimized solutions.
