| Feature            | Map (e.g., HashMap)                                    | Set (e.g., HashSet)                                     |
| ------------------ | ------------------------------------------------------ | ------------------------------------------------------- |
| Purpose            | Stores **key-value pairs**                             | Stores **unique values** only                           |
| Keys               | Must be unique                                         | Not applicable                                          |
| Values             | Can be duplicated                                      | Not applicable                                          |
| Duplicates Allowed | Keys: No<br>Values: Yes                                | No (all elements must be unique)                        |
| Access             | Retrieve value by key                                  | Check if a value exists                                 |
| When to Use        | Need to associate data with a key                      | Only care about existence/uniqueness                    |
| Order Guarantee    | Depends on implementation (unordered, ordered, sorted) | Depends on implementation (unordered, ordered, sorted)  |
| Typical Problems   | Frequency counting, key-value mapping, caching         | Duplicate detection, membership check, visited tracking |
| Examples           | HashMap, LinkedHashMap, TreeMap                        | HashSet, LinkedHashSet, TreeSet                         |
