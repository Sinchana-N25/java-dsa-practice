| Feature                      | HashMap                            | LinkedHashMap                                | TreeMap                            |
| ---------------------------- | ---------------------------------- | -------------------------------------------- | ---------------------------------- |
| Order                        | Unordered                          | Maintains **insertion order**                | Maintains **sorted order** by keys |
| Underlying DS                | Hash table                         | Hash table + linked list                     | Red-Black Tree                     |
| Null Keys                    | Allows one `null` key              | Allows one `null` key                        | Does not allow `null` key          |
| Null Values                  | Allows multiple `null` values      | Allows multiple `null` values                | Allows multiple `null` values      |
| Performance (put/get/remove) | O(1) average, O(n) worst           | O(1) average, O(n) worst                     | O(log n)                           |
| When to Use                  | Fast lookups, order doesn't matter | Need fast lookups + preserve insertion order | Need sorted keys                   |
