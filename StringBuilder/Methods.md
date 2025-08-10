| Method                     | Description                                                      | Example                                |
| -------------------------- | ---------------------------------------------------------------- | -------------------------------------- |
| `append(value)`            | Adds text or char(s) to the end                                  | `sb.append("World");` → `"HelloWorld"` |
| `insert(index, value)`     | Inserts text at a specific position                              | `sb.insert(5, " Java");`               |
| `delete(start, end)`       | Removes characters from `start` (inclusive) to `end` (exclusive) | `sb.delete(0, 5);`                     |
| `deleteCharAt(index)`      | Removes a single char at given index                             | `sb.deleteCharAt(2);`                  |
| `replace(start, end, str)` | Replaces characters in range with new string                     | `sb.replace(0, 5, "Hi");`              |
| `reverse()`                | Reverses the characters in the builder                           | `sb.reverse();`                        |
| `charAt(index)`            | Gets the character at the given index                            | `char c = sb.charAt(0);`               |
| `setCharAt(index, ch)`     | Changes the char at given index                                  | `sb.setCharAt(0, 'H');`                |
| `length()`                 | Returns number of characters                                     | `int len = sb.length();`               |
| `capacity()`               | Returns buffer capacity (not length)                             | `int cap = sb.capacity();`             |
| `setLength(newLength)`     | Changes the length (truncates or pads with `\u0000`)             | `sb.setLength(3);`                     |
| `toString()`               | Converts to a `String`                                           | `String str = sb.toString();`          |
