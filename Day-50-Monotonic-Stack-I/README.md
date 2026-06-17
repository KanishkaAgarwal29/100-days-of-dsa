# Day 50 – Monotonic Stack I

## Problems Solved

1. Daily Temperatures
2. Next Greater Element II
3. Number of Visible People in a Queue
4. Online Stock Span

---

## Approach

### Daily Temperatures

* Used a monotonic decreasing stack of indices.
* Removed all temperatures that could never become the next warmer day.
* The nearest greater temperature on the right determined the answer.

### Next Greater Element II

* Extended the traversal to two passes to simulate a circular array.
* Maintained a monotonic decreasing stack to efficiently find the next greater element.

### Number of Visible People in a Queue

* Traversed from right to left while maintaining a monotonic decreasing stack.
* Counted every shorter person popped from the stack.
* Counted the first taller person remaining in the stack, as it is also visible.

### Online Stock Span

* Applied the Previous Greater Element concept.
* Stored indices of previous greater prices and calculated span using distance from the nearest greater element.
* Achieved an optimal amortized O(1) solution.

---

## Time Complexity

| Problem                             | Complexity               |
| ----------------------------------- | ------------------------ |
| Daily Temperatures                  | O(n)                     |
| Next Greater Element II             | O(n)                     |
| Number of Visible People in a Queue | O(n)                     |
| Online Stock Span                   | O(1) amortized per query |

---

## Key Learning

Today's practice strengthened my understanding of the Monotonic Stack pattern. The biggest observation was that instead of storing every element, maintaining a stack with a specific ordering allows each element to be pushed and popped at most once, leading to linear-time solutions.

---

## Patterns Practiced

* Monotonic Decreasing Stack
* Next Greater Element
* Previous Greater Element
* Circular Array Processing
* Stack-based Observation

---

## Takeaway

The power of a monotonic stack lies in maintaining useful candidates while discarding unnecessary ones. Once the invariant is identified, many seemingly difficult problems become elegant O(n) solutions.
