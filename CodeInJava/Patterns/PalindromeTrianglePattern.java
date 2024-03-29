


package Patterns;

import java.util.Scanner;

public class PalindromeTrianglePattern 
{
    public static void printPattern(int n)
    {
        int i , j ;
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j+" ");
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


