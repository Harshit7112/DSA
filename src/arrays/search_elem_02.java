package arrays;

import java.util.Scanner;

public class search_elem_02 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        System.out.println("enter the elem");
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();

        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int k=0;k<5;k++)
        {
            if(x==arr[k])
            {
                System.out.println("index is "+k);
            }
        }
    }
}
