package DSA;

public class SelectionSort 
{
    public static void sort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)// move sorted boundary.
        {
            int min_idx = i;
            for(int j =i+1 ;j<n;j++)
            {
                if(arr[j]< arr[min_idx])// find min element.
                {
                    min_idx=j;
                }
            }
            // swaping min element with at the ith (minmun index ) position .
            int temp = arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;

        }
    }

    public static void printArray(int arr[])
    {
        System.out.println("Sorted array is :");
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) 
    {
        SelectionSort s = new SelectionSort();
        int arr[] = {64,25,12,22,11,5,11,4,56,77,54}; 
        s.sort(arr);
        s.printArray(arr);
        
    }
    
}
