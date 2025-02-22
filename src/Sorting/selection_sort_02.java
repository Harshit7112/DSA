package Sorting;

public class selection_sort_02 {
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        selection(arr);
        printarr(arr);


    }
    public static void selection(int[] arr)
    {

        for(int i=0;i<arr.length-1;i++)

        {
            int minpos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;


        }
    }
    public static void printarr(int[] arr)
    {
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]+" ");
        }
    }
}
