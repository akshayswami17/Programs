package DSA;

public class BubbleSort 
{
    public BubbleSort(int arr[],int n)
    {
        int i,j,temp;
        boolean swapped;
        for( i=0;i<n-1;i++)
        {
            swapped = false;
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // swap with adjecent elements. i.e. arr[j] with arr[j+1].
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }
            }
            if(swapped==false){ break;} // if no elements were swapped by inner loop , then break.
        }
    }

     // Function to print an array
     public static void printArray(int arr[], int size)
     {
         int i;
         System.out.println("Sorted array is :");
        System.out.print("[");
         for (i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
             System.out.print("]");
             System.out.println();
     }

     public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 , 100 };
        int n = arr.length;
        BubbleSort b = new BubbleSort(arr,n);
        printArray(arr, n);
     }
    
}
