//1. Iterative Method (Brute Force Method)
package Array.LargestElementInAnArray;

public class LargestElementInAnArray 
{
    private static int largestElementInAnArray(Integer arr[])
    {
        int max = arr[0];
        // int Secondmax = arr[0];
        for(int i=1 ; i<arr.length ; i++)
        {
            if(max< arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer arr [] = {1,2,3,4,5,6,7,8,9,10};// Use wrapper datatypes to use list funcationlitys.
        System.out.println(largestElementInAnArray(arr));
        
        
    }
}
