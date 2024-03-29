//ZeroOneTrianglePattern


package Patterns;

import java.util.Scanner;

public class ZeroOneTrianglePattern 
{
    public static void printPattern(int n)
    {
        int i , j ,num=1;
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
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

