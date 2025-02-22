package arrays;

public class lastOccurence_of_elem_04 {
    public static void main(String[] args) {
        int[] arr={5,6,5,3,5,4};
        int x=5;
        System.out.println(occur(arr,x));
    }
    public static int occur(int[] arr,int x)
    { int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                index=i;
            }
        }
        return index;
    }
}
