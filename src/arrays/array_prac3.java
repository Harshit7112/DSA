package arrays;
import java.util.*;
public class array_prac3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];

         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         rev(arr);
        System.out.print(Arrays.toString(arr));

    }
    public static void rev(int[] arr)
    {
        int f=0;
        int l=arr.length-1;
        while(f<l)
        {
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
    }
}
