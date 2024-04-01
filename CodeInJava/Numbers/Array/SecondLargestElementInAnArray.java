package Numbers.Array;

public class SecondLargestElementInAnArray 
{
    private static int secondLargestElementInAnArray(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
           
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(secondLargestElementInAnArray(arr));
    }
}
