public class reverse_array {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] rev=new int[a.length];
        for (int i=0;i<a.length;i++)
        {
           rev[i]=a[a.length-1-i];
        }
        System.out.println("Reversed array:");
        for (int i=0;i<rev.length;i++)
        {
            System.out.print(rev[i]+" ");
        }
    }
}