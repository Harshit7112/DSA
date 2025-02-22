package arrays;

public class Sorted_or_not_06 {
    public static void main(String[] args) {
        int[] arr={1,2,4,22,3};
        System.out.println(sort(arr));

    }
    public static boolean sort(int[] arr)
    {
        boolean check=true;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                check=false;
                break;
            }
        }
        return check;
    }
}
