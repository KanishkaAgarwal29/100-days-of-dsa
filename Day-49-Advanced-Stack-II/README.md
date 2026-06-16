# Day 49 – Advanced Stack & Simulation

## Problems Solved

1. Remove All Adjacent Duplicates in String II
2. Parsing A Boolean Expression
3. Number of Students Unable to Eat Lunch
4. Determine if String Halves Are Alike

---

## Approach

### Remove All Adjacent Duplicates in String II

* Used a stack of `(character, frequency)` pairs.
* Increased frequency for consecutive characters.
* Removed the pair whenever its frequency reached `k`.
* Reconstructed the final string from the remaining stack.

### Parsing A Boolean Expression

* Simulated expression evaluation using a stack.
* Processed sub-expressions whenever a closing bracket was encountered.
* Combined results according to the logical operator to obtain the final answer.

### Number of Students Unable to Eat Lunch

* Simulated the queue of students and sandwich distribution process.
* Used counting/observation to avoid unnecessary rotations and terminate when no further student could eat.

### Determine if String Halves Are Alike

* Counted vowels in both halves of the string.
* Compared the counts to determine whether both halves were alike.

---

## Time Complexity

| Problem                                     | Complexity |
| ------------------------------------------- | ---------- |
| Remove All Adjacent Duplicates in String II | O(n)       |
| Parsing A Boolean Expression                | O(n)       |
| Number of Students Unable to Eat Lunch      | O(n)       |
| Determine if String Halves Are Alike        | O(n)       |

---

## Key Learning

Today's problems highlighted that stacks are useful not only for storing elements but also for maintaining additional information such as frequencies and intermediate states. Along with stack-based thinking, simulation and observation helped simplify problems that initially appeared more complex than they actually were.

---

## Patterns Practiced

* Stack + Frequency
* Expression Parsing
* Simulation
* Counting Technique
* String Processing

---

## Takeaway

Choosing the right information to maintain during traversal often eliminates unnecessary computation. A combination of stack intuition and simple observations can lead to clean and efficient solutions.
