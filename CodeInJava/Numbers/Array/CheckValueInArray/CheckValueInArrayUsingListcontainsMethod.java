package Array.CheckValueInArray;
//CheckValueInArrayUsingList.containsMethod
import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckValueInArrayUsingListcontainsMethod 
{

   private static void checkValueInArray(Integer []arr , int value)
   {
    boolean result = Arrays.asList(arr).contains(value);
    System.out.println("IS "+value+" present in array "+ result);
   }

    public static void main(String[] args) {
        Integer arr [] = {1,2,3,4,5,6,7,8,9,10};// Use wrapper datatypes to use list funcationlitys.
        System.out.println();
        checkValueInArray(arr, 7);
        
    }
    
}
