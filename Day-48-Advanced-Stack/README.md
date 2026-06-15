# Day 48 – Advanced Stack

## Problems Solved

1. Reverse Substrings Between Each Pair of Parentheses
2. Minimum Add to Make Parentheses Valid
3. Design Browser History
4. Longest Valid Parentheses

---

## Approach

### Reverse Substrings Between Each Pair of Parentheses

* Used a stack to store indices of opening parentheses.
* Whenever a closing parenthesis was encountered, reversed the substring between the matching pair.
* Removed all parentheses to obtain the final answer.

### Minimum Add to Make Parentheses Valid

* Simulated a stack using `StringBuilder`.
* Removed matching pairs while traversing the string.
* The remaining unmatched brackets represented the minimum insertions required.

### Design Browser History

* Implemented browser navigation using two stacks.
* One stack maintained the backward history, while the other maintained the forward history.
* Cleared forward history whenever a new page was visited.

### Longest Valid Parentheses

* Stored indices of unmatched parentheses in a stack.
* Computed the maximum valid segment by calculating gaps between invalid indices.
* Achieved linear time complexity with a simple and intuitive approach.

---

## Time Complexity

| Problem                                             | Complexity                          |
| --------------------------------------------------- | ----------------------------------- |
| Reverse Substrings Between Each Pair of Parentheses | O(n²)                               |
| Minimum Add to Make Parentheses Valid               | O(n)                                |
| Design Browser History                              | Visit: O(1), Back/Forward: O(steps) |
| Longest Valid Parentheses                           | O(n)                                |

---

## Key Learning

Today's problems demonstrated that a stack can represent much more than elements—it can store indices, history states, boundaries, and unmatched characters depending on the problem. Choosing what to store inside the stack is often the key observation behind the solution.

---

## Patterns Practiced

* Stack Simulation
* Parentheses Processing
* String Manipulation
* History Navigation
* Boundary Tracking

---

## Takeaway

A single data structure can solve a wide variety of problems when used with the right observation. Today's practice reinforced the importance of understanding what information should be maintained inside the stack rather than simply applying a template solution.
