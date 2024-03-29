//RhombusPattern



package Patterns;

import java.util.Scanner;

public class RhombusPattern 
{
    public static void printPattern(int n)
    {
        int i , j ;
        
        for(i=1;i<=n;i++)
        {
            for(j=0;j<=(n-i);j++)
            {
                System.out.print(" ");

            }
            for(j=0;j<n;j++)
            {
                System.out.print("*");
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



