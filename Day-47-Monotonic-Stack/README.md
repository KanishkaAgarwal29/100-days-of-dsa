# Day 47 – Monotonic Stack

## Problems Solved

1. Asteroid Collision
2. Remove K Digits
3. Minimum Remove to Make Valid Parentheses
4. Celebrity Problem

---

## Approach

### Asteroid Collision

* Simulated collisions using a stack.
* Processed collisions only when a right-moving asteroid met a left-moving asteroid.
* Removed smaller asteroids until the collision was resolved.

### Remove K Digits

* Applied a greedy strategy using a monotonic increasing stack.
* Removed previous larger digits whenever a smaller digit appeared and removals were available.
* Removed remaining digits from the end and handled leading zeroes.

### Minimum Remove to Make Valid Parentheses

* Stored indices of unmatched parentheses in a stack.
* Reconstructed the final string by skipping invalid indices.
* Produced the minimum valid expression in linear time.

### Celebrity Problem

* Used the elimination principle with a stack to reduce multiple candidates to one possible celebrity.
* Verified the final candidate by checking that they know nobody and everyone knows them.

---

## Time Complexity

| Problem                                  | Complexity |
| ---------------------------------------- | ---------- |
| Asteroid Collision                       | O(n)       |
| Remove K Digits                          | O(n)       |
| Minimum Remove to Make Valid Parentheses | O(n)       |
| Celebrity Problem                        | O(n)       |

---

## Key Learning

Today's problems showed that Stack is not only useful for storing elements but also for maintaining order, eliminating impossible candidates, and building greedy solutions. Understanding the invariant maintained by the stack was more important than the implementation itself.

---

## Patterns Practiced

* Monotonic Stack
* Greedy + Stack
* Stack Simulation
* Parentheses Processing
* Candidate Elimination

---

## Takeaway

The biggest lesson today was learning to identify what the stack should represent. Once that invariant became clear, even seemingly difficult problems reduced to simple push-pop operations and efficient linear-time solutions.
