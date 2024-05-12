package Array.ArrayReverse;

import java.util.Stack;

public class ReverseArrayUsingStack 
{
    public static void arrayReverse(int arr[])
    {
        Stack<Integer> stack = new Stack<>();
        for(int element : arr){ stack.push(element);}
        for(int i =0 ; i<arr.length;i++)
        {
            arr[i] = stack.pop();
        }        
    }

    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5,6};
        
        for(int a : originalArr){System.out.print(a+",");}
        System.out.println();
        arrayReverse(originalArr);
        for(int a : originalArr){System.out.print(a+",");}
    }
    
}
