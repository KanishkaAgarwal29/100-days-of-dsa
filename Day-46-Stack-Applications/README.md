# Day 46 – Stack Applications

## Problems Solved

1. Score of Parentheses
2. Simplify Path
3. Validate Stack Sequences
4. Evaluate Reverse Polish Notation

---

## Approach

### Score of Parentheses

* Used a stack to maintain scores at different nesting levels.
* Computed the score based on the rules of primitive and nested parentheses.
* Combined adjacent expressions efficiently.

### Simplify Path

* Used a stack to simulate directory traversal.
* Ignored "." and empty strings while processing ".." by removing the previous valid directory.
* Constructed the canonical path from the remaining stack elements.

### Validate Stack Sequences

* Simulated the push operation using a stack.
* After every push, popped elements whenever they matched the expected popped sequence.
* Verified whether the entire sequence could be generated.

### Evaluate Reverse Polish Notation

* Used a stack to evaluate postfix expressions.
* Pushed operands onto the stack and applied operations whenever an operator appeared.
* Stored intermediate results back into the stack until the final answer remained.

---

## Time Complexity

| Problem                          | Complexity |
| -------------------------------- | ---------- |
| Score of Parentheses             | O(n)       |
| Simplify Path                    | O(n)       |
| Validate Stack Sequences         | O(n)       |
| Evaluate Reverse Polish Notation | O(n)       |

---

## Key Learning

Today's practice focused on understanding different real-world applications of Stack. Rather than using Stack only for parentheses matching, it was applied to expression evaluation, path simplification, sequence validation, and recursive score computation.

---

## Patterns Practiced

* Stack Simulation
* Expression Evaluation
* Path Processing
* Parentheses Processing
* Push-Pop Validation

---

## Takeaway

Stack is not just a data structure for storing elements—it helps maintain order, context, and history. Many problems become straightforward once the push-pop behaviour is identified correctly.
