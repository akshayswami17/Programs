package Patterns;

import java.util.Scanner;

public class SquareHollowPattern 
{
    public static void printPattern(int n)
    {
            int i,j;
        for(i=0 ; i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");// It print '*' at according to condition.
                }
                else
                {
                    System.out.print(" ");// And print space other places.

                }

            }
            System.out.println();
    }

      

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        printPattern(n);
    }
    
    
}
