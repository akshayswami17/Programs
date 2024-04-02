package Numbers.Array.ArrayReverse;

public class ArrayReverseRecursion 
{
    public static void arrayReverse(int arr[] , int start , int end)
    {
        
       if(start >= end){ return;}
        int temp   = arr[start];
        arr[start] = arr[end];
        arr[end]   = temp;
        arrayReverse(arr, start+1, end-1);

       
       
    }
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5,6};
        
        for(int a : originalArr){System.out.print(a+",");}
        System.out.println();
        arrayReverse(originalArr,0,5);
        for(int a : originalArr){System.out.print(a+",");}
    }
    
}

// Original Array: 1, 2, 3, 4, 5, 6
// Start: 0, End: 5
// - Swapping arr[0] (1) with arr[5] (6): 6, 2, 3, 4, 5, 1
// - Recursive call with start=1 and end=4
//   Start: 1, End: 4
//   - Swapping arr[1] (2) with arr[4] (5): 6, 5, 3, 4, 2, 1
//   - Recursive call with start=2 and end=3
//     Start: 2, End: 3
//     - Swapping arr[2] (3) with arr[3] (4): 6, 5, 4, 3, 2, 1
//     - Base case reached (start >= end), return
// - Reversing completed: 6, 5, 4, 3, 2, 1
