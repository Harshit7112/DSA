package arrays;

import java.util.Scanner;

public class Max_elem_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int j=0;j<5;j++)
        {
            if(max<arr[j])
            {
                max=arr[j];
            }


        }
        System.out.println(max);
    }
}
