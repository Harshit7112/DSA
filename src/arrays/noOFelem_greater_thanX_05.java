package arrays;

public class noOFelem_greater_thanX_05 {
    public static void main(String[] args) {
        int[] arr={1,2,4,11,23,4};
        int x=11;
        System.out.println(greater(arr,x));
    }
    public static int greater(int[] arr,int x)
    { int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x)
            {
                count++;
            }
        }
        return count;
    }
}
