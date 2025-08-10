package StringBuilder;

class Example {
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();        // empty
    StringBuilder s1 = new StringBuilder("Hello"); // with initial string
}  
}

// Notes
// Indexing is 0-based.
// .append() is chainable → sb.append("A").append("B");
// Use StringBuilder when you’re modifying strings repeatedly to avoid creating multiple string objects in memory.