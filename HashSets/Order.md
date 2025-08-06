### Ordered Collection

- The order of elements is **predictable** and consistent.
- Can be based on:
  1. **Insertion order**: The order in which elements were added (e.g., LinkedHashSet, LinkedHashMap).
  2. **Sorted order**: Elements are arranged according to their natural ordering or a custom comparator (e.g., TreeSet, TreeMap).
- Examples:
  - LinkedHashSet (insertion order)
  - LinkedHashMap (insertion order)
  - TreeSet (sorted order)
  - TreeMap (sorted order)

### Unordered Collection

- The order of elements is **not guaranteed** and can change over time.
- Elements are stored based on their hash code or internal structure for efficiency.
- You should **never rely** on the order of elements when iterating.
- Examples:
  - HashSet
  - HashMap
