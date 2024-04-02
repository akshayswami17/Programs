package Numbers.Array.ArrayReverse;

public class ArrayReverseUsingAnExtraArray 
{
    public static void arrayReverse(int arr[])
    {
        int revArr[] = new int[arr.length];
        for(int i=0 ;i<arr.length;i++)
        {
            revArr[i] = arr[arr.length-i-1];
        }
        for(int a : revArr){System.out.print(a+",");}
    }
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        
        for(int a : originalArr){System.out.print(a+",");}
        System.out.println();
        arrayReverse(originalArr);
    }
    
}
