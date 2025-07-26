public class sum_arrayelems {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i];
        }
        System.out.println("Sum of array elements:"+total);
    }
}
