package Array.CheckValueInArray;

public class CheckValueInArrayUsingLinearSearchMethod 
{
    public static void checkValueInArray(int arr[] , int value)
    {
        boolean result = false;
        for(int a : arr)
        {
            if(a== value){ result = true;break; }
        }
        System.out.println(value+" is present : "+ result);

    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println();
        checkValueInArray(arr, 45);
        
    }
    
}
//
