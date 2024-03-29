package Patterns;

import java.util.Scanner;

public class NumberChangingPyramid 
{
    public static void printPattern(int n)
    {
        int i , j ,num=1;
        
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
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
