// arrayReverse by swping elements.
package Array.ArrayReverse;

public class ArrayReverseUsingALoop 
{
    public static void arrayReverse(int arr[])
    {
        int start = 0 ;
        int end   = arr.length-1;
       while(start < end)
       {
        int temp   = arr[start];
        arr[start] = arr[end];
        arr[end]   = temp;
        start++; end--;

       }
       for(int a : arr){System.out.print(a+",");}
    }
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5,6};
        
        for(int a : originalArr){System.out.print(a+",");}
        System.out.println();
        arrayReverse(originalArr);
    }
    
}
