package Numbers.Array.CheckValueInArray;
//CheckValueInArrayUsingList.containsMethod
import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckValueInArrayUsingBinarySearchMethod 
{

    public static void checkValueInArray(int arr[] , int value)
    {
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr,value);
        boolean test = result >= 0? true : false;
        System.out.println("Is "+value+" present in array: "+test);

        

    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println();
        checkValueInArray(arr, 45);
        
    }
    
}
