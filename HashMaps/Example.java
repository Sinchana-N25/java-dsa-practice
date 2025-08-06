package HashMaps;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            mp.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }
        System.out.println();
        sc.close();
    }
}

//Sample Input      Sample Output:
// 6                0 1 2 3 4 5
// 213512345
// 1234123
// 1000000000
// 987987435
// 134604389
// 23
