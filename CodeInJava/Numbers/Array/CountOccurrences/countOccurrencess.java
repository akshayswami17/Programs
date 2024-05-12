package Array.CountOccurrences;

import java.util.ArrayList;
import java.util.Collections;

public class countOccurrencess 
{
    private static int countOccurrences(ArrayList<Integer> clist , int x)
    {
        return Collections.frequency(clist,x);
        
    }
    public static void main(String[] args) 
    {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x = 2;
        ArrayList<Integer> clist = new ArrayList<>();
        for(int i : arr){clist.add(i);}
        System.out.println(x + " occurs "
                           + countOccurrences(clist, x)
                           + " times");
    }

    
    
}
