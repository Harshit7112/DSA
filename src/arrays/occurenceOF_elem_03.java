package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class occurenceOF_elem_03 {
    public static void main(String[] args) {
        int[] arr={1,2,4,2,1,44,5,3};
        int x=2;
        System.out.println(occurences(arr,x));




    }
    public static int occurences(int[] arr,int x)
    { int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;

            }
        }
        return count;
    }
}
