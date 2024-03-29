//ButterflyStarPattern
package Patterns;

import java.util.Scanner;

public class ButterflyStarPattern 
{
    public static void printPattern(int n)
    {
        int i , j ;
        
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=i;j++)
           {
            System.out.print("*");
           }
           for(j=1;j<=(n-i);j++)
           {
            System.out.print(" ");
           }
           for(j=2;j<=n-i;j++)
           {
            System.out.print(" ");
           }
           for(j=1;j<=i;j++)
           {
            System.out.print("*");
           }
           
           

            System.out.println();
        }
        for(i=n;i>=1;i--)
        {
           for(j=1;j<=i;j++)
           {
            System.out.print("*");
           }
           for(j=1;j<=(n-i);j++)
           {
            System.out.print(" ");
           }
           for(j=2;j<=n-i;j++)
           {
            System.out.print(" ");
           }
           for(j=1;j<=i;j++)
           {
            System.out.print("*");
           }
           
           

            System.out.println();
        }

    }

    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // int n = sc.nextInt();
        printPattern(7);
    }
    
}


 // from geeksforgeeks.
// for (i = 1; i <= n; i++) {
//     // inner loop to print stars
//     for (j = 1; j <= i; j++) {
//         System.out.print("*");
//     }


   
//     // inner loop to print spaces
//     int spaces = 2 * (n - i);
//     for (j = 1; j <= spaces; j++) {
//         System.out.print(" ");
//     }

//     // inner loop to print stars
//     for (j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     System.out.println();
// }

// // outer loop to handle lower part
// for (i = n; i >= 1; i--) {
//     // inner loop to print stars
//     for (j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     // inner loop to print spaces
//     int spaces = 2 * (n - i);
//     for (j = 1; j <= spaces; j++) {
//         System.out.print(" ");
//     }

//     // inner loop to print stars
//     for (j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     System.out.println();
// }

