| Feature                         | HashSet                            | LinkedHashSet                                | TreeSet                                        |
| ------------------------------- | ---------------------------------- | -------------------------------------------- | ---------------------------------------------- |
| Order                           | Unordered                          | Maintains **insertion order**                | Maintains **sorted order** (natural or custom) |
| Underlying DS                   | Hash table                         | Hash table + linked list                     | Red-Black Tree                                 |
| Duplicates                      | Not allowed                        | Not allowed                                  | Not allowed                                    |
| Null Elements                   | Allows one `null`                  | Allows one `null`                            | Does not allow `null`                          |
| Performance (add/search/remove) | O(1) average, O(n) worst           | O(1) average, O(n) worst                     | O(log n)                                       |
| When to Use                     | Fast lookups, order doesn't matter | Need fast lookups + preserve insertion order | Need sorted set of elements                    |
