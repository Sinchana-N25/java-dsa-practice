import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid=0,low=0,guess=0;
        int[]n=new int[10];
        System.out.println("Enter 10 numbers in ascending order:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
            System.out.print(n[i]+" ");
        }
        System.out.println("Enter the number you want to find:");
        int item=sc.nextInt();
        int high=n.length-1;
        boolean found=false;
        while (low<=high)
        {
            mid=(low+high)/2;
            guess=n[mid];
            if (guess<item)
            {
                low=mid+1;
            }
            else if (guess>item) {
                high=mid-1;
            }
            else {
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println("Your number is in this position (index): " + mid);
        } else {
            System.out.println("Number not in list!");
        }
    }
}
