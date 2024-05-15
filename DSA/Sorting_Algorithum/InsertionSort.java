class  InsertionSort1
{
    void sort(int arr[])
    {
        int size = arr.length;
        for(int i=1 ; i< size ; ++i)
        {
            int key = arr[i];
            int j = i-1 ;
            while( j >= 0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
    
    static void printArray(int arr[])
    {
        int size = arr.length;
        for(int i = 0 ;i<size ;++i)
        {
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    
    
}
public class InsertionSort
{
    public static void main(String[] args)
    {
        int arr[] = {12,43,11,5,33,95,2};
        InsertionSort1 is = new InsertionSort1();
        is.sort(arr);
        is.printArray(arr);
    }
}
